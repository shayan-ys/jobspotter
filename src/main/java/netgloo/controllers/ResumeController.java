package netgloo.controllers;

import netgloo.models.Resume;
import netgloo.models.ResumeDao;
import netgloo.models.User;
import netgloo.models.UserDao;

import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpSession;

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
	
	
	/*@RequestMapping(value = "/apply/edit", method = RequestMethod.GET)
	public String ResumeEdit(ModelAndView modelAndView, Model model, HttpSession session,String resumeId) {
		if(resumeId!=null)
			
		
//		id = Integer.parseInt(id_str);
		System.out.println("id_int:"+ id);
		Resume resumeobj = resumeDao.findById((long) id);
		model.addAttribute("resume", resumeobj);
		return "applyEdit";
	}
	*/
	
	
	
	@RequestMapping("/viewEmployeeResume")
	public String viewEmployeeResume(HttpSession session,Model model,String id, String ownerId) {
		  
		int idInt = Integer.parseInt(id);
		Resume resume = resumeDao.findById(idInt);
		int ownerIdInt = resume.owner_id;
		User user = userDao.findById(26);
		
		model.addAttribute("user", user);
		model.addAttribute("resume", resume);
		
			System.out.println("id = "+ id);
			System.out.println("ownerId = "+ ownerId);
		    return "viewEmployeeResume";
		}
	
	@RequestMapping(value="/apply", method=RequestMethod.POST)
	public String employeeResume(HttpSession session,Model model,String jobTitle,String category,String sabeghe,String takhasos,String description,String resume_file) {
		
		//System.out.println("password="+ password);

		Resume resumeobj = null;
    	try {
    		/*byte[] bytes = name.getBytes(StandardCharsets.ISO_8859_1);
            name = new String(bytes, StandardCharsets.UTF_8);*/
            //System.out.println("name="+ name);
    		int id = 1;
    		String id_str = "1";
    		if(session.getAttribute("userId") != null)
    			id_str = session.getAttribute("userId").toString();
    		
    		System.out.println(""
    				+ ""
    				+ ""
    				+ "id_str:"+ id_str);
    		int owner_id = Integer.parseInt(id_str);
    		resumeobj = new Resume(owner_id,jobTitle,category,sabeghe,takhasos,description,resume_file,"jobSeeker");
      		resumeDao.save(resumeobj);
      		model.addAttribute("successMessage", "رزومه شما با موفقیت ثبت شد.");
    	}
    	catch (Exception ex) {
    		model.addAttribute("errorMessage", "در ثبت رزومه شما خطایی رخ داد");
    		return "Error creating the Resume: " + ex.toString();
    	}
    	//System.out.println(user.phone);
    	return "apply";
	}
	
	
	@RequestMapping(value="/applyTeamResume", method=RequestMethod.POST)
	public String teamResume(HttpSession session,Model model, ModelAndView modelandview,String sabeghe,String takhasos,String description,String resume_file) {
		//System.out.println("name="+ name);
		//System.out.println("password="+ password);

		Resume resumeobj = null;
    	try {
    		int id = 1;
    		String id_str = "1";
    		if(session.getAttribute("userId") != null)
    			id_str = session.getAttribute("userId").toString();
    		
    		System.out.println(""
    				+ ""
    				+ ""
    				+ "id_str:"+ id_str);
    		int owner_id = Integer.parseInt(id_str);
    		resumeobj = new Resume(owner_id,sabeghe,takhasos,description,resume_file,"team");
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
  
  @Autowired
  private UserDao userDao;
  

  
} // class ResumeController
