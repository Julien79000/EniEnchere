package fr.eni.enchere.bo;

import java.util.List;

public class Categorie {
	private int noCategorie;
	private String libelle;
	private List<ArticleVendu> categorieArticle;
	
	
	public Categorie() {
		super();
	}
	
	public Categorie(int noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}
	

	public Categorie(String libelle, List<ArticleVendu> categorieArticle) {
		super();
		this.libelle = libelle;
		this.categorieArticle = categorieArticle;
	}
	

	public Categorie(int noCategorie, String libelle, List<ArticleVendu> categorieArticle) {
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
	public List<ArticleVendu> getCategorieArticle() {
		return categorieArticle;
	}
	public void setCategorieArticle(List<ArticleVendu> categorieArticle) {
		this.categorieArticle = categorieArticle;
	}

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", categorieArticle="
				+ categorieArticle + "]";
	}
	
	

}