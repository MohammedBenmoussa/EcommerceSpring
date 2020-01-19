package dao;

import java.util.ArrayList;

public interface Detail_OrdreDAO {
	public void ajouterDetail_Ordre(Detail_Ordre p);
	public Detail_Ordre rechercherDetail_OrdreId(int id);
	public void supprimerDetail_OrdreId(int id);
	public ArrayList<Detail_Ordre> listDetail_Ordre();
	public void modifierDetail_OrdreId(int id);
	public ArrayList<Detail_Ordre> listDetail_OrdreParOrdre(int id);
	
}
