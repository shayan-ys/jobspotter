package netgloo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPController {

	@RequestMapping("/")
	public String test(ModelAndView modelAndView, HttpSession session,Model model) {
	   // System.out.println("came here");
		  String userId="false";
		  if( session.getAttribute("testSession") != null )
			  userId = session.getAttribute("testSession").toString();
		  System.out.println(userId);
		  model.addAttribute("userId", userId);
	    return "index";
	}
	
	@RequestMapping("/registerJobseeker")
	public String viewRegisterJobseeker(ModelAndView modelAndView) {
	   // System.out.println("came here");
	    return "registerJobseeker";
	}
	
	@RequestMapping("/registerJobowners")
	public String viewRegisterJobowners(ModelAndView modelAndView) {
	    //System.out.println("came here");
	    return "registerJobowners";
	}
	
	@RequestMapping("/registerTeams")
	public String viewRegisterTeams(ModelAndView modelAndView) {
	   // System.out.println("came here");
	    return "registerTeams";
	}
    
}