package dao;

import java.util.ArrayList;

public interface ProduitDAO {
	public void ajouterProduit(Produit p);
	public Produit rechercherProduitId(int id);
	public void supprimerProduitId(int id);
	public ArrayList<Produit> listProduit();
	public void modifierProduitId(int id);
}
