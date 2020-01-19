package dao;

public class Vente_retour {
	private int id_retour;
	private int id_retour_vente;
	private int id_prod;
	private int qte_retour;
	private String date_retour;
	private String cause_retour;
	public Vente_retour() {
		// TODO Auto-generated constructor stub
	}
	public Vente_retour(int id_retour, int id_retour_vente, int id_prod,
			int qte_retour, String date_retour, String cause_retour) {
		super();
		this.id_retour = id_retour;
		this.id_retour_vente = id_retour_vente;
		this.id_prod = id_prod;
		this.qte_retour = qte_retour;
		this.date_retour = date_retour;
		this.cause_retour = cause_retour;
	}
	public Vente_retour(int id_retour_vente, int id_prod, int qte_retour,
			String date_retour, String cause_retour) {
		super();
		this.id_retour_vente = id_retour_vente;
		this.id_prod = id_prod;
		this.qte_retour = qte_retour;
		this.date_retour = date_retour;
		this.cause_retour = cause_retour;
	}
	public int getId_retour() {
		return id_retour;
	}
	public void setId_retour(int id_retour) {
		this.id_retour = id_retour;
	}
	public int getId_retour_vente() {
		return id_retour_vente;
	}
	public void setId_retour_vente(int id_retour_vente) {
		this.id_retour_vente = id_retour_vente;
	}
	public int getId_prod() {
		return id_prod;
	}
	public void setId_prod(int id_prod) {
		this.id_prod = id_prod;
	}
	public int getQte_retour() {
		return qte_retour;
	}
	public void setQte_retour(int qte_retour) {
		this.qte_retour = qte_retour;
	}
	public String getDate_retour() {
		return date_retour;
	}
	public void setDate_retour(String date_retour) {
		this.date_retour = date_retour;
	}
	public String getCause_retour() {
		return cause_retour;
	}
	public void setCause_retour(String cause_retour) {
		this.cause_retour = cause_retour;
	}

}
