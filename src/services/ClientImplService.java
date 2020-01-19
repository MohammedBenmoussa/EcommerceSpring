package services;

import java.util.ArrayList;

import dao.Client;
import dao.ClientDAO;

public class ClientImplService implements ClientService{
	ClientDAO dao;
	public ClientImplService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterClient(Client p) {
		
		dao.ajouterClient(p);
	}

	@Override
	public Client rechercherClientId(int id) {
		// TODO Auto-generated method stub
		return dao.rechercherClientId(id);
	}

	@Override
	public void supprimerClientId(int id) {
		dao.supprimerClientId(id);
		
	}

	@Override
	public ArrayList<Client> listClient() {
		// TODO Auto-generated method stub
		return dao.listClient();
	}

	@Override
	public void modifierClientId(int id) {
		dao.modifierClientId(id);
		
	}
	public void setDao(ClientDAO dao) {
		this.dao = dao;
	}

	@Override
	public ArrayList<Client> connexion(String email, String password) {
		// TODO Auto-generated method stub
		return dao.connexion(email, password);
	}

}
