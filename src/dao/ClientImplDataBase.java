package dao;

import java.util.ArrayList;

import org.hibernate.classic.Session;

import util.HibernateUtil;

public class ClientImplDataBase implements ClientDAO{

	public ClientImplDataBase() {
		
	}

	@Override
	public void ajouterClient(Client p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();		
	}

	@Override
	public Client rechercherClientId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Client p = (Client) session.load(Client.class, id);
		return p;
	}

	@Override
	public void supprimerClientId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Client p = (Client) session.load(Client.class, id);
		session.delete(p);
		session.getTransaction().commit();
		
	}

	@Override
	public ArrayList<Client> listClient() {
	
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Client>) session.createQuery("from Client").list();
	}

	@Override
	public void modifierClientId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Client> connexion(String email, String password) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Client>) session.createQuery("from Client").list();
	}

}
