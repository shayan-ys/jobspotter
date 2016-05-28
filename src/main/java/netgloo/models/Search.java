package netgloo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Search {

	@RequestMapping("/test2")
	public void test() {
		if( adsDao == null )
			System.out.println("ads dao is null :(");
		else System.out.println("adsDao is NOT null :D");
	}
	public static String markSearchedTerm(String text, String term) {
		return text.replaceAll(term , "<span class='marked_search'>"+ term +"</span>");
	}
	/*
	public List<Resume> resumeAdvanced(String keyword, String province, String city, String category, String time_type, String availablity, String gender, String reputation){
		if(resumeDao == null)
			System.out.println("resume dao is null");
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
		List<User> foundUsers = userDao.search(city, province, "jobSeeker", "", "");
		
		for(Resume entryResume : foundResumes) {
			boolean found = false;
			for(User entryUser : foundUsers ) {
				if(entryResume.owner_id == entryUser.getId()) {
					found = true;
					break;
				}
			}
			if(!found) {
				// this resume has no user with meeted search params
				foundResumes.remove(entryResume);
			}
		}
		return foundResumes;
	}*/
	
//	@Autowired
//	private ResumeDao resumeDao;
//	
//	@Autowired
//	private UserDao userDao;
	@Autowired
	AdsDao adsDao;
}
