package project.spring.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.spring.entities.User;
import project.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService  {
	
	
	@Autowired
	UserRepository  RepUser;
	
	
	
	@Override
	public User AjouterUser(User u) {
		RepUser.save(u);
		return u;
	}

	@Override
	public void DeleteUser(User u) {
		RepUser.delete(u);
		
	}

	@Override
	public void DeleteUser(Long id) {
		RepUser.deleteById(id);
		
	}

	@Override
	public List<User> getAllUser() {
		return (List<User>) RepUser.findAll();
		
	}
	
	

}
