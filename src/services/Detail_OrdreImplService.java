package services;

import java.util.ArrayList;

import dao.Detail_Ordre;
import dao.Detail_OrdreDAO;

public class Detail_OrdreImplService implements Detail_OrdreService{
	Detail_OrdreDAO dao;
	public Detail_OrdreImplService() {
		
	}

	@Override
	public void ajouterDetail_Ordre(Detail_Ordre p) {
		dao.ajouterDetail_Ordre(p);
		
	}

	@Override
	public Detail_Ordre rechercherDetail_OrdreId(int id) {
			return dao.rechercherDetail_OrdreId(id);
	}

	@Override
	public void supprimerDetail_OrdreId(int id) {
		dao.supprimerDetail_OrdreId(id);
		
	}

	@Override
	public ArrayList<Detail_Ordre> listDetail_Ordre() {
		return dao.listDetail_Ordre();
	}

	@Override
	public void modifierDetail_OrdreId(int id) {
		dao.modifierDetail_OrdreId(id);
		
	}
	public void setDao(Detail_OrdreDAO dao) {
		this.dao = dao;
	}

	@Override
	public ArrayList<Detail_Ordre> listDetail_OrdreParOrdre(int id) {
		// TODO Auto-generated method stub
		return dao.listDetail_OrdreParOrdre(id);
	}


}
