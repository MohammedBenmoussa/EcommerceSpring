package dao;

import java.util.ArrayList;

import org.hibernate.Session;

import util.HibernateUtil;

public class ProduitImplDataBase implements ProduitDAO{

	public ProduitImplDataBase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterProduit(Produit p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
	}

	@Override
	public Produit rechercherProduitId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p = (Produit) session.load(Produit.class, id);
		return p;
	}

	@Override
	public void supprimerProduitId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Produit p = (Produit) session.load(Produit.class, id);
		session.delete(p);
		session.getTransaction().commit();
	}

	@Override
	public ArrayList<Produit> listProduit() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Produit>) session.createQuery("from Produit").list();
	}

	@Override
	public void modifierProduitId(int id) {
		// TODO Auto-generated method stub
		
	}

}
