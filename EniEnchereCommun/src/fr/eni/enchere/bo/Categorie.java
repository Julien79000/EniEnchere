package fr.eni.enchere.bo;

import java.util.List;

public class Categorie {
	private int noCategorie;
	private String libelle;
	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}

	private List<ArticlesVendus> categorieArticle;
	
	public Categorie() {
		super();
	}
	
	public Categorie(int noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}

	public Categorie(String libelle, List<ArticlesVendus> categorieArticle) {
		super();
		this.libelle = libelle;
		this.categorieArticle = categorieArticle;
	}

	public Categorie(int noCategorie, String libelle, List<ArticlesVendus> categorieArticle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
		this.categorieArticle = categorieArticle;
	}

	public int getNoCategorie() {
		return noCategorie;
	}
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<ArticlesVendus> getCategorieArticle() {
		return categorieArticle;
	}
	public void setCategorieArticle(List<ArticlesVendus> categorieArticle) {
		this.categorieArticle = categorieArticle;
	}

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", categorieArticle="
				+ categorieArticle + "]";
	}
	
}
