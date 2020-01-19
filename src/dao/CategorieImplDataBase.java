package dao;

import java.util.ArrayList;

import org.hibernate.Session;

import util.HibernateUtil;

public class CategorieImplDataBase implements CategorieDAO{

	public CategorieImplDataBase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterCategorie(Categorie p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
	}

	@Override
	public Categorie rechercherCategorieId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Categorie p = (Categorie) session.load(Categorie.class, id);
		return p;
	}

	@Override
	public void supprimerCategorieId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Categorie p = (Categorie) session.load(Categorie.class, id);
		session.delete(p);
		session.getTransaction().commit();
		
	}

	@Override
	public ArrayList<Categorie> listCategorie() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Categorie>) session.createQuery("from Categorie").list();
	}

	@Override
	public void modifierCategorieId(int id) {
		// TODO Auto-generated method stub
		
	}

}
