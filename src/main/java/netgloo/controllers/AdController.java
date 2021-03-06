package netgloo.controllers;

import netgloo.models.Ads;
import netgloo.models.AdsDao;
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
public class AdController {
	
	
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
	
	
	@RequestMapping("/viewHiringAdverts")
	public String viewContact(ModelAndView modelAndView, HttpSession session,Model model, String id) {
	 
		int idInt = Integer.parseInt(id);
		Ads ads = adsDao.findById(idInt);
		int ownerIdInt = ads.owner_id;
		User user = userDao.findById(ownerIdInt);
		
		model.addAttribute("user", user);
		model.addAttribute("ads", ads);
		
			System.out.println("id = "+ id);
			System.out.println("ownerId = "+ ownerIdInt);
		  
		
		
	    return "viewHiringAdverts";
	}
	
	
	@RequestMapping(value="/employersHiringAdverts", method=RequestMethod.POST)
	public String employerHiring(HttpSession session,Model model,String jobTitle,String ostan,String city,String jobType,String gender,String category,String description,String salary) {
		
		//System.out.println("password="+ password);

		Ads ads = null;
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
    		ads = new Ads(owner_id,"estekhdam",jobTitle,ostan,city,jobType,gender,category,description,salary);
      		adsDao.save(ads);
      		model.addAttribute("successMessage", "آگهی شما با موفقیت ثبت شد.");
    	}
    	catch (Exception ex) {
    		model.addAttribute("errorMessage", "در ثبت آگهی شما خطایی رخ داد");
    		return "Error creating the Ad: " + ex.toString();
    	}
    	//System.out.println(user.phone);
    	return "/employersHiringAdverts";
	}
	
	
	@RequestMapping(value="/employersOutsourceAdverts", method=RequestMethod.POST)
	public String employerOutsource(HttpSession session,Model model, ModelAndView modelandview,String jobTitle,String category,String takhasos,String deadline,String description,String salary) {
		//System.out.println("name="+ name);
		//System.out.println("password="+ password);

		Ads ads = null;
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
    		ads = new Ads(owner_id,"outsource",jobTitle,category,takhasos,deadline,description,salary);
      		adsDao.save(ads);
      		model.addAttribute("successMessage", "آگهی شما با موفقیت ثبت شد.");
    	}
    	catch (Exception ex) {
    		model.addAttribute("errorMessage", "در ثبت آگهی شما خطایی رخ داد");
    		System.out.println("Error creating the Ad: " + ex.toString());
    	}
    	//System.out.println(user.phone);
    	return "employersOutsourceAdverts";
	}
	
  @Autowired
  private AdsDao adsDao;
  
  @Autowired
  private UserDao userDao;
  

  
} // class ResumeController
