package dao;

public class Shop {
	private int id_detail_produit;
	private String designation;
	private double prix;
	private int dem;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(int id_detail_produit, String designation, double prix, int dem) {
		super();
		this.id_detail_produit = id_detail_produit;
		this.designation = designation;
		this.prix = prix;
		this.dem = dem;
	}
	public int getId_detail_produit() {
		return id_detail_produit;
	}
	public void setId_detail_produit(int id_detail_produit) {
		this.id_detail_produit = id_detail_produit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getDem() {
		return dem;
	}
	public void setDem(int dem) {
		this.dem = dem;
	}
	
	
}
