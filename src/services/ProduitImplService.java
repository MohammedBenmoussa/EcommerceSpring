package services;

import java.util.ArrayList;

import dao.Produit;
import dao.ProduitDAO;

public class ProduitImplService implements ProduitService{
	ProduitDAO dao;
	public ProduitImplService() {
		
	}

	@Override
	public void ajouterProduit(Produit p) {
		dao.ajouterProduit(p);
		
	}

	@Override
	public Produit rechercherProduitId(int id) {
		
		return dao.rechercherProduitId(id);
	}

	@Override
	public void supprimerProduitId(int id) {
		dao.supprimerProduitId(id);
		
	}

	@Override
	public ArrayList<Produit> listProduit() {
		return dao.listProduit();
	}

	@Override
	public void modifierProduitId(int id) {
		dao.modifierProduitId(id);
		
	}
	public void setDao(ProduitDAO dao) {
		this.dao = dao;
	}
}
