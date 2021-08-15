package Abstract;

import Abstract.UserService;

@SuppressWarnings("unused")
public interface UserCheckService<User> {
	boolean CheckIfRealPerson(User user);

}
