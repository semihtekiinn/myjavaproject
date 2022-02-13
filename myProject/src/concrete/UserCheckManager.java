package concrete;

import abstracts.UserCheckService;
import entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean validate(User user) {

		if (user.getName()=="Semih" && user.getSurname()=="Tekin" && user.getBirthYear()==1997 && user.getIdentityNumber()==12345) {
			return true;
		}else if (user.getName()=="Sinan" && user.getSurname()=="Tekin" && user.getBirthYear()==1998 && user.getIdentityNumber()==11111) {
			return true;
		}else if (user.getName()=="Ayşe" && user.getSurname()=="Tekin" && user.getBirthYear()==1969 && user.getIdentityNumber()==22222) {
			return true;
		}else {
			return false;
		}

	}
	
}
