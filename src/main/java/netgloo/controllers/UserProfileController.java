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
	
	
	@RequestMapping(value = "/team/edit", method = RequestMethod.GET)
	public String teamEdit(Model model, HttpSession session) {
		int id = 1;
		String id_str = "1";
		if(session.getAttribute("userId") != null)
			id_str = session.getAttribute("userId").toString();
		
		id = Integer.parseInt(id_str);

		User user = userDao.findById(  id);
		model.addAttribute("user", user);
		return "profileTeamEdit";
	}
	
	@RequestMapping(value = "/team/edit", method = RequestMethod.POST)
	public String teamEditPost(ModelAndView modelAndView,String name,String site,String email,String phone,String ostan,String city,String address,String zamineKari,String tozihat,String mozooKhabar,Model model, HttpSession session) {
	
		
		int id = 1;
		String id_str = "1";
		if(session.getAttribute("userId") != null)
			id_str = session.getAttribute("userId").toString();
		
		id = Integer.parseInt(id_str);
		User user = userDao.findById(  id);
		
		user.name = name;
		user.site = site;
	
		user.phone = phone;
		user.ostan = ostan;
		user.city = city;
		user.address = address;
		user.zamineKari = zamineKari;
		user.tozihat = tozihat;
		user.mozooKhabar = mozooKhabar;
		userDao.save(user);
		
		return teamEdit(model, session);
	}
	
	@RequestMapping(value = "/employee/edit", method = RequestMethod.GET)
	public String EmployeeEdit(Model model, HttpSession session) {
		int id = 1;
		String id_str = "1";
		if(session.getAttribute("userId") != null)
			id_str = session.getAttribute("userId").toString();
		
		id = Integer.parseInt(id_str);
		User user = userDao.findById(id);
		model.addAttribute("user", user);
		return "profileEmployeeEdit";
	}
	
	@RequestMapping(value = "/employee/edit", method = RequestMethod.POST)
	public String EmployeeEditPost(HttpSession session, Model model, String name, String reshte, String degree,String gender, String email, String phone, String ostan, String city, String tozihat, String mozooKhabar) {
		
		
		int id = 1;
		String id_str = "1";
		if(session.getAttribute("userId") != null)
			id_str = session.getAttribute("userId").toString();
		
		id = Integer.parseInt(id_str);
		User user = userDao.findById( id);
		
		user.name = name;
		user.reshte = reshte;
		user.gender = gender;
		user.phone = phone;
		user.ostan = ostan;
		user.city = city;
		user.tozihat = tozihat;
		user.degree = degree;
		user.mozooKhabar = mozooKhabar;
		userDao.save(user);
		
	
		return EmployeeEdit(model, session);
	}
	
	
	@RequestMapping(value = "/employer/edit", method = RequestMethod.GET)
	public String EmployerEdit( Model model, HttpSession session) {
		int id = 1;
		String id_str = "1";
		if(session.getAttribute("userId") != null)
			id_str = session.getAttribute("userId").toString();
		
		id = Integer.parseInt(id_str);
		User user = userDao.findById(id);
		model.addAttribute("user", user);
		
		return "profileEmployerEdit";
	}
	
	@RequestMapping(value = "/employer/edit", method = RequestMethod.POST)
	public String EmployerEditPost(HttpSession session, Model model, String name, String site, String email, String phone, String ostan, String city,String address,String zamineKari ,String tozihat ) {
		
		int id = 1;
		String id_str = "1";
		if(session.getAttribute("userId") != null)
			id_str = session.getAttribute("userId").toString();
		
		id = Integer.parseInt(id_str);
		User user = userDao.findById( id);
		
		user.name = name;
		user.site = site;
	
		user.phone = phone;
		user.ostan = ostan;
		user.city = city;
		user.address = address;
		user.zamineKari = zamineKari;
		user.tozihat = tozihat;
		//user.mozooKhabar = mozooKhabar;
		userDao.save(user);
		
		return EmployerEdit(model, session);
	}
	
	
	// ------------------------
	// PRIVATE FIELDS
	// ------------------------

	@Autowired
	private UserDao userDao;
}
