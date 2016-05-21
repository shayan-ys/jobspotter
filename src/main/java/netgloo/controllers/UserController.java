package netgloo.controllers;

import netgloo.models.Authentication;
import netgloo.models.User;
import netgloo.models.UserDao;

import javax.servlet.http.HttpSession;

import org.neo4j.cypher.internal.compiler.v2_1.perty.docbuilders.toStringDocBuilder;
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
			     if(user==null)
			     {
			    	 session.setAttribute("errorMessage", "ایمیل رو ثبت نکردی گاگول .");
			     }
			    	 
			    	 
			      if( password.equals(user.password) )
			      {
			    	  System.out.println("email="+ email);
			    	  System.out.println("password="+ password);
			    	  System.out.println("login success");
			    	  String userId = "";
			    	  userId += user.getId();
			    	  System.out.println("get attribute: "+ userId.toString());
			    	  session.setAttribute("userId", userId.toString());
			    	  session.setAttribute("userType", user.type);
			    	  return "success";
			      
			      }
			      else
			      {
			    	  System.out.println("email="+ email);
			    	  System.out.println("password entered="+ password);
			    	  System.out.println("password real="+ user.password);
			    	  System.out.println("login failed");
			    	  session.setAttribute("errorMessage", "پسورد غلطه خاک بر سر .");
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
		//Authentication auth = null;
		//User user = auth.isEmailFree(email);
	      if(user!=null)
	      {
	    	  session.setAttribute("registerError", "email is taken");
	    	  session.setAttribute("errorMessage", "این ایمیل توسط شخص دیگری ثبت شده است.");
	    	  session.setAttribute("userId", "false");
	    	  session.setAttribute("userType", "false");
	    	 return "registerJobseeker";
	    	  
	      }
	      else
	      {
	    	  session.setAttribute("registerError", "email is Free");
	      }
	      
	    try {
    		user = new User(email, password,ostan,city,"jobSeeker");
      		userDao.save(user);
      	  String userId = "";
    	  userId += user.getId();
    	  System.out.println("get attribute: "+ userId.toString());
    	  session.setAttribute("userId", userId.toString());
    	  session.setAttribute("successMessage", "ثبت نام با موفقیت انجام شد");
    	  session.setAttribute("userType", "jobSeeker");
    	  
    	}
    	catch (Exception ex) {
    		return "Error creating the user: " + ex.toString();
    	}
    	System.out.println(user.phone);
    	
    	return "redirect:/";
	}
	
	
	@RequestMapping(value="/registerJobowners", method=RequestMethod.POST)

	public String registerOwner(HttpSession session, String email, String password,String ostan,String city,String name,String zamineKari) {
		System.out.println("email="+ email);
		System.out.println("password="+ password);

		 User user = userDao.findByEmail(email);
	      if(user!=null)
	      {
	    	  session.setAttribute("registerError", "email is taken");
	    	  session.setAttribute("errorMessage", "این ایمیل توسط شخص دیگری ثبت شده است.");
	    	  session.setAttribute("userId", "false");
	    	  session.setAttribute("userType", "false");
	    	  
	    	 return "registerJobseeker";
	    	  
	      }
	      else
	      {
	    	  session.setAttribute("registerError", "email is Free");
	      }
    	try {
    		user = new User(email, password,ostan,city,name,zamineKari,"jobOwner");
      		userDao.save(user);
      	  String userId = "";
    	  userId += user.getId();
    	  System.out.println("get attribute: "+ userId.toString());
    	  session.setAttribute("userId", userId.toString());
    	  session.setAttribute("successMessage", "ثبت نام با موفقیت انجام شد");
    	  session.setAttribute("userType", "jobOwner");
    	}
    	catch (Exception ex) {
    		return "Error creating the user: " + ex.toString();
    	}
    	System.out.println(user.phone);
    //	return "User succesfully created! (id = " + user.getId() + ")";
    	return "redirect:/";
	}
	
	@RequestMapping(value="/registerTeams", method=RequestMethod.POST)
	public String registerTeams(HttpSession session, String email, String password,String ostan,String city,String name,String zamineKari) {
		System.out.println("email="+ email);
		System.out.println("password="+ password);

		 User user = userDao.findByEmail(email);
	      if(user!=null)
	      {
	    	  session.setAttribute("registerError", "email is taken");
	    	  
	    	  session.setAttribute("errorMessage", "این ایمیل توسط شخص دیگری ثبت شده است.");
	    	  session.setAttribute("userId", "false");
	    	  session.setAttribute("userType", "false");
	    	 return "registerJobseeker";
	    	  
	      }
	      else
	      {
	    	  session.setAttribute("registerError", "email is Free");
	      }
    	try {
    		user = new User(email, password,ostan,city,name,zamineKari,"team");
      		userDao.save(user);
      	  String userId = "";
    	  userId += user.getId();
    	  System.out.println("get attribute: "+ userId.toString());
    	  session.setAttribute("userId", userId.toString());
    	  session.setAttribute("successMessage", "ثبت نام با موفقیت انجام شد");
    	  session.setAttribute("userType", "team");
    	  
    	}
    	catch (Exception ex) {
    		return "Error creating the user: " + ex.toString();
    	}
    	System.out.println(user.phone);
    	//return "User succesfully created! (id = " + user.getId() + ")";
    	return "redirect:/";
	}
	
  // ------------------------
  // PRIVATE FIELDS
  // ------------------------

  @Autowired
  private UserDao userDao;
  
} // class UserController
