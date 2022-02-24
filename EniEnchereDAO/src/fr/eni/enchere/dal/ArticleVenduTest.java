package fr.eni.enchere.dal;




import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Utilisateur;



public class ArticleVenduTest {



public static void main(String[] args) {
ArticleVenduDAO daoArticleVendu = DAOFactory.getArticleVenduDAO();

Utilisateur user1 = new Utilisateur("JOJO","Dominois", "Julien","julien@gmail.com", 123456721,"12 rue de ...", "94120","Niort","123456789", 860, 0);
Categorie cat1 = new Categorie("multimedia");





//(nom_article,description,date_debut,date_fin,prix_initial,prix_vente,no_utilisateur,no_categorie) VALUES(?,?,?,?,?,?,?,?)";


/*public ArticlesVendus(String nomArticle, String description, LocalDate dateDebutEmbauche, LocalDate dateFinEmbauche,
int miseAPrix, int prixVente, Utilisateur utilisateur, Categorie categorie) {*/

}



}
