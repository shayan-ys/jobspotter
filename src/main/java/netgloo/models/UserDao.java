package netgloo.models;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
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
public interface UserDao extends CrudRepository<User, Long> {

  /**
   * Return the user having the passed email or null if no user is found.
   * 
   * @param email the user email.
   */
  public User findByEmail(String email);
  public User findById(int id);
  
//  @Modifying
//  @Query("SELECT p FROM User p WHERE p.team_id = :teamId")
//  public List<User> findByTeamId(@Param("teamId") String teamId);
  
  @Query(value = "SELECT * FROM Users as t WHERE "
	         + "    t.city LIKE CONCAT('%',:city,'%')"
	         + "AND t.ostan LIKE CONCAT('%',:ostan,'%')"
	         + "AND t.type LIKE CONCAT('%',:userType,'%')"
	         + "AND t.reshte LIKE CONCAT('%',:reshte_fardi,'%')"
	         + "AND t.zamine_kari LIKE CONCAT('%',:zamine_kari_team,'%')"
	         , nativeQuery= true)
	public List<User> search(
			@Param("city") String city,
			@Param("ostan") String ostan,
			@Param("userType") String userType,
			@Param("reshte_fardi") String reshte_fardi,
			@Param("zamine_kari_team") String zamine_kari_team
			);

} // class UserDao
