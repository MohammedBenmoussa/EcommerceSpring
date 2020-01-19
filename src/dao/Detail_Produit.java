package dao;

public class Detail_Produit {
	private int id_detail_produit;
	private int id_prod;
	private String designation;
	private double prix;
	private int quantite_produit;
	private String image;
	private String description;
	private int qte_demander;
	public Detail_Produit() {
		// TODO Auto-generated constructor stub
	}
	public Detail_Produit(int id_detail_produit, int id_prod,
			String designation, double prix, int quantite_produit,
			String image, String description) {
		super();
		this.id_detail_produit = id_detail_produit;
		this.id_prod = id_prod;
		this.designation = designation;
		this.prix = prix;
		this.quantite_produit = quantite_produit;
		this.image = image;
		this.description = description;
	}
	public Detail_Produit(int id_prod, String designation, double prix,
			int quantite_produit, String image, String description) {
		super();
		this.id_prod = id_prod;
		this.designation = designation;
		this.prix = prix;
		this.quantite_produit = quantite_produit;
		this.image = image;
		this.description = description;
	}
	public int getId_detail_produit() {
		return id_detail_produit;
	}
	public void setId_detail_produit(int id_detail_produit) {
		this.id_detail_produit = id_detail_produit;
	}
	public int getId_prod() {
		return id_prod;
	}
	public void setId_prod(int id_prod) {
		this.id_prod = id_prod;
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
	public int getQuantite_produit() {
		return quantite_produit;
	}
	public void setQuantite_produit(int quantite_produit) {
		this.quantite_produit = quantite_produit;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQte_demander() {
		return qte_demander;
	}
	public void setQte_demander(int qte_demander) {
		this.qte_demander = qte_demander;
	}
	
}
