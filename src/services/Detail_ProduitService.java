package services;

import java.util.ArrayList;

import dao.Detail_Produit;

public interface Detail_ProduitService {
	public void ajouterDetail_Produit(Detail_Produit p);
	public Detail_Produit rechercherDetail_ProduitId(int id);
	public void supprimerDetail_ProduitId(int id);
	public ArrayList<Detail_Produit> listDetail_Produit();
	public void modifierDetail_ProduitId(int id);
}
