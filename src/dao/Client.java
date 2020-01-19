package dao;

public class Client {
	private int id_client;
	private String nom_client;
	private String email_client;
	private String password;
	private String adresse_client;
	private int idrole;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Client(int id_client, String nom_client, String email_client,
			String password, String adresse_client,int idrole) {
		super();
		this.id_client = id_client;
		this.nom_client = nom_client;
		this.email_client = email_client;
		this.password = password;
		this.adresse_client = adresse_client;
		this.idrole=idrole;
	}
	public Client(String nom_client, String email_client, String password,
			String adresse_client,int idrole) {
		super();
		this.nom_client = nom_client;
		this.email_client = email_client;
		this.password = password;
		this.adresse_client = adresse_client;
		this.idrole=idrole;
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	public String getEmail_client() {
		return email_client;
	}
	public void setEmail_client(String email_client) {
		this.email_client = email_client;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdresse_client() {
		return adresse_client;
	}
	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}
	public int getIdrole() {
		return idrole;
	}
	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

}
