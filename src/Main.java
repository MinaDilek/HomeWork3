import Property.Campaign;
import Property.Game;
import Property.User;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.UserManager;
import Other.eDevletService;



public class Main {

	public static void main(String[] args) {
		User users = new User("mina","minadilek@gmail.com",123456789);
		Game games = new Game("GTA","Open World",200);
		Campaign campaigns = new Campaign("Black Friday",26,50);
		
		
		UserManager userManager = new UserManager( new eDevletService());
		userManager.add(users);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaigns);
		
		GameManager gameManager = new GameManager();
		gameManager.delete(games);
		gameManager.update(games);
		

	}

}
