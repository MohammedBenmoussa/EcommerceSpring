package controller;




import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import services.CategorieService;
import services.Detail_ProduitService;
import services.ProduitService;
import dao.Detail_Produit;
@Controller
public class DetailProduit {
	@Autowired
	Detail_ProduitService service;
	@Autowired
	ProduitService service1;
	@Autowired
	CategorieService service2;
	static ArrayList<Detail_Produit> listeShop=new ArrayList<Detail_Produit>();
	static ArrayList<Integer> qte=new ArrayList<Integer>();
	public DetailProduit() {
	}
	@RequestMapping(value="/lolo")
	public String pagelolo(Model model, HttpSession session,@RequestParam int id)
	{
		Detail_Produit dp = service.rechercherDetail_ProduitId(id);
		model.addAttribute("detailProduit",dp);
		return "produitdesign";
	}
	
	
	
	//produit.aspx
	@RequestMapping(value="/ajouterdetailproduit")
	public String pageajouterdetailProduit(Model model, HttpSession session,Detail_Produit dp)
	{
		model.addAttribute("listCat",service2.listCategorie());
		model.addAttribute("listProduit",service1.listProduit());
		
		service.ajouterDetail_Produit(dp);
		

		model.addAttribute("lstprd",service.listDetail_Produit());
		return "produit";
	}	
	
	
	//produit.aspx
		@RequestMapping(value="/panier")
		public String pagepanier(Model model, HttpSession session ,@RequestParam int id)
		{
			
			int valide=0;
			if(UtilisateurControlleur.v!=0)
			{
				ArrayList<Detail_Produit> list=(ArrayList<Detail_Produit>) session.getAttribute("shop");
				ArrayList<Detail_Produit> listtmp=new ArrayList<Detail_Produit> ();
				int qt;
				for (Detail_Produit detail_Produit : list) 
					{
						
							if(detail_Produit.getId_detail_produit()==id)
							{
								qt=detail_Produit.getQte_demander();
								detail_Produit.setQte_demander(++qt);
								System.out.println(qt++);
								valide=1;
							}
							listtmp.add(detail_Produit);
							session.setAttribute("shop",listtmp);
					}
			}
			
			if(UtilisateurControlleur.v==0)
			{
				UtilisateurControlleur.v++;
				Detail_Produit shop=service.rechercherDetail_ProduitId(id);
				shop.setQte_demander(1);
				listeShop.add(shop);
				session.setAttribute("shop",listeShop);
				session.setAttribute("paniervaleur", UtilisateurControlleur.v);
			}

			else 
			{
				if(valide==0){
				ArrayList<Detail_Produit> list=(ArrayList<Detail_Produit>) session.getAttribute("shop");
				ArrayList<Detail_Produit> listtmp=new ArrayList<Detail_Produit> ();
				for (Detail_Produit detail_Produit : list) 
					{
					listtmp.add(detail_Produit);
					}
					UtilisateurControlleur.v++;
					Detail_Produit shop=service.rechercherDetail_ProduitId(id);
					shop.setQte_demander(1);
					listtmp.add(shop);
					session.setAttribute("shop",listtmp);
					session.setAttribute("paniervaleur", UtilisateurControlleur.v);
			}
			}
			return "redirect:profil.aspx";
		}
			
		//supprimershop
		@RequestMapping(value="/supprimershop")
		public String pagesupprimershop(Model model, HttpSession session ,@RequestParam int idp)
		{
		
			UtilisateurControlleur.v--;
			ArrayList<Detail_Produit> listeShop= (ArrayList<Detail_Produit>) session.getAttribute("shop");
			ArrayList<Detail_Produit> listtmp=new ArrayList<Detail_Produit> ();
			for (Detail_Produit detail_Produit : listeShop) 
			{
					if(detail_Produit.getId_detail_produit()!=idp)
					{
						listtmp.add(detail_Produit);
					}
			}
			session.setAttribute("shop",listtmp);
			session.setAttribute("paniervaleur", UtilisateurControlleur.v);
				
			return "shop";
		}
		
		
	
		
}
