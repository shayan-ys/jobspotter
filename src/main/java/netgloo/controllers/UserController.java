package netgloo.controllers;

import netgloo.models.User;
import netgloo.models.UserDao;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@RequestMapping(value="/registerJobseeker", method=RequestMethod.POST)
	@ResponseBody
	public String registerPerson(String email, String password,String ostan,String city) {
		System.out.println("email="+ email);
		System.out.println("password="+ password);

		User user = null;
    	try {
    		user = new User(email, password,ostan,city);
      		userDao.save(user);
    	}
    	catch (Exception ex) {
    		return "Error creating the user: " + ex.toString();
    	}
    	System.out.println(user.phone);
    	return "User succesfully created! (id = " + user.getId() + ")";
	}
	
	
	@RequestMapping(value="/registerJobowners", method=RequestMethod.POST)
	@ResponseBody
	public String registerOwner(String email, String password,String ostan,String city,String name,String zamineKari) {
		System.out.println("email="+ email);
		System.out.println("password="+ password);

		User user = null;
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
	public String registerTeams(String email, String password,String ostan,String city,String name,String zamineKari) {
		System.out.println("email="+ email);
		System.out.println("password="+ password);

		User user = null;
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
  // PUBLIC METHODS
  // ------------------------
  
  /**
   * /create  --> Create a new user and save it in the database.
   * 
   * @param email User's email
   * @param name User's name
   * @return A string describing if the user is succesfully created or not.
   */
  @RequestMapping("/create")
  @ResponseBody
  public String create(String email, String name, String ostan, String city) {
    User user = null;
    try {
      user = new User(email, name, ostan,city);
      userDao.save(user);
    }
    catch (Exception ex) {
      return "Error creating the user: " + ex.toString();
    }
    return "User succesfully created! (id = " + user.getId() + ")";
  }
  
  /**
   * /delete  --> Delete the user having the passed id.
   * 
   * @param id The id of the user to delete
   * @return A string describing if the user is succesfully deleted or not.
   */
  @RequestMapping("/delete")
  @ResponseBody
  public String delete(long id) {
    try {
      User user = new User(id);
      userDao.delete(user);
    }
    catch (Exception ex) {
      return "Error deleting the user:" + ex.toString();
    }
    return "User succesfully deleted!";
  }
  
  /**
   * /get-by-email  --> Return the id for the user having the passed email.
   * 
   * @param email The email to search in the database.
   * @return The user id or a message error if the user is not found.
   */
  @RequestMapping("/get-by-email")
  @ResponseBody
  public String getByEmail(String email) {
    String userId;
    try {
      User user = userDao.findByEmail(email);
      userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return "User not found";
    }
    return "The user id is: " + userId;
  }
  
  /**
   * /update  --> Update the email and the name for the user in the database 
   * having the passed id.
   * 
   * @param id The id for the user to update.
   * @param email The new email.
   * @param name The new name.
   * @return A string describing if the user is succesfully updated or not.
   */
  @RequestMapping("/update")
  @ResponseBody
  public String updateUser(long id, String email, String name) {
    try {
      User user = userDao.findOne(id);
      user.setEmail(email);
      user.setName(name);
      userDao.save(user);
    }
    catch (Exception ex) {
      return "Error updating the user: " + ex.toString();
    }
    return "User succesfully updated!";
  }

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------

  @Autowired
  private UserDao userDao;
  
} // class UserController
