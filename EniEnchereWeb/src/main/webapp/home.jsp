<%@page import="fr.eni.enchere.bo.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <!DOCTYPE html>
    
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
        
        <title>home</title>
    </head>

    <body>
        <section class="vh-100 bg-image"
            style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
            <div class="mask d-flex align-items-center h-100 gradient-custom-3">
                <div class="container h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                            <div class="card" style="border-radius: 15px;">
                                <div class="card-body p-5">
                                    <header class="container">
                                        <div class="row">
                                            <h2 class="titre col-12">ENI-Enchères</h2>
                                             <%if (session.getAttribute("user")==null) {%>
                                         
                                         <%@include file="HeaderHome.jsp"%>
                                         
                                         <%} else { %>
                                          <%@include file="HeaderConnecte.jsp"%>
                                          <%} %>

                                        </div>
                                    </header>
                                    
                                        <p class="col-12">Filtres :</p>
                                         <label class="form-label" for="categorie">Catégorie : </label>
                                         <form action="<%=request.getContextPath()%>//HomeServlet">
                                       <select class="custom-select" id="categorie" name="categorie">
                                       <option>Toutes</option>
								    <c:forEach var="cat" items="${listeCategories}">
								    	<option value="${cat.noCategorie}">${cat.libelle}</option>
								    </c:forEach>
								      
								 </select>
                                        <div class="row">
                                            <input id="searchbar" type="text" name="search"
                                                placeholder="Le nom de l'article contient">
                                        </div>
                                        
                                        
                                     </form>
                                     
                                     <c:forEach var="art" items="${art}">
								    	 
                    <p>Nom    :    ${art.nomArticle}</p>
                    <p>Prenom :   ${art.prenom }</p>
                    <p>Email  :   ${user.email }</p>
                    <p>Telephone : ${user.telephone }</p>
                    <p>Rue  :     ${user.rue} </p>
                    <p>CodePostal :${user.codePostal}</p>
                    <p>Ville  :   ${user.ville }</p>
								    </c:forEach>
                                     
                                     
                                        
                                        
                                        
                                        
                                        
                                        </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </section>

    </body>

    </html>