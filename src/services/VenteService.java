package services;

import java.util.ArrayList;

import dao.Vente;

public interface VenteService {
	public void ajouterVente(Vente p);
	public Vente rechercherVenteId(int id);
	public void supprimerVenteId(int id);
	public ArrayList<Vente> listVente();
	public void modifierVenteId(int id);
}
