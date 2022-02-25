<%@page import="fr.eni.enchere.bo.*" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

            <!DOCTYPE html>

            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">

                <title>Home</title>
            </head>

            </div>
            </header>

            <p class="col-12">Filtres :</p>
            <label class="form-label" for="categorie">Cat�gorie : </label>
            <form action="<%=request.getContextPath()%>//HomeServlet">
                <select class="custom-select" id="categorie" name="categorie">
                    <option>Toutes</option>
                    <c:forEach var="cat" items="${listeCategories}">
                        <option value="${cat.noCategorie}">${cat.libelle}</option>
                    </c:forEach>

                </select>
                <div class="row">
                    <input id="searchbar" type="text" name="search" placeholder="Le nom de l'article contient">
                </div>
            </form>

            <c:forEach var="art" items="${art}">

                <p>Nom : ${art.nomArticle}</p>
                <p>Prenom : ${art.prenom }</p>
                <p>Email : ${user.email }</p>
                <p>Telephone : ${user.telephone }</p>
                <p>Rue : ${user.rue} </p>
                <p>CodePostal :${user.codePostal}</p>
                <p>Ville : ${user.ville }</p>
            </c:forEach>
            </div>

            <%@include file="HeaderHome.jsp" %>
                <%@include file="HeaderConnecte.jsp" %>

                    </div>
                    </header>
                    <aside class="row">
                        <p class="col-12">Filtres :</p>
                        <p class="row">Categories :</p>
                        <FORM class="col-8">
                            <SELECT name="nom" size="1">
                                <OPTION>Informatique
                                <OPTION>Electromenager
                                <OPTION>Automobile
                                <OPTION>Meubles et Objets
                                <OPTION>Vide-greniers
                            </SELECT>
                        </FORM>
                        <div class="row">
                            <input id="searchbar" type="text" name="search" placeholder="Le nom de l'article contient">
                        </div>
                    </aside>
                    </div>
                    </div>
                    </div>
                    </div>
                    </div>
                    </div>
                    </section>

                    </body>

            </html>