<%@page import="fr.eni.enchere.bo.*" %>
 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html lang="en">

  <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home</title>
        <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
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
                                    <h2 class="text-uppercase text-center mb-5">ENI-Enchères</h2>
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
									        <input id="searchbar" type="text" name="search" placeholder="Le nom de l'article contient">
									    </div>
									</form>
								
									<c:forEach items="${articlesList}" var="art">
									
									    <p><u>Nom de l'article : </u> ${art.nomArticle}</p>
									    <p><u>Prix :</u> ${art.description}</p>
									    <p><u>Date fin de l 'enchère :</u>  ${art.dateFinEmbauche}</p>
									    <p>Retrait : on a pas eu le temps pour finir </p>
									 <p>------------------------------------------------------</p>
									    
									    
									    
									    
									</c:forEach>
								
									<c:choose>
									  <c:when test="${not empty sessionScope.user}">
									     	<%@include file="HeaderConnecte.jsp" %>
									  </c:when>
									  <c:when test="${empty sessionScope.user}">
									  	<%@include file="HeaderHome.jsp" %>
									  </c:when>
								  </c:choose>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	 </body>
</html>