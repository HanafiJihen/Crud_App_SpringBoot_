package project.spring.services;


import java.util.List;

import project.spring.entities.User;

public interface UserService {
	
	User AjouterUser (User u);
	
	void DeleteUser (User u);
	
	void DeleteUser (Long id);
	
	List<User> getAllUser ();

}
