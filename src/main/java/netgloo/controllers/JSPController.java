package netgloo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JSPController {

	@RequestMapping("/")
	public String test(ModelAndView modelAndView) {
	   // System.out.println("came here");
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