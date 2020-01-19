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
import dao.Client;
import dao.Detail_Produit;
import dao.Produit;
@Controller
public class ProduitControlleur {

	
	@Autowired
	CategorieService service;
	@Autowired
	ProduitService service1;
	@Autowired
	Detail_ProduitService service2;
	public ProduitControlleur() {
		// TODO Auto-generated constructor stub
	}
	//produit.aspx
	@RequestMapping(value="/produit")
	public String pageProduit(Model model, HttpSession session)
	{
		model.addAttribute("lstprd",service2.listDetail_Produit());
		
		model.addAttribute("listCat",service.listCategorie());
		
		return "produit";
	}	

	//ajouter.aspx
	@RequestMapping(value="/ajouterProduit")
	public String pageAjouterProduit(Model model, HttpSession session,Produit p)
	{
	
		
		service1.ajouterProduit(p);
		
		model.addAttribute("listCat",service.listCategorie());
		model.addAttribute("lstprd",service2.listDetail_Produit());
		
		
		int fin=service1.listProduit().size()-1;
		model.addAttribute("idprod",service1.listProduit().get(fin).getId_prod());
		return "detailproduit";
	}	
	
	//recherche.aspx
	@RequestMapping(value="/search")
	public String pagerecherche(Model model, HttpSession session,@RequestParam String search)
	{
	
		ArrayList<Detail_Produit> liste=service2.listDetail_Produit();
		ArrayList<Detail_Produit> c=new ArrayList<Detail_Produit>();
		for (Detail_Produit prod : liste) {
			if(prod.getDesignation().equalsIgnoreCase(search))
			{
				c.add(prod);
				
			}
		}
		model.addAttribute("u",c);
		
		 
		
		
		
		
		return "recherche";
	}	
	
	//supprimerProduit.aspx
	@RequestMapping(value="/supprimerProduit")
	public String pagesupprimerProduit(Model model, HttpSession session,@RequestParam int id)
	{
		service2.supprimerDetail_ProduitId(id);
		model.addAttribute("lstprd",service2.listDetail_Produit());
	
		return "redirect:produit.aspx";
	}	

}
