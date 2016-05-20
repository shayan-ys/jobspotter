package netgloo.controllers;

import netgloo.models.User;
import netgloo.models.UserDao;

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
	
  // ------------------------
  // PRIVATE FIELDS
  // ------------------------

  @Autowired
  private UserDao userDao;
  
} // class UserController
