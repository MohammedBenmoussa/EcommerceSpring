package services;

import java.util.ArrayList;

import dao.Categorie;
import dao.CategorieDAO;

public class CategorieImplService implements CategorieService{
	CategorieDAO dao;
	public CategorieImplService() {
		
	}

	@Override
	public void ajouterCategorie(Categorie p) {
		dao.ajouterCategorie(p);
		
	}

	@Override
	public Categorie rechercherCategorieId(int id) {
		return dao.rechercherCategorieId(id);
	}

	@Override
	public void supprimerCategorieId(int id) {
		dao.supprimerCategorieId(id);
		
	}

	@Override
	public ArrayList<Categorie> listCategorie() {
		return dao.listCategorie();
	}

	@Override
	public void modifierCategorieId(int id) {
		dao.modifierCategorieId(id);		
	}
	public void setDao(CategorieDAO dao) {
		this.dao = dao;
	}
}
