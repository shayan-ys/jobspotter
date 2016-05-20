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
@Table(name = "users")
public class User {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------
  
  // An autogenerated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  // The user's email
  @NotNull
  public String email;
  
  // The user's name

  public String name;

  public String reshte;
  
  public String phone;
  
  public String gender;
  
  public String ostan;
  
  public String city;
  
  public String tozihat;
  
  public String resume;
  
  public String picture;
  
  public String mozooKhabar;
  
  // team profile
  public String site;
  
  public String address;
  
  public String zamineKari;
  
  
  public String type; //jobSeeker , jobOwner , team
   
  //karfarma profile hichi ezafe tar azina nadasht!
  
  
  
  
  
  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  @NotNull
  public String password;
  
  
  
  public User() { }

  public User(long id) { 
    this.id = id;
  }
  
  public User(String email, String password , String ostan , String city, String type) {
    this.email = email;
    this.password = password;
    this.ostan = ostan;
    this.city = city;
    this.type = type;

  }
  
  public User(String email, String password , String ostan , String city,String name,String zamineKari,String type) {
	    this.email = email;
	    this.password = password;
	    this.ostan = ostan;
	    this.city = city;
	    this.name=name;
	    this.zamineKari = zamineKari;
	    this.type = type;

	  }

  // Getter and setter methods

  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  public String getEmail() {
    return email;
  }
  
  public void setEmail(String value) {
    this.email = value;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }
  
  public String getReshte() {
	  return reshte;
  }
  
  public String getPhone() {
	  return phone;
  }
  
  public String getOstan() {
	  return ostan;
  }
  
  public String getCity() {
	  return city;
  }
  
  public String getTozihat() {
	  return tozihat;
  }
  
  public String getMozoo_khabar() {
	  return mozooKhabar;
  }

} // class User
