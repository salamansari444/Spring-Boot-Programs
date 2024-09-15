package in.ineuron.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.User;

public interface IUserRepo extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String userName); 
}
