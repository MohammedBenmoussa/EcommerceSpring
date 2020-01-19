package dao;

public class Administrateur {
	private int id;
	private String login;
	private String password;
	public Administrateur() {
		// TODO Auto-generated constructor stub
	}
	
	public Administrateur(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public Administrateur(int id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
