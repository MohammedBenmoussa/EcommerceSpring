package services;

import java.util.ArrayList;

import dao.Ordre;

public interface OrdreService {
	public void ajouterOrdre(Ordre p);
	public Ordre rechercherOrdreId(int id);
	public void supprimerOrdreId(int id);
	public ArrayList<Ordre> listOrdre();
	public void modifierOrdreId(int id);
	public Integer max_Ordre();
}
