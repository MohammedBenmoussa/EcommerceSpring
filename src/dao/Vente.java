package dao;

public class Vente {
	private int id_vente;
	private int id_ordre_vente;
	private String mode_paiement;
	
	public Vente() {
		// TODO Auto-generated constructor stub
	}

	public Vente(int id_vente, int id_ordre_vente, String mode_paiement) {
		super();
		this.id_vente = id_vente;
		this.id_ordre_vente = id_ordre_vente;
		this.mode_paiement = mode_paiement;
	}

	public Vente(int id_ordre_vente, String mode_paiement) {
		super();
		this.id_ordre_vente = id_ordre_vente;
		this.mode_paiement = mode_paiement;
	}

	public int getId_vente() {
		return id_vente;
	}

	public void setId_vente(int id_vente) {
		this.id_vente = id_vente;
	}

	public int getId_ordre_vente() {
		return id_ordre_vente;
	}

	public void setId_ordre_vente(int id_ordre_vente) {
		this.id_ordre_vente = id_ordre_vente;
	}

	public String getMode_paiement() {
		return mode_paiement;
	}

	public void setMode_paiement(String mode_paiement) {
		this.mode_paiement = mode_paiement;
	}

}
