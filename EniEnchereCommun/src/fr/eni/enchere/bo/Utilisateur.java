package fr.eni.enchere.bo;

public class Utilisateur {
	int noUtilisateur;
	String peudo;
	String nom;
	String prenom;
	String email;
	int telephone;
	String rue;
	int codePostal;
	String ville;
	int motDePasse;
	int credit;
	String administrateur;
	public Utilisateur() {
		super();
	}
	public Utilisateur(int noUtilisateur, String peudo, String nom, String prenom, String email, int telephone,
			String rue, int codePostal, String ville, int motDePasse, int credit, String administrateur) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.peudo = peudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}
	public int getNoUtilisateur() {
		return noUtilisateur;
	}
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	public String getPeudo() {
		return peudo;
	}
	public void setPeudo(String peudo) {
		this.peudo = peudo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(int motDePasse) {
		this.motDePasse = motDePasse;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(String administrateur) {
		this.administrateur = administrateur;
	}
	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", peudo=" + peudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + "]";
	}
	

}

