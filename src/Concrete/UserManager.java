package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Property.User;


public class UserManager implements UserService{
	UserCheckService<User> userCheckService;
	public UserManager(UserCheckService<User> userCheckService) {
		this.userCheckService =userCheckService;
	}
	@Override
	public void add(User user) {
		if(userCheckService.CheckIfRealPerson(user) ) {
			System.out.println("Oyuncu eklendi.");
		}else {
			System.out.println("Oyuncu eklenemedi.");
		}
	}
	
	public void delete(User user) {
		System.out.println(user.getUserName()+ "Adlý oyuncu silindi.");
	}
	@Override
	
	public void update(User user) {
		System.out.println(user.getUserName()+ "Adlý oyuncu bilgileri güncellendi.");
	}
	
	
	
	

}
