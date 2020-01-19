package dao;

import java.util.ArrayList;

public class Categorie {
private int id_cat;
private String nom_cat;
private String description_cat;
private String image_cat;
 
	public Categorie() {
		// TODO Auto-generated constructor stub
	}

	public Categorie(String nom_cat, String description_cat, String image_cat) {
		super();
		this.nom_cat = nom_cat;
		this.description_cat = description_cat;
		this.image_cat = image_cat;
	}

	public Categorie(int id_cat, String nom_cat, String description_cat,
			String image_cat) {
		super();
		this.id_cat = id_cat;
		this.nom_cat = nom_cat;
		this.description_cat = description_cat;
		this.image_cat = image_cat;
		
	}

	public int getId_cat() {
		return id_cat;
	}
	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}
	public String getNom_cat() {
		return nom_cat;
	}
	public void setNom_cat(String nom_cat) {
		this.nom_cat = nom_cat;
	}
	public String getDescription_cat() {
		return description_cat;
	}
	public void setDescription_cat(String description_cat) {
		this.description_cat = description_cat;
	}
	public String getimage_cat() {
		return image_cat;
	}
	public void setimage_cat(String image_cat) {
		this.image_cat = image_cat;
	}


}
