package Concrete;
import Abstract.UserCheckService;
import Property.User;

public class UserCheckManager implements UserCheckService<User> {
	public boolean CheckIfRealPerson(User user) {
		return true;
	}

	

}
