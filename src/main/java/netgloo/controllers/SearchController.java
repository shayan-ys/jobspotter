package netgloo.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import netgloo.models.UserDao;
import netgloo.models.Resume;
import netgloo.models.ResumeDao;
import netgloo.models.Search;
import netgloo.models.User;

@Controller
@RequestMapping("/search")
public class SearchController {


	@RequestMapping("/job")
	public String jobview(ModelAndView modelAndView, HttpSession session,Model model) {
	   
		  session.setAttribute("errorMessage", "این بخش در حال ساخت میباشد. لطفا ترم بعد مراجعه فرمایید :دی"); 
		  return "redirect:/";
	}
	
	@RequestMapping("/project")
	public String projectview(ModelAndView modelAndView, HttpSession session,Model model) {
	  
		  session.setAttribute("errorMessage", "این بخش در حال ساخت میباشد. لطفا ترم بعد مراجعه فرمایید :دی"); 
		  return "redirect:/";
	}
	@RequestMapping("/resume")
	public String searchResume(HttpSession session,Model model, String keyword, String ostan, String city, String zamine_kari, String time_type, String jobAvailablity, String gender, String sabeghe) {
//		Search ser = new Search();
//		List<Resume> resumes = ser.resumeAdvanced("test", null, null, null, null, null, null, null);
		if(keyword != null) {
			List<Map<User,Resume>> resumes = resumeAdvanced(keyword, ostan, city, zamine_kari, time_type, jobAvailablity, gender, sabeghe);
			System.out.println("final: ");
			List<Resume> resumes_array = new LinkedList<>();
			List<User> users_array = new LinkedList<>();
			for( Map<User,Resume> entry : resumes )
			{
				User user = null;
				Resume resume = null;
				for( Map.Entry<User,Resume> map_entry : entry.entrySet()) {
					user = map_entry.getKey();
					resume = map_entry.getValue();
				}
				resumes_array.add(resume);
				users_array.add(user);
			}
			if(resumes_array.isEmpty())
			session.setAttribute("errorMessage", "موردی یافت نشد.");
	//		Object[] resumes_array = resumes.toArray();
			model.addAttribute("found_resumes", resumes_array.toArray());
			model.addAttribute("found_users", users_array.toArray());
		}
		return "searchResume";
	}

	  // ------------------------
	  // PRIVATE FIELDS
	  // ------------------------
	  
		public List<Map<User,Resume>> resumeAdvanced(String keyword, String province, String city, String category, String time_type, String availablity, String gender, String reputation){
			if(resumeDao == null)
				System.out.println("resume dao is null");
			List<Map<User,Resume>> returnVals = new ArrayList<>();
			List<Resume> foundResumes 
			= resumeDao
			.search(
					keyword == null ? "" : keyword,
					keyword == null ? "" : keyword,
					category == null ? "": category, 
					"jobSeeker", 
					reputation == null ? "" : reputation, 
					time_type == null ? "" : time_type, 
					availablity == null ? "" : availablity);
					
			System.out.println("found resumes: ");
			for( Resume entry : foundResumes) {
				System.out.println("resume="+ entry.getId());
			}
			List<User> foundUsers = userDao.search(
					city == null ? "" : city,
					province == null ? "" : province,
					"jobSeeker",
					"",
					"");
			System.out.println("found users: ");
			for( User entry : foundUsers) {
				System.out.println("user="+ entry.getId());
			}
			
			for(Resume entryResume : foundResumes) {
				User current_user = null;
				boolean found = false;
				for(User entryUser : foundUsers ) {
					if(entryResume.owner_id == entryUser.getId()) {
						found = true;
						current_user = entryUser;
						break;
					}
				}
				if(!found) {
					// this resume has no user with meeted search params
					foundResumes.remove(entryResume);
				} else {
					Map<User,Resume> full_resume = new HashMap<>();
					full_resume.put(current_user, entryResume);
					returnVals.add(full_resume);
				}
					
			}
			return returnVals;
		}
		
		@Autowired
		private ResumeDao resumeDao;
		
		@Autowired
		private UserDao userDao;
}
