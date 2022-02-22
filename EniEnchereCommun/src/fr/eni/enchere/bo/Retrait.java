package fr.eni.enchere.bo;

import java.util.List;

public class Retrait {
	private String rue;
	private int code_postal;
	private String ville;
	private List<ArticlesVendus> article;
	
	
	public Retrait(String rue, int code_postal, String ville, List<ArticlesVendus> article) {
		super();
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
		this.article = article;
	}
	public Retrait(String rue, int code_postal, String ville) {
		super();
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}
	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public List<ArticlesVendus> getArticle() {
		return article;
	}
	public void setArticle(List<ArticlesVendus> article) {
		this.article = article;
	}
	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", code_postal=" + code_postal + ", ville=" + ville + ", article=" + article
				+ "]";
	}
	
	

}
