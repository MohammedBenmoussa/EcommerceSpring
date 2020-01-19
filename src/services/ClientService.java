package services;

import java.util.ArrayList;

import dao.Client;

public interface ClientService {
	public void ajouterClient(Client p);
	public Client rechercherClientId(int id);
	public void supprimerClientId(int id);
	public ArrayList<Client> listClient();
	public void modifierClientId(int id);
	public ArrayList<Client> connexion(String email, String password);
}
