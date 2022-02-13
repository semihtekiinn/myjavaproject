package abstracts;

import entities.User;



public interface UserService {
	
	void create(User user);
	
	void update(User user);
	
	void delete(User user);
	
	void list(User[] users); 
	
	}