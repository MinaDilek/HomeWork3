package Other;
import Abstract.UserCheckService;
import Abstract.UserService;
import Property.User;

@SuppressWarnings("unused")
public  class eDevletService implements UserCheckService<User> {
	
	public boolean CheckIfRealPerson(User user) {
		System.out.println(user.getUserName()+  ", adlý kiþi doðrulandý.");
		return true;
	}




}
