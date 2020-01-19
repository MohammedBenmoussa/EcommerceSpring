package dao;

import java.util.ArrayList;

import org.hibernate.Session;

import util.HibernateUtil;

public class VenteImplDataBase implements VenteDAO{

	public VenteImplDataBase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterVente(Vente p) {

		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
	}

	@Override
	public Vente rechercherVenteId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Vente p = (Vente) session.load(Vente.class, id);
		return p;
	}

	@Override
	public void supprimerVenteId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Vente p = (Vente) session.load(Vente.class, id);
		session.delete(p);
		session.getTransaction().commit();
		
	}

	@Override
	public ArrayList<Vente> listVente() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Vente>) session.createQuery("from Vente").list();
	}

	@Override
	public void modifierVenteId(int id) {
		// TODO Auto-generated method stub
		
	}

}
