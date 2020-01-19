package dao;

import java.util.ArrayList;

public interface Vente_retourDAO {
	public void ajouterVente_retour(Vente_retour p);      
	public Vente_retour rechercherVente_retourId(int id); 
	public void supprimerVente_retourId(int id);   
	public ArrayList<Vente_retour> listVente_retour();    
	public void modifierVente_retourId(int id);    
	                                        
}
