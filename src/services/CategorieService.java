package services;

import java.util.ArrayList;

import dao.Categorie;

public interface CategorieService {
	public void ajouterCategorie(Categorie p);
	public Categorie rechercherCategorieId(int id);
	public void supprimerCategorieId(int id);
	public ArrayList<Categorie> listCategorie();
	public void modifierCategorieId(int id);
}
