package fr.eni.enchere.bo;

import java.time.LocalDate;

public class Enchere {
	private LocalDate dateEnchere;
	private int montant_enchere;
	private ArticlesVendus article;
	private Utilisateur utilisateur;
	
	public Enchere() {
		super();
	}
	
	public Enchere(LocalDate dateEnchere, int montant_enchere, ArticlesVendus article, Utilisateur utilisateur) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
		this.article = article;
		this.utilisateur = utilisateur;
	}

	public Enchere(LocalDate dateEnchere, int montant_enchere) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
	}

	public LocalDate getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	public int getMontant_enchere() {
		return montant_enchere;
	}
	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}
	public ArticlesVendus getArticle() {
		return article;
	}
	public void setArticle(ArticlesVendus article) {
		this.article = article;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Enchere [article=" + article + ", dateEnchere=" + dateEnchere + ", montant_enchere=" + montant_enchere
			   + ", utilisateur=" + utilisateur + "]";
	}
	
}
