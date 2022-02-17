package fr.eni.enchere.bo;

import java.time.LocalDate;
import java.util.Date;

public class ArticleVendu {
	int noArticle;
	private	String nomArticle;
	private	String description;
	private	LocalDate dateDebutEmbauche;
	private	LocalDate dateFinEmbauche;
	private	int miseAPrix;
	private	int prixVente;
	private	String etatVente;
	private	Retrait lieuRetrait;
	private Utilisateur utilisateur;
	private Enchere concerne;
	private Categorie categorie;
	
	
	public ArticleVendu() {
		super();
	}
	
	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEmbauche,
			LocalDate dateFinEmbauche, int miseAPrix, int prixVente, String etatVente, Retrait lieuRetrait) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEmbauche = dateDebutEmbauche;
		this.dateFinEmbauche = dateFinEmbauche;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.lieuRetrait = lieuRetrait;
	}
	
	

	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEmbauche, LocalDate dateFinEmbauche,
			int miseAPrix, int prixVente, String etatVente, Retrait lieuRetrait) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEmbauche = dateDebutEmbauche;
		this.dateFinEmbauche = dateFinEmbauche;
		this.miseAPrix = miseAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.lieuRetrait = lieuRetrait;
	}

	public int getNoArticle() {
		return noArticle;
	}
	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}
	public String getNomArticle() {
		return nomArticle;
	}
	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDateDebutEmbauche() {
		return dateDebutEmbauche;
	}
	public void setDateDebutEmbauche(LocalDate dateDebutEmbauche) {
		this.dateDebutEmbauche = dateDebutEmbauche;
	}
	public LocalDate getDateFinEmbauche() {
		return dateFinEmbauche;
	}
	public void setDateFinEmbauche(LocalDate dateFinEmbauche) {
		this.dateFinEmbauche = dateFinEmbauche;
	}
	public int getMiseAPrix() {
		return miseAPrix;
	}
	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
	}
	public int getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}
	public String getEtatVente() {
		return etatVente;
	}
	public void setEtatVente(String etatVente) {
		this.etatVente = etatVente;
	}
	public Retrait getLieuRetrait() {
		return lieuRetrait;
	}
	public void setLieuRetrait(Retrait lieuRetrait) {
		this.lieuRetrait = lieuRetrait;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Enchere getConcerne() {
		return concerne;
	}

	public void setConcerne(Enchere concerne) {
		this.concerne = concerne;
	}
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEmbauche=" + dateDebutEmbauche + ", dateFinEmbauche=" + dateFinEmbauche + ", miseAPrix="
				+ miseAPrix + ", prixVente=" + prixVente + ", etatVente=" + etatVente + ", lieuRetrait=" + lieuRetrait
				+ "]";
	}

	

	

	
	
	
	
}