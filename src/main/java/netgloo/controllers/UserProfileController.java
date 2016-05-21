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
	public String EmployeeEditPost(ModelAndView modelAndView, String name, String reshte,String gender, String email, String phone, String ostan, String city, String tozihat,String resume, String mozooKhabar) {
		
		
		System.out.println("in edit employer controller");
		User user = userDao.findByEmail(email);
		user.name = name;
		user.reshte = reshte;
		user.gender = gender;
		user.email = email;
		user.phone = phone;
		user.ostan = ostan;
		user.city = city;
		user.tozihat = tozihat;
		user.resume = resume;
		user.mozooKhabar = mozooKhabar;
		userDao.save(user);
		
	
		return "profileEmployeeEdit";
	}
	
	
	@RequestMapping(value = "/employer/edit", method = RequestMethod.GET)
	public String EmployerEdit(ModelAndView modelAndView, Model model, HttpSession session) {
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
		return "profileEmployerEdit";
	}
	
	@RequestMapping(value = "/employer/edit", method = RequestMethod.POST)
	public String EmployerEditPost(ModelAndView modelAndView, String name, String site, String email, String phone, String ostan, String city,String zamineKari ,String tozihat ) {
		
		System.out.println("in edit employer controller");
		User user = userDao.findByEmail(email);
		user.name = name;
		user.reshte = site;
		user.email = email;
		user.phone = phone;
		user.ostan = ostan;
		user.city = city;
		user.zamineKari = zamineKari;
		user.tozihat = tozihat;
		userDao.save(user);
		
		return "index";
	}
	
	
	// ------------------------
	// PRIVATE FIELDS
	// ------------------------

	@Autowired
	private UserDao userDao;
}
