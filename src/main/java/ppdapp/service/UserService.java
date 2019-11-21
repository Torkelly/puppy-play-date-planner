package ppdapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ppdapp.beans.User;
import ppdapp.repository.UserRepository;
@Service("userService")
public class UserService {
	private UserRepository userRepository;
	 private BCryptPasswordEncoder bCryptPasswordEncoder;

	    @Autowired
	    public UserService(UserRepository userRepository,
	                       BCryptPasswordEncoder bCryptPasswordEncoder) {
	        this.userRepository = userRepository;
	        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	    }
	    
	 public User findUserByEmail(String email) {
	        return userRepository.findByEmailIgnoreCase(email);
	    }

	    public User saveUser(User user) {
	        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	        return userRepository.save(user);
	    }
}
