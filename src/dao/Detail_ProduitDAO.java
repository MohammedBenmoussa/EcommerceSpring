package dao;

import java.util.ArrayList;

public interface Detail_ProduitDAO {
	public void ajouterDetail_Produit(Detail_Produit p);
	public Detail_Produit rechercherDetail_ProduitId(int id);
	public void supprimerDetail_ProduitId(int id);
	public ArrayList<Detail_Produit> listDetail_Produit();
	public void modifierDetail_ProduitId(int id);
}
