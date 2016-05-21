package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * An entity User composed by three fields (id, email, name).
 * The Entity annotation indicates that this class is a JPA entity.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "ads")
public class Ads {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An autogenerated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  
  @NotNull
  public int owner_id;
  
  public String adType;

  public String jobTitle;
  
  public String description;
  
  public String ostan;
  
  public String city;
  
  public String jobType;
  
  public String gender;
  
  public String category;
  
  public String salary;
  
  public String takhasos;
  
  public String deadline; //date
  
  
  
  
  
  
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  public Ads() {
	// TODO Auto-generated constructor stub
}

  public Ads(int id) { 
    this.id = id;
  }
  //estekhdam (HiringAdverts)
  public Ads(int owner_id,String adType,String jobTitle,String ostan,String city,String jobType,String gender,String category,String description,String salary) {
    this.owner_id=owner_id;
    this.adType=adType;
    this.category=category;
    this.jobTitle=jobTitle;
    this.description=description;
    this.ostan=ostan;
    this.city=city;
    this.gender=gender;
    this.jobType=jobType;
    this.salary=salary;

  }
  //outsource
  public Ads(int owner_id,String adType,String jobTitle,String category,String takhasos,String deadline,String description,String salary) {
	    this.owner_id=owner_id;
	  	this.adType = adType;
	    this.jobTitle = jobTitle;
	    this.takhasos=takhasos;
	    this.category=category;
	    this.deadline=deadline;
	    this.description=description;
	    this.salary=salary;
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
  
  public String getOstan(){
	  return this.ostan;
  }
  
  public String getDescription(){
	  return this.description;
  }
  
  public String getCity(){
	  return this.city;
  }

  public String getJobTitle(){
	  return this.jobTitle;
  }
  
  public String getCategory(){
	  return this.category;
  }
  
  public String getJobType(){
	  return this.jobType;
  }
  
  public String getGender(){
	  return this.gender;
  }
  
  public String getDeadline(){
	  return this.deadline;
  }
  
  public String getSalary(){
	  return this.salary;
  }
} // class Resume
