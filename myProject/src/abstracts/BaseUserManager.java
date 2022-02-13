package abstracts;

import entities.User;

public class BaseUserManager implements UserService {

	UserCheckService userCheckService;	
	
	public BaseUserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;

	}
	

	@Override
	public void create(User user) {
		if (userCheckService.validate(user)==true) {
			System.out.println("Saved : "+user.getId());
		}else {
			System.out.println("Verification failed. Registration failed.");
		}
	}

	@Override
	public void update(User user) {
		
		System.out.println( "Updated the user's birth year.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted : "+user.getId());
		
	}

	@Override
	public void list(User[] users) {
		
		System.out.println("User list------------");
		for (User user : users) {
			System.out.println(user.getId()+" = "+user.getName()+" "+user.getSurname());
		} 
		
	}
	
}
