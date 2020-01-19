package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import services.CategorieService;
import dao.Categorie;

@Controller
public class CategorieControlleur {
	@Autowired
	CategorieService service;
	
		public CategorieControlleur() {
		// TODO Auto-generated constructor stub
	}
	//inscription.aspx
	@RequestMapping(value="/categorie")
	public String pageCategorie(Model model, HttpSession session)
	{
		if(service.listCategorie()!=null)
		model.addAttribute("listCategorie",service.listCategorie());
		else
		model.addAttribute("listCategorie",null);
		return "categorie";
	}
	
	//ajouterCategorie.aspx
	@RequestMapping(value="/ajouterCategorie")
	public String pageAjouterCategorie(Model model, HttpSession session,Categorie p)
	{
		
		service.ajouterCategorie(p);
		model.addAttribute("listCategorie",service.listCategorie());
		return "categorie";
	}
	//supprimerCategorie.aspx
	@RequestMapping(value="/supprimerCategorie")
	public String pageSupprimerCategorie(Model model, HttpSession session,@RequestParam int id)
	{
		
		service.supprimerCategorieId(id);
		model.addAttribute("listCategorie",service.listCategorie());
		return "redirect:categorie.aspx";
	}
}
