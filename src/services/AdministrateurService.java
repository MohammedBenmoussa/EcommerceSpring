package services;

import java.util.ArrayList;

import dao.Administrateur;


public interface AdministrateurService {
	public void ajouterAdministrateur(Administrateur p);
	public Administrateur rechercherAdministrateurId(int id);
	public void supprimerAdministrateurId(int id);
	public ArrayList<Administrateur> listAdministrateur();
	public void modifierAdministrateurId(int id);
}
