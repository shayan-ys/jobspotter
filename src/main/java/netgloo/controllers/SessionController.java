package netgloo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {

	  @RequestMapping("/newsession")
	  @ResponseBody
	  public String newsession(HttpSession session) {
		  session.setAttribute("test", "testval");
		  return "session created";
	  }
	  
	  @RequestMapping("/getsession")
	  @ResponseBody
	  public String fetchsession(HttpSession session) {
		  String test;
		  if( session.getAttribute("test") != null )
			  test = session.getAttribute("test").toString();
		  else
			  test = "null :(";
		  return "session value is= "+ test;
	  }
}
