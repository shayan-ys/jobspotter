package netgloo.controllers;

import netgloo.models.User;
import netgloo.models.UserDao;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class UserController {
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public String login(String email, String password, HttpSession session) {
		System.out.println("email="+ email);
		System.out.println("password="+ password);

		   try {
			      User user = userDao.findByEmail(email);
			     
			      if( password.equals(user.password) )
			      {
			    	  System.out.println("email="+ email);
			    	  System.out.println("password="+ password);
			    	  System.out.println("login success");
			    	  session.setAttribute("userId", user.getId());
			    	  return "success";
			      
			      }
			      else
			      {
			    	  System.out.println("email="+ email);
			    	  System.out.println("password entered="+ password);
			    	  System.out.println("password real="+ user.password);
			    	  System.out.println("login failed");
			    	  return "password or email is incorrect";
			      }
			    }
			    catch (Exception ex) {
			      return "User not found";
			    }
		   
	}

	@RequestMapping(value="/registerJobseeker", method=RequestMethod.POST )
	public String registerPerson(ModelAndView modelandview, String email, String password,String ostan,String city, HttpSession session) {
		System.out.println("email="+ email);
		System.out.println("password="+ password);

		 User user = userDao.findByEmail(email);
	      if(user!=null)
	      {
	    	  session.setAttribute("registerError", "email is taken");
	    	 return "registerJobseeker";
	    	  
	      }
	      else
	      {
	    	  session.setAttribute("registerError", "email is Free");
	      }
	      
	      try {
    		user = new User(email, password,ostan,city);
      		userDao.save(user);
    	}
    	catch (Exception ex) {
    		return "Error creating the user: " + ex.toString();
    	}
    	System.out.println(user.phone);
    	return "index";
	}
	
	
	@RequestMapping(value="/registerJobowners", method=RequestMethod.POST)
	@ResponseBody
	public String registerOwner(HttpSession session, String email, String password,String ostan,String city,String name,String zamineKari) {
		System.out.println("email="+ email);
		System.out.println("password="+ password);

		 User user = userDao.findByEmail(email);
	      if(user!=null)
	      {
	    	  session.setAttribute("registerError", "email is taken");
	    	 return "registerJobseeker";
	    	  
	      }
	      else
	      {
	    	  session.setAttribute("registerError", "email is Free");
	      }
    	try {
    		user = new User(email, password,ostan,city,name,zamineKari);
      		userDao.save(user);
    	}
    	catch (Exception ex) {
    		return "Error creating the user: " + ex.toString();
    	}
    	System.out.println(user.phone);
    	return "User succesfully created! (id = " + user.getId() + ")";
	}
	
	@RequestMapping(value="/registerTeams", method=RequestMethod.POST)
	@ResponseBody
	public String registerTeams(HttpSession session, String email, String password,String ostan,String city,String name,String zamineKari) {
		System.out.println("email="+ email);
		System.out.println("password="+ password);

		 User user = userDao.findByEmail(email);
	      if(user!=null)
	      {
	    	  session.setAttribute("registerError", "email is taken");
	    	 return "registerJobseeker";
	    	  
	      }
	      else
	      {
	    	  session.setAttribute("registerError", "email is Free");
	      }
    	try {
    		user = new User(email, password,ostan,city,name,zamineKari);
      		userDao.save(user);
    	}
    	catch (Exception ex) {
    		return "Error creating the user: " + ex.toString();
    	}
    	System.out.println(user.phone);
    	return "User succesfully created! (id = " + user.getId() + ")";
	}
	
  // ------------------------
  // PRIVATE FIELDS
  // ------------------------

  @Autowired
  private UserDao userDao;
  
} // class UserController
