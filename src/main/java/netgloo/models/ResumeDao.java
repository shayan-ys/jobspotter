package netgloo.models;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * A DAO for the entity User is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 * 
 * @author netgloo
 */
@Transactional
public interface ResumeDao extends CrudRepository<Resume, Long> {

  /**
   * Return the user having the passed email or null if no user is found.
   * 
   * @param email the user email.
   */
  public Resume findById(long id);

  @Query(value = "SELECT * FROM Resumes as t WHERE "
	         + "(t.description LIKE CONCAT('%',:desc,'%')"
	         + " OR t.job_title LIKE CONCAT('%',:job_title,'%'))"
	         + "AND t.takhasos LIKE CONCAT('%',:takhasos,'%')"
	         + "AND t.type LIKE CONCAT('%',:type,'%')"
	         + "AND t.sabeghe LIKE CONCAT('%',:sabeghe,'%')"
	         + "AND t.time_type LIKE CONCAT('%',:time_type,'%')"
	         + "AND t.availability LIKE CONCAT('%',:availability,'%')"
	         , nativeQuery= true)
	 public List<Resume> search(
	         @Param("job_title") String job_title, 
	         @Param("desc") String desc, 
	         @Param("takhasos") String takhasos,
	         @Param("type") String type,
	         @Param("sabeghe") String sabeghe,
	         @Param("time_type") String time_type,
	         @Param("availability") String availability
	         );
} // class UserDao
