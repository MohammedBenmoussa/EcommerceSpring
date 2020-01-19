package services;

import java.util.ArrayList;

import dao.Detail_Ordre;

public interface Detail_OrdreService {
	public void ajouterDetail_Ordre(Detail_Ordre p);
	public Detail_Ordre rechercherDetail_OrdreId(int id);
	public void supprimerDetail_OrdreId(int id);
	public ArrayList<Detail_Ordre> listDetail_Ordre();
	public void modifierDetail_OrdreId(int id);
	public ArrayList<Detail_Ordre> listDetail_OrdreParOrdre(int id);

}
