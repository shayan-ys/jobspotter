package netgloo.controllers;

import netgloo.models.Resume;
import netgloo.models.ResumeDao;
import netgloo.models.User;
import netgloo.models.UserDao;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author netgloo
 */
@Controller
public class ResumeController {
	
	

	@RequestMapping(value="/apply", method=RequestMethod.POST)
	@ResponseBody
	public String employeeResume(ModelAndView modelandview,String name, String birthDate,String gender,String jobTitle,String degree,String reshteTahsili,String sabeghe,String zamineKari,String phone_number,String email,String HowDidYouMeetUs,String description,String resume) {
		
		//System.out.println("password="+ password);

		Resume resumeobj = null;
    	try {
    		/*byte[] bytes = name.getBytes(StandardCharsets.ISO_8859_1);
            name = new String(bytes, StandardCharsets.UTF_8);*/
            System.out.println("name="+ name);
    		resumeobj = new Resume(name,birthDate,gender,jobTitle,degree,reshteTahsili,sabeghe,zamineKari,phone_number,email,HowDidYouMeetUs,description,resume);
      		resumeDao.save(resumeobj);
    	}
    	catch (Exception ex) {
    		return "Error creating the Resume: " + ex.toString();
    	}
    	//System.out.println(user.phone);
    	return "apply";
	}
	
	
	@RequestMapping(value="/applyTeamResume", method=RequestMethod.POST)
	public String teamResume(Model model, ModelAndView modelandview,String name, String teamNumber,String beginnigDate,String sabeghe,String takhasos,String zamineKari,String phone_number,String email,String HowDidYouMeetUs,String description,String resume) {
		System.out.println("name="+ name);
		//System.out.println("password="+ password);

		Resume resumeobj = null;
    	try {
    		resumeobj = new Resume(name, teamNumber, beginnigDate,sabeghe,takhasos,zamineKari,phone_number,email,HowDidYouMeetUs,description,resume);
      		resumeDao.save(resumeobj);
      		model.addAttribute("successMessage", "رزومه شما با موفقیت ثبت شد.");
    	}
    	catch (Exception ex) {
    		model.addAttribute("errorMessage", "در ثبت رزومه شما خطایی رخ داد");
    		System.out.println("Error creating the Resume: " + ex.toString());
    	}
    	//System.out.println(user.phone);
    	return "applyTeamResume";
	}
	
  @Autowired
  private ResumeDao resumeDao;
  

  
} // class ResumeController
