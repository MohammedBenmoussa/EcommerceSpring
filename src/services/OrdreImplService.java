package services;

import java.util.ArrayList;

import dao.Ordre;
import dao.OrdreDAO;

public class OrdreImplService implements OrdreService{
	OrdreDAO dao;
	public OrdreImplService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterOrdre(Ordre p) {
		dao.ajouterOrdre(p);
		
	}

	@Override
	public Ordre rechercherOrdreId(int id) {
	return dao.rechercherOrdreId(id);
	}

	@Override
	public void supprimerOrdreId(int id) {
		dao.supprimerOrdreId(id);
		
	}

	@Override
	public ArrayList<Ordre> listOrdre() {
		return dao.listOrdre();
	}

	@Override
	public void modifierOrdreId(int id) {
		dao.modifierOrdreId(id);
		
	}
	public void setDao(OrdreDAO dao) {
		this.dao = dao;
	}

	@Override
	public Integer max_Ordre() {
		// TODO Auto-generated method stub
		return dao.max_Ordre();
	}
}
