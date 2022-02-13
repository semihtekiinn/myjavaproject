package console;

import abstracts.BaseUserManager;
import concrete.UserCheckManager;
import entities.User;

public class Main {

	public static void main(String[] args) {

		User user1=new User();
		user1.setId(1);
		user1.setName("Semih");
		user1.setSurname("Tekin");
		user1.setGender("Erkek");
		user1.setBirthYear(1997);
		user1.setIdendityNumber(12345);
		
		User user2=new User();
		user2.setId(2);
		user2.setName("Sinan");
		user2.setSurname("Tekin");
		user2.setGender("Erkek");
		user2.setBirthYear(1998);
		user2.setIdendityNumber(11111);
		
		User user3=new User();
		user3.setId(3);
		user3.setName("Ayse");
		user3.setSurname("Tekin");
		user3.setGender("Kadın");
		user3.setBirthYear(1969);
		user3.setIdendityNumber(22222);
		
		User user4=new User();
		user4.setId(4);
		user4.setName("Turan");
		user4.setSurname("Tekin");
		user4.setGender("Erkek");
		user4.setBirthYear(1967);
		user4.setIdendityNumber(99999);
		
		
		BaseUserManager userManager = new BaseUserManager(new UserCheckManager());
		
		
		User[] users = new User[] {user1, user2, user3, user4};
		
		
		userManager.create(user1);
		userManager.create(user2);
		userManager.create(user3);
		userManager.create(user4);
		
		userManager.update(user1);
		userManager.update(user2);
		userManager.update(user3);
		
		userManager.delete(user1);
		userManager.delete(user2);
		userManager.delete(user3);
		
		userManager.list(users);

		};

	}
