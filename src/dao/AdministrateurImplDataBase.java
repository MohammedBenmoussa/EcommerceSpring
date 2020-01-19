package dao;

import java.util.ArrayList;

import org.hibernate.classic.Session;

import util.HibernateUtil;
public class AdministrateurImplDataBase implements AdministrateurDAO{
	
	public AdministrateurImplDataBase() {
		
	}

	@Override
	public void ajouterAdministrateur(Administrateur p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
	}

	@Override
	public Administrateur rechercherAdministrateurId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Administrateur p = (Administrateur) session.load(Administrateur.class, id);
		return p;
		
	}

	@Override
	public void supprimerAdministrateurId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Administrateur p = (Administrateur) session.load(Administrateur.class, id);
		session.delete(p);
		session.getTransaction().commit();
		
	}

	@Override
	public ArrayList<Administrateur> listAdministrateur() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Administrateur>) session.createQuery("from Administrateur").list();
	}

	@Override
	public void modifierAdministrateurId(int id) {
		// TODO Auto-generated method stub
		
	}

}
