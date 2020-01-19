package dao;

public class Produit {
	private int id_prod;
	private int id_prod_cat;
	private String prod_status;


	public Produit() {
		// TODO Auto-generated constructor stub
	}
	public Produit(int id_prod, int id_prod_cat, String prod_status) {
		super();
		this.id_prod = id_prod;
		this.id_prod_cat = id_prod_cat;
		this.prod_status = prod_status;
	}
	public Produit(int id_prod_cat, String prod_status) {
		super();
		this.id_prod_cat = id_prod_cat;
		this.prod_status = prod_status;
	}
	public int getId_prod() {
		return id_prod;
	}
	public void setId_prod(int id_prod) {
		this.id_prod = id_prod;
	}
	public int getId_prod_cat() {
		return id_prod_cat;
	}
	public void setId_prod_cat(int id_prod_cat) {
		this.id_prod_cat = id_prod_cat;
	}
	public String getProd_status() {
		return prod_status;
	}
	public void setProd_status(String prod_status) {
		this.prod_status = prod_status;
	}

}
