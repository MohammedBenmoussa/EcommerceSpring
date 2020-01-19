package services;

import java.util.ArrayList;

import dao.Vente_retour;
import dao.Vente_retourDAO;

public class Vente_retourImplService implements Vente_retourService{
	Vente_retourDAO dao;
	public Vente_retourImplService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterVente_retour(Vente_retour p) {
		dao.ajouterVente_retour(p);
		
	}

	@Override
	public Vente_retour rechercherVente_retourId(int id) {
		
		return dao.rechercherVente_retourId(id);
	}

	@Override
	public void supprimerVente_retourId(int id) {
		dao.supprimerVente_retourId(id);
		
	}

	@Override
	public ArrayList<Vente_retour> listVente_retour() {
		
		return dao.listVente_retour();
	}

	@Override
	public void modifierVente_retourId(int id) {
		dao.modifierVente_retourId(id);
		
	}
	public void setDao(Vente_retourDAO dao) {
		this.dao = dao;
	}
}
