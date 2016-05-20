package netgloo.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import netgloo.Application;

@Controller
public class SessionController {

	  @RequestMapping("/newsession")
	  @ResponseBody
	  public String newsession(HttpSession session) {
		  session.setAttribute("test", "testval");
		  return "session created";
	  }
	  
	  @RequestMapping("/getsession")
	  @ResponseBody
	  public String fetchsession(HttpSession session) {
		  String test;
		  if( session.getAttribute("test") != null )
			  test = session.getAttribute("test").toString();
		  else
			  test = "null :(";
		  return "session value is= "+ test;
	  }
	  
		@RequestMapping("/upload")
		public String test(ModelAndView modelAndView) {
		    System.out.println("came here");
		    return "uploadForm";
		}
	  
	// Upload file controller
	  @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	  @ResponseBody
	  public ResponseEntity<?> uploadFile(
	      @RequestParam("uploadfile") MultipartFile uploadfile) {
	    
	    try {
	      // Get the filename and build the local file path (be sure that the 
	      // application have write permissions on such directory)
	      String filename = uploadfile.getOriginalFilename();
	      String directory = Application.ROOT;
	      String filepath = Paths.get(directory, filename).toString();
	      
	      // Save the file locally
	      BufferedOutputStream stream =
	          new BufferedOutputStream(new FileOutputStream(new File(filepath)));
	      stream.write(uploadfile.getBytes());
	      stream.close();
	    }
	    catch (Exception e) {
	      System.out.println(e.getMessage());
	      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	    }
	    
	    return new ResponseEntity<>(HttpStatus.OK);
	  } // method uploadFile
}
