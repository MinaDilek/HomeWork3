package Property;

public class Game {
	String gameName;
	String type;
	int price;
	public Game() {};
	public Game(String gameName, String type, int price) {
		super();
		this.gameName = gameName;
		this.type = type;
		this.price = price;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
