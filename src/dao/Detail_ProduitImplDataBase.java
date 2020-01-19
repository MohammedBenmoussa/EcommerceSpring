package dao;

import java.util.ArrayList;

import org.hibernate.Session;

import util.HibernateUtil;

public class Detail_ProduitImplDataBase implements Detail_ProduitDAO{

	public Detail_ProduitImplDataBase() {
		
	}

	@Override
	public void ajouterDetail_Produit(Detail_Produit p) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}

	@Override
	public Detail_Produit rechercherDetail_ProduitId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Detail_Produit p = (Detail_Produit) session.load(Detail_Produit.class, id);
		return p;
	}

	@Override
	public void supprimerDetail_ProduitId(int id) {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Detail_Produit p = (Detail_Produit) session.load(Detail_Produit.class, id);
		session.delete(p);
		session.getTransaction().commit();
	}

	@Override
	public ArrayList<Detail_Produit> listDetail_Produit() {
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return (ArrayList<Detail_Produit>) session.createQuery("from Detail_Produit").list();
	}

	@Override
	public void modifierDetail_ProduitId(int id) {
		// TODO Auto-generated method stub
		
	}

}
