package netgloo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * An entity User composed by three fields (id, email, name).
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "resumes")
public class Resume {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An autogenerated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  
  @NotNull
  public int owner_id;
  
  public String type = "";

  public String jobTitle = "";
 
  public String sabeghe = "";
  
  public String description = "";
  
  public String resume_file = "";
  
  public String takhasos = "";
  
  public String time_type = "";
  
  public String availability = "";
  
  public String category = "";
  
  @Column(name="timestamp", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  public Date created;
  
  
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  public Resume() { }

  public Resume(int id) { 
    this.id = id;
  }
  
  public Resume(int owner_id,String jobTitle,String category,String sabeghe,String takhasos,String description,String resume_file,String type) {
    this.owner_id=owner_id;
	this.jobTitle = jobTitle;
    this.sabeghe=sabeghe;
    this.description=description;
    this.resume_file=resume_file;
    this.type=type;
    this.takhasos=takhasos;
    this.category=category;
    this.availability="1";

  }
  
  
  public Resume(int owner_id,String sabeghe,String takhasos,String description,String resume_file,String type) {
	    this.owner_id=owner_id;
	    this.sabeghe = sabeghe;
	    this.takhasos=takhasos;
	    this.description=description;
	    this.resume_file=resume_file;
	    this.type=type;
	    this.availability="1";
	  }

  // Getter and setter methods

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  
  public String getTakhasos(){
	  return this.takhasos;
  }
  
  public String getSabeghe(){
	  return this.sabeghe;
  }
  
  public String getDescription(){
	  return this.description;
  }
  
  public String getResumeFile(){
	  return this.resume_file;
  }

  public String getJobTitle(){
	  return this.jobTitle;
  }
  
  public int getTeamNumber(){
//	  return userDao.findByTeamId(""+ this.id).size();
	  return 1;
  }
  
  public String getCategory(){
	  return this.category;
  }
  
  public Date getCreated(){
	  return this.created;
  }
  
  public String getType() {
	  return this.type;
  }
  
//  @Autowired
//  private UserDao userDao;
  
} // class Resume
