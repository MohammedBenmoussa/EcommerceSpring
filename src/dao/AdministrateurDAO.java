package dao;

import java.util.ArrayList;

public interface AdministrateurDAO {
	public void ajouterAdministrateur(Administrateur p);
	public Administrateur rechercherAdministrateurId(int id);
	public void supprimerAdministrateurId(int id);
	public ArrayList<Administrateur> listAdministrateur();
	public void modifierAdministrateurId(int id);
}
