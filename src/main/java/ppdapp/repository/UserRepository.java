package ppdapp.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;


import ppdapp.beans.User;
@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmailIgnoreCase(String email);

}
