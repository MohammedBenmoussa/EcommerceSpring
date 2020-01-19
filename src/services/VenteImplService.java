package services;

import java.util.ArrayList;

import dao.Vente;
import dao.VenteDAO;

public class VenteImplService implements VenteService{
	private VenteDAO dao;
	public VenteImplService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterVente(Vente p) {
		dao.ajouterVente(p);
		
	}

	@Override
	public Vente rechercherVenteId(int id) {
		
		return dao.rechercherVenteId(id);
	}

	@Override
	public void supprimerVenteId(int id) {
		dao.supprimerVenteId(id);
		
	}

	@Override
	public ArrayList<Vente> listVente() {
		
		return dao.listVente();
	}

	@Override
	public void modifierVenteId(int id) {
		dao.modifierVenteId(id);
		
	}
	public void setDao(VenteDAO dao) {
		this.dao = dao;
	}
}
