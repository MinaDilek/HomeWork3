package Concrete;
import Property.Game;
import Abstract.GameService;


public class GameManager implements GameService{
	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ "adlý oyun eklendi.");
	}
	@Override
	public void delete(Game game) {
		System.out.println(game.getType() + " ,türündeki oyun silinmiþtir.");
	}
	@Override
	
	public void update(Game game) {
		System.out.println(game.getGameName()+ "adlý oyunun ücreti: "+ game.getPrice()+ "olarak güncellenmiþtir.");
	}
	
		
	}
	


