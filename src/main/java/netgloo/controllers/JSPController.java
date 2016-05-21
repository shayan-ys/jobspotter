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
		  if( session.getAttribute("userId") != null )
		  {
			  
			  userId = session.getAttribute("userId").toString();
			  userType = session.getAttribute("userType").toString();
			  
		  }
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
	
	@RequestMapping("/logOut")
	public String logOut(ModelAndView modelAndView , HttpSession session) {
	  
		session.setAttribute("userId","false");
		System.out.println(session.getAttribute("userId") );
	    return "redirect:/";
	}
	
	@RequestMapping("/registerJobseeker")
	public String viewRegisterJobseeker(ModelAndView modelAndView, HttpSession session,Model model) {
		  model = this.checkLogin(session, model);
		  
	   // System.out.println("came here");
	    return "registerJobseeker";
	}
	
	@RequestMapping("/registerJobowners")
	public String viewRegisterJobowners(ModelAndView modelAndView, Model model, HttpSession session) {
		  model = this.checkLogin(session, model);
	    //System.out.println("came here");
	    return "registerJobowners";
	}
	
	@RequestMapping("/registerTeams")
	public String viewRegisterTeams(ModelAndView modelAndView, Model model, HttpSession session) {
	   // System.out.println("came here");
		  model = this.checkLogin(session, model);
	    return "registerTeams";
	}
	
	@RequestMapping("/apply")
	public String viewApply(ModelAndView modelAndView, Model model, HttpSession session) {
	   // System.out.println("came here");
		  model = this.checkLogin(session, model);
	    return "apply";
	}
	
	@RequestMapping("/applyTeamResume")
	public String viewApplyTeam(ModelAndView modelAndView, Model model, HttpSession session) {
	   // System.out.println("came here");
		  model = this.checkLogin(session, model);
	    return "applyTeamResume";
	}
    
}