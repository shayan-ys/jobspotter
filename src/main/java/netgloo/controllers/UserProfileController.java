package netgloo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import netgloo.models.User;
import netgloo.models.UserDao;

@Controller
@RequestMapping("/profile")
public class UserProfileController {
	
	@RequestMapping(value = "/employee/edit", method = RequestMethod.GET)
	public String EmployeeEdit(ModelAndView modelAndView, Model model, HttpSession session) {
		int id = 1;
		String id_str = "1";
		if(session.getAttribute("userId") != null)
			id_str = session.getAttribute("userId").toString();
		
		System.out.println("id_str:"+ id_str);
		id = Integer.parseInt(id_str);
		
//		id = Integer.parseInt(id_str);
		System.out.println("id_int:"+ id);
		
		modelAndView.addObject("User");
		User user = userDao.findById((long) id);
		model.addAttribute("user", user);
		return "profileEmployeeEdit";
	}
	
	@RequestMapping(value = "/employee/edit", method = RequestMethod.POST)
	public String EmployeeEditPost() {
		return "profileEmployeeEdit";
	}
	
	// ------------------------
	// PRIVATE FIELDS
	// ------------------------

	@Autowired
	private UserDao userDao;
}
