package netgloo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPController {

	public Model checkLogin(HttpSession session, Model model){
		String userId="false";
		String userType="false";
		  
		if(session.getAttribute("userId") == null)
			session.setAttribute("userId", "false");
		if(session.getAttribute("userType")==null)
			session.setAttribute("userType", "false");
		
		userId = session.getAttribute("userId").toString();
		userType = session.getAttribute("userType").toString();
		
		  System.out.println("userId= "+ userType);
		  model.addAttribute("userId", userId);
		  model.addAttribute("userType", userType);
		return model;
	}
	
	@RequestMapping("/")
	public String test(ModelAndView modelAndView, HttpSession session,Model model) {
	   // System.out.println("came here");
		  model = this.checkLogin(session, model);
	    return "index";
	}
	
	@RequestMapping("/contactUs")
	public String viewContact(ModelAndView modelAndView, HttpSession session,Model model) {
	   // System.out.println("came here");
		 // model = this.checkLogin(session, model);
	    return "contactUs";
	}
	
	@RequestMapping("/logOut")
	public String logOut(ModelAndView modelAndView , HttpSession session) {
	  
		session.setAttribute("userId","false");
		System.out.println(session.getAttribute("userId") );
	    return "redirect:/";
	}
	
	@RequestMapping("/registerJobseeker")
	public String viewRegisterJobseeker(ModelAndView modelAndView, HttpSession session,Model model) {
		model = this.checkLogin(session, model);  
		  String userId = session.getAttribute("userId").toString();
		  if(userId.equals("false"))
		  {
			  session.setAttribute("errorMessage", "لطفاً برای دسترسی به این بخش ابتدا وارد اکانت کاربری خود شوید."); 
			  return "redirect:/";
		  }
		  else
	    return "registerJobseeker";
	}
	
	@RequestMapping("/registerJobowners")
	public String viewRegisterJobowners(ModelAndView modelAndView, Model model, HttpSession session) {
		model = this.checkLogin(session, model);  
		  String userId = session.getAttribute("userId").toString();
		  if(userId.equals("false"))
		  {
			  session.setAttribute("errorMessage", "لطفاً برای دسترسی به این بخش ابتدا وارد اکانت کاربری خود شوید."); 
			  return "redirect:/";
		  }
		  else
	    return "registerJobowners";
	}
	
	@RequestMapping("/registerTeams")
	public String viewRegisterTeams(ModelAndView modelAndView, Model model, HttpSession session) {
		model = this.checkLogin(session, model);  
		  String userId = session.getAttribute("userId").toString();
		  if(userId.equals("false"))
		  {
			  session.setAttribute("errorMessage", "لطفاً برای دسترسی به این بخش ابتدا وارد اکانت کاربری خود شوید."); 
			  return "redirect:/";
		  }
		  else
	    return "registerTeams";
	}
	
	@RequestMapping("/apply")
	public String viewApply(ModelAndView modelAndView, Model model, HttpSession session) {
		model = this.checkLogin(session, model);  
		  String userId = session.getAttribute("userId").toString();
		  if(userId.equals("false"))
		  {
			  session.setAttribute("errorMessage", "لطفاً برای دسترسی به این بخش ابتدا وارد اکانت کاربری خود شوید."); 
			  return "redirect:/";
		  }
		  else
	    return "apply";
	}
	
	@RequestMapping("/applyTeamResume")
	public String viewApplyTeam(ModelAndView modelAndView, Model model, HttpSession session) {
		model = this.checkLogin(session, model);  
		  String userId = session.getAttribute("userId").toString();
		  if(userId.equals("false"))
		  {
			  session.setAttribute("errorMessage", "لطفاً برای دسترسی به این بخش ابتدا وارد اکانت کاربری خود شوید."); 
			  return "redirect:/";
		  }
		  else
	    return "applyTeamResume";
	}
    
	@RequestMapping("/employersOutsourceAdverts")
	public String viewOutsourceAd(ModelAndView modelAndView, Model model, HttpSession session) {
		 
		
					model = this.checkLogin(session, model);  
				  String userId = session.getAttribute("userId").toString();
				  if(userId.equals("false"))
				  {
					  session.setAttribute("errorMessage", "لطفاً برای دسترسی به این بخش ابتدا وارد اکانت کاربری خود شوید."); 
					  return "redirect:/";
				  }
				  else
					  return "employersOutsourceAdverts";
	}
	
	@RequestMapping("/employersHiringAdverts")
	public String viewHiringAd(ModelAndView modelAndView, Model model, HttpSession session) {
		model = this.checkLogin(session, model);  
		  String userId = session.getAttribute("userId").toString();
		  if(userId.equals("false"))
		  {
			  session.setAttribute("errorMessage", "لطفاً برای دسترسی به این بخش ابتدا وارد اکانت کاربری خود شوید."); 
			  return "redirect:/";
		  }
		  else
	    return "employersHiringAdverts";
	}
}