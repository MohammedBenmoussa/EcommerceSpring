package services;

import java.util.ArrayList;

import dao.Administrateur;
import dao.AdministrateurDAO;

public class AdministrateurImplService implements AdministrateurService{
	AdministrateurDAO dao;
	public AdministrateurImplService() {
	
	}

	@Override
	public void ajouterAdministrateur(Administrateur p) {
		 dao.ajouterAdministrateur(p);
		
	}

	@Override
	public Administrateur rechercherAdministrateurId(int id) {

		return dao.rechercherAdministrateurId(id);
	}

	@Override
	public void supprimerAdministrateurId(int id) {
		 dao.supprimerAdministrateurId(id);
		
	}

	@Override
	public ArrayList<Administrateur> listAdministrateur() {
		// TODO Auto-generated method stub
		return dao.listAdministrateur();
	}

	@Override
	public void modifierAdministrateurId(int id) {
		
		dao.modifierAdministrateurId(id);
		
	}
	


public void setDao(AdministrateurDAO dao) {
		this.dao = dao;
	}

private void init() {
	System.out.println("hello world");

}
}
