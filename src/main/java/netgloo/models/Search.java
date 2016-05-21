package netgloo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Search {

	public String markSearchedTerm(String text, String term) {
		return text.replaceAll(term , "<span class='marked_search'>"+ term +"</span>");
	}
	
	public List<Resume> resumeAdvanced(String keyword, String province, String city, String category, String time_type, String availablity, String gender, String reputation){
		List<Resume> foundResumes = resumeDao.search(
				keyword == null ? "" : keyword,
				keyword == null ? "" : keyword,
				category == null ? "": category, 
				"jobSeeker", 
				reputation == null ? "" : reputation, 
				time_type == null ? "" : time_type, 
				availablity == null ? "" : availablity);
		List<User> foundUsers = userDao.search(city, province, "jobSeeker", "", "");
		
//		for(User )
		return null;
	}
	
	@Autowired
	private ResumeDao resumeDao;
	
	@Autowired
	private UserDao userDao;
}
