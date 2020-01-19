package dao;

import java.util.ArrayList;

public interface VenteDAO {
	public void ajouterVente(Vente p);
	public Vente rechercherVenteId(int id);
	public void supprimerVenteId(int id);
	public ArrayList<Vente> listVente();
	public void modifierVenteId(int id);
}
