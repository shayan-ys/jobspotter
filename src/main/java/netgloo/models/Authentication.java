package netgloo.models;

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

public class Authentication {
	
	public User isEmailFree(String email)
	{
		User user = userDao.findByEmail(email);
		
		return user;
		
		}
	
	@Autowired
	private UserDao userDao;
}
