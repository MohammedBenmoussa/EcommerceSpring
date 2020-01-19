package dao;

import java.util.ArrayList;

import org.hibernate.Session;

import util.HibernateUtil;

public class Vente_retourImplDataBase implements Vente_retourDAO{

	public Vente_retourImplDataBase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterVente_retour(Vente_retour p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();	
		
	}

	@Override
	public Vente_retour rechercherVente_retourId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Vente_retour p = (Vente_retour) session.load(Vente_retour.class, id);
		return p;
	}

	@Override
	public void supprimerVente_retourId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Vente_retour p = (Vente_retour) session.load(Vente_retour.class, id);
		session.delete(p);
		session.getTransaction().commit();
		
	}

	@Override
	public ArrayList<Vente_retour> listVente_retour() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Vente_retour>) session.createQuery("from Vente_retour").list();
	}

	@Override
	public void modifierVente_retourId(int id) {
		// TODO Auto-generated method stub
		
	}

}
