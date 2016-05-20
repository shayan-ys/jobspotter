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
		  if( session.getAttribute("userId") != null )
			  userId = session.getAttribute("userId").toString();
		  System.out.println("userId= "+ userId);
		  model.addAttribute("userId", userId);
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
	    return "index";
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
    
}