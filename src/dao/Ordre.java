package dao;

public class Ordre {
	private int id_ord;
	private int id_client_ord;
	private String date_ord;
	private String status_ord;
	public Ordre() {
		// TODO Auto-generated constructor stub
	}
	public Ordre(int id_ord, int id_client_ord, String date_ord,
			String status_ord) {
		super();
		this.id_ord = id_ord;
		this.id_client_ord = id_client_ord;
		this.date_ord = date_ord;
		this.status_ord = status_ord;
	}
	public Ordre(int id_client_ord, String date_ord, String status_ord) {
		super();
		this.id_client_ord = id_client_ord;
		this.date_ord = date_ord;
		this.status_ord = status_ord;
	}
	public int getId_ord() {
		return id_ord;
	}
	public void setId_ord(int id_ord) {
		this.id_ord = id_ord;
	}
	public int getId_client_ord() {
		return id_client_ord;
	}
	public void setId_client_ord(int id_client_ord) {
		this.id_client_ord = id_client_ord;
	}
	public String getDate_ord() {
		return date_ord;
	}
	public void setDate_ord(String date_ord) {
		this.date_ord = date_ord;
	}
	public String getStatus_ord() {
		return status_ord;
	}
	public void setStatus_ord(String status_ord) {
		this.status_ord = status_ord;
	}

}
