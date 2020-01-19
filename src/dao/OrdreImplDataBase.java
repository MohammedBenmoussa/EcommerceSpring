package dao;

import java.util.ArrayList;

import org.hibernate.Session;

import util.HibernateUtil;

public class OrdreImplDataBase implements OrdreDAO{

	public OrdreImplDataBase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterOrdre(Ordre p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();		
	}

	@Override
	public Ordre rechercherOrdreId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Ordre p = (Ordre) session.load(Ordre.class, id);
		return p;
	}

	@Override
	public void supprimerOrdreId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Ordre p = (Ordre) session.load(Ordre.class, id);
		session.delete(p);
		session.getTransaction().commit();
	}

	@Override
	public ArrayList<Ordre> listOrdre() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Ordre>) session.createQuery("from Ordre").list();
	}

	@Override
	public void modifierOrdreId(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Integer max_Ordre() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (Integer) session.createQuery("select max(id) from Ordre").uniqueResult();
		
	}
}
