package services;

import java.util.ArrayList;

import dao.Produit;

public interface ProduitService {
	public void ajouterProduit(Produit p);
	public Produit rechercherProduitId(int id);
	public void supprimerProduitId(int id);
	public ArrayList<Produit> listProduit();
	public void modifierProduitId(int id);
}
