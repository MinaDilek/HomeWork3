package Concrete;
import Property.Game;
import Abstract.GameService;


public class GameManager implements GameService{
	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ "adl� oyun eklendi.");
	}
	@Override
	public void delete(Game game) {
		System.out.println(game.getType() + " ,t�r�ndeki oyun silinmi�tir.");
	}
	@Override
	
	public void update(Game game) {
		System.out.println(game.getGameName()+ "adl� oyunun �creti: "+ game.getPrice()+ "olarak g�ncellenmi�tir.");
	}
	
		
	}
	


