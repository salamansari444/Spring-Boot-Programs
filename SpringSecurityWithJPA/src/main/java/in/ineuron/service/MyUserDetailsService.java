package in.ineuron.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.ineuron.model.MyUserDetails;
import in.ineuron.model.User;
import in.ineuron.repo.IUserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private IUserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = repo.findByUserName(userName);
		user.orElseThrow(()-> new UsernameNotFoundException("Not Found : "+userName));
		return user.map(MyUserDetails::new).get();
	}

}
