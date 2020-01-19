package services;

import java.util.ArrayList;

import dao.Detail_Produit;
import dao.Detail_ProduitDAO;

public class Detail_ProduitImplService implements Detail_ProduitService{
	Detail_ProduitDAO dao;
	public Detail_ProduitImplService() {
		
	}

	@Override
	public void ajouterDetail_Produit(Detail_Produit p) {
		dao.ajouterDetail_Produit(p);
		
	}

	@Override
	public Detail_Produit rechercherDetail_ProduitId(int id) {
		
		return dao.rechercherDetail_ProduitId(id);
	}

	@Override
	public void supprimerDetail_ProduitId(int id) {
		dao.supprimerDetail_ProduitId(id);
		
	}

	@Override
	public ArrayList<Detail_Produit> listDetail_Produit() {
		
		return dao.listDetail_Produit();
	}

	@Override
	public void modifierDetail_ProduitId(int id) {
		dao.modifierDetail_ProduitId(id);
		
	}
	public void setDao(Detail_ProduitDAO dao) {
		this.dao = dao;
	}
}
