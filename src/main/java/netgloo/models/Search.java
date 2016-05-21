package netgloo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Search {

	public String markSearchedTerm(String text, String term) {
		return text.replaceAll(term , "<span class='marked_search'>"+ term +"</span>");
	}
	
	public List<Resume> resumeAdvanced(String keyword, String province, String city, String category, String time_type, String availablity, String gender, String reputation){
		
		return null;
	}
	
	@Autowired
	private ResumeDao resumeDao;
}
