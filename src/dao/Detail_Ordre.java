package dao;

public class Detail_Ordre {
	private Long id_detail;
	private int id_ordre;
	private int id_produit;
	private int qte_ordre;
	private double prix_ordre;
	public Detail_Ordre() {
		// TODO Auto-generated constructor stub
	}
	public Detail_Ordre(int id_ordre, int id_produit,
			int qte_ordre, double prix_ordre) {
		super();
		this.id_ordre = id_ordre;
		this.id_produit = id_produit;
		this.qte_ordre = qte_ordre;
		this.prix_ordre = prix_ordre;
	}
	public Long getId_detail() {
		return id_detail;
	}
	public void setId_detail(Long id_detail) {
		this.id_detail = id_detail;
	}
	public int getId_ordre() {
		return id_ordre;
	}
	public void setId_ordre(int id_ordre) {
		this.id_ordre = id_ordre;
	}
	public int getId_produit() {
		return id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	public int getQte_ordre() {
		return qte_ordre;
	}
	public void setQte_ordre(int qte_ordre) {
		this.qte_ordre = qte_ordre;
	}
	public double getPrix_ordre() {
		return prix_ordre;
	}
	public void setPrix_ordre(double prix_ordre) {
		this.prix_ordre = prix_ordre;
	}

}
