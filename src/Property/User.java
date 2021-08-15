package Property;

public class User {
	String userName;
	String eMail;
	int passWord;
	public User() {};
	public User(String userName, String eMail, int passWord) {
		super();
		this.userName = userName;
		this.eMail = eMail;
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getPassWord() {
		return passWord;
	}
	public void setPassWord(int passWord) {
		this.passWord = passWord;
	}

}
