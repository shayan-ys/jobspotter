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
public interface AdsDao extends CrudRepository<Ads, Long> {

  /**
   * Return the user having the passed email or null if no user is found.
   * 
   * @param email the user email.
   */
  public Ads findById(int id);
  
  @Query(value = "SELECT * FROM Ads as t WHERE "
	         + "t.ad_type LIKE CONCAT('%',:ad_type,'%')"
	         + "AND (t.description LIKE CONCAT('%',:desc,'%')"
	         + " OR t.job_title LIKE CONCAT('%',:job_title,'%'))"
	         + "AND t.category LIKE CONCAT('%',:category,'%')"
	         + "AND t.ostan LIKE CONCAT('%',:ostan,'%')"
	         + "AND t.city LIKE CONCAT('%',:city,'%')"
	         + "AND t.job_type LIKE CONCAT('%',:time_type,'%')"
	         + "AND t.gender LIKE CONCAT('%',:gender,'%')"
	         , nativeQuery= true)
	 public List<Ads> search(
	         @Param("ad_type") String ad_type, 
	         @Param("desc") String desc, 
	         @Param("job_title") String job_title,
	         @Param("category") String category,
	         @Param("ostan") String ostan,
	         @Param("city") String city,
	         @Param("time_type") String time_type,
	         @Param("gender") String gender
	         );
} // class AdsDao
