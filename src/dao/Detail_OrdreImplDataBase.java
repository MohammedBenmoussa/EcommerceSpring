package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;

public class Detail_OrdreImplDataBase implements Detail_OrdreDAO{

	public Detail_OrdreImplDataBase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterDetail_Ordre(Detail_Ordre p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();	
	}

	@Override
	public Detail_Ordre rechercherDetail_OrdreId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Detail_Ordre p = (Detail_Ordre) session.load(Detail_Ordre.class, id);
		return p;
	}

	@Override
	public void supprimerDetail_OrdreId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Detail_Ordre> listDetail_Ordre() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Detail_Ordre>) session.createQuery("from Detail_Ordre").list();
	}


	@Override
	public void modifierDetail_OrdreId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Detail_Ordre> listDetail_OrdreParOrdre(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return  (ArrayList<Detail_Ordre>) session.createQuery("from Detail_Ordre where ID_ORDRE='"+id+"'").list();
	}

}
