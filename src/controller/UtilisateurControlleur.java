
package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import services.CategorieService;
import services.ClientService;
import services.Detail_ProduitService;
import dao.Client;
import dao.Detail_Produit;

@Controller
public class UtilisateurControlleur {
	@Autowired
	ClientService service;
	@Autowired
	CategorieService service1;
	@Autowired
	Detail_ProduitService service2;
	static int v=0;
	public UtilisateurControlleur() {
		// TODO Auto-generated constructor stub
	}
	//inscription.aspx
	@RequestMapping(value="/index")
	public String pageIndex(Model model, HttpSession session)
	{
		model.addAttribute("listCat",service1.listCategorie());
		model.addAttribute("listeProd",service2.listDetail_Produit());
		session.setAttribute("paniervaleur",v);
		return "index";
	}
	
	
		//inscription.aspx
		@RequestMapping(value="/inscription")
		public String pageInscription(Model model, HttpSession session)
		{
			
			return "inscription";
		}

		//connexion.aspx
		@RequestMapping(value="/connexion")
		public String pageConnexion(Model model, HttpSession session)
		{
			
			return "connexion";
		}
		//valideinscription.aspx
		@RequestMapping(value="/valideinscription")
		public String pagevalideinscription(Model model, HttpSession session, Client p)
		{
			p.setIdrole(2);
			service.ajouterClient(p);
			 
			
			return "redirect:connexion.aspx";
		}
		
		
		//client.aspx
		@RequestMapping(value="/client")
		public String pageClient(Model model, HttpSession session)
		{
			model.addAttribute("listClient",service.listClient());
			return "client";
		}
		
		//supprimerClient.aspx
				@RequestMapping(value="/supprimerClient")
				public String pageSupprimerClient(Model model, HttpSession session,@RequestParam int id)
				{
					service.supprimerClientId(id);
					model.addAttribute("listClient",service.listClient());
					return "redirect:client.aspx";
				}
				
			
				//	valideconnexion.aspx
				@RequestMapping(value="/valideconnexion")
				public String pagevalideconnexion(Model model, HttpSession session,@RequestParam String email_client,
						@RequestParam String password)
				{
					ArrayList<Client> liste=service.connexion(email_client, password);
					Client c=null;
					boolean trouve=false;
					for (Client client : liste) {
						if(client.getEmail_client().equals(email_client) &&client.getPassword().equals(password))
						{
							c=client;
							trouve=true;
							break;
						}
					}
					
					if(trouve==true)
					{
					session.setAttribute("idclient", c.getId_client());
					
					model.addAttribute("connexion",c);
					 
					session.setAttribute("email", c.getEmail_client());
					session.setAttribute("nom", c.getNom_client());
					if(c.getIdrole()==1)
						session.setAttribute("admin", c.getIdrole());
					else
						session.setAttribute("user", c.getIdrole());
					
					
					
					
					model.addAttribute("listeProd",service2.listDetail_Produit());
					return "redirect:profil.aspx";
					}else
					{
						session.setAttribute("errone", "errone");
						return "redirect:connexion.aspx";
					}
				}
				@RequestMapping(value="/profil")
				public String pageProfil(Model model, HttpSession session,HttpSession session1)
				{
					model.addAttribute("listeProd",service2.listDetail_Produit());
					return "profil";
				}
				//deconnexion.aspx
				@RequestMapping(value="/deconnexion")
				public String pageDeconnexion(Model model, HttpSession session,HttpSession session1)
				{
					UtilisateurControlleur.v=0;
					model.addAttribute("listCat",service1.listCategorie());
					model.addAttribute("listeProd",service2.listDetail_Produit());
					
					/*vide array liste panier*/
					if(session.getAttribute("shop") != null)
					{
					ArrayList<Detail_Produit> listeShop= (ArrayList<Detail_Produit>) session.getAttribute("shop");
					
					listeShop.clear();
					session.setAttribute("shop",listeShop);
					}
					session.invalidate();
					
					
					return "redirect:index.aspx";
				}
				//vidercart.aspx
				@RequestMapping(value="/vidercart")
				public String pageVidercart(Model model, HttpSession session,HttpSession session1)
				{
					UtilisateurControlleur.v=0;
					
					
		
		  model.addAttribute("listCat",service1.listCategorie());
		  model.addAttribute("listeProd",service2.listDetail_Produit());
		 
					/*vide array liste panier*/
					if(session.getAttribute("shop") != null)
					{
					ArrayList<Detail_Produit> listeShop= (ArrayList<Detail_Produit>) session.getAttribute("shop");
					
					listeShop.clear();
					session.setAttribute("shop",listeShop);
					}
					
			 
					return "redirect:index.aspx";
				}
				//ERREUR PAIMENT.aspx
				@RequestMapping(value="/erreurpaiment")
				public String pageErreurpaiment(Model model, HttpSession session,HttpSession session1)
				{
					UtilisateurControlleur.v=0;
		
				  model.addAttribute("listCat",service1.listCategorie());
				  model.addAttribute("listeProd",service2.listDetail_Produit());
		 
				/*vide array liste panier*/
			if(session.getAttribute("shop") != null)
			{
			ArrayList<Detail_Produit> listeShop= (ArrayList<Detail_Produit>) session.getAttribute("shop");
			
			listeShop.clear();
			session.setAttribute("shop",listeShop);
			}
			session.setAttribute("paniervaleur",0);
					
					return "redirect:profil.aspx";
				}
}
