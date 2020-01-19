package dao;

import java.util.ArrayList;

public interface OrdreDAO {
	public void ajouterOrdre(Ordre p);
	public Ordre rechercherOrdreId(int id);
	public void supprimerOrdreId(int id);
	public ArrayList<Ordre> listOrdre();
	public void modifierOrdreId(int id);
	public Integer max_Ordre();
}
