package dao;

import java.util.ArrayList;

public interface CategorieDAO {
	public void ajouterCategorie(Categorie p);
	public Categorie rechercherCategorieId(int id);
	public void supprimerCategorieId(int id);
	public ArrayList<Categorie> listCategorie();
	public void modifierCategorieId(int id);
}
