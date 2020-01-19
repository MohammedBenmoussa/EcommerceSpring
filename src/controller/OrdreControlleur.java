package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.Detail_Ordre;
import dao.Detail_Produit;
import dao.Ordre;
import dao.Shop;
import dao.ValiderQte;
import services.Detail_OrdreService;
import services.OrdreService;
@Controller
public class OrdreControlleur {

	@Autowired
	OrdreService service;
	@Autowired
	Detail_OrdreService serviceordre;
		public OrdreControlleur() {
		
	}
	//inscription.aspx
	@RequestMapping(value="/shop")
	public String pageShop(Model model, HttpSession session)
	{
		return "shop";
	}
	@RequestMapping(value="/ordre")
	public String pageOrdre(Model model, HttpSession session,@RequestParam int id)
	{
			return "paiement";
	}
	@RequestMapping(value="/validershop")
	public String pageOrdre(Model model, HttpSession session,Shop s,@RequestParam int id)
	{
		Ordre o=new Ordre();
		o.setId_client_ord(id);
		/* ************************************** */
		Calendar cal=new GregorianCalendar();
		int minute=cal.get(Calendar.MINUTE);
		int heure=cal.get(Calendar.HOUR);
		
		int jour=cal.get(Calendar.DAY_OF_MONTH);
		int mois=cal.get(Calendar.MONTH);
		int annee=cal.get(Calendar.YEAR);
		String date=jour+"/"+mois+"/"+annee+"-"+heure+":"+minute;
		o.setDate_ord(date);
		/* ************************************** */
		o.setStatus_ord("en attente");
		service.ajouterOrdre(o);
		/*--------------- detail ordre ----------------------*/
		Integer max=service.max_Ordre();
		Detail_Ordre p=new Detail_Ordre();
		p.setId_ordre(max.intValue());
		ArrayList<Detail_Produit> list=(ArrayList<Detail_Produit>) session.getAttribute("shop");

		for (Detail_Produit detail_Produit : list) {
			p.setId_produit(detail_Produit.getId_prod());
			p.setPrix_ordre(detail_Produit.getPrix());
			p.setQte_ordre(detail_Produit.getQte_demander());
			serviceordre.ajouterDetail_Ordre(p);
		}
		return "valider";
	}
	
	@RequestMapping(value="/listeordre")
	public String pagelisteOrdre(Model model, HttpSession session)
	{
		session.setAttribute("listeordre", service.listOrdre());
	
	return "listeordre";
	}
	
	@RequestMapping(value="/listedetailordre")
	public String pagelistedetailordre(Model model, HttpSession session,@RequestParam int ido)
	{
		session.setAttribute("listedetailordre", serviceordre.listDetail_OrdreParOrdre(ido));
	
	return "listedetailordre";
	}

}
