package netgloo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import netgloo.models.UserDao;
import netgloo.models.User;

@Controller
@RequestMapping("/search")
public class SearchController {

	@RequestMapping("/job")
	
	public String searchJob(String city) {
		List<User> users = userDao.search("teh");
		for(User user : users) {
			System.out.println("found user: "+ user.email);
		}
		return "";
	}
	  // ------------------------
	  // PRIVATE FIELDS
	  // ------------------------

	  @Autowired
	  private UserDao userDao;
}
