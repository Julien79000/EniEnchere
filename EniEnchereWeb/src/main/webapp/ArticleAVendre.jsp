<%@page import="fr.eni.enchere.bo.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nouvelle ventre</title>
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
			<form method="post"  class="" action="<%=request.getContextPath()%>/ArticleAVendreServlet">

                        <div class="row"> 
                                <div class="col-3"> 
                                
                                    <label class="form-label" for="nomArticle" >Article : </label><br><br>
                                    
                                    
                                    <label class="form-label" for="description">Description : </label><br><br>

                                    <label class="form-label" for="categorie">Catégorie </label> <br>

                                    <label class="form-label" for="photo">Photo de l'article : </label> <br>

                                    <label class="form-label" for="prixInitial">Mise à prix : </label><br>

                                    <label class="form-label"for="debut">Début de l'enchère : </label><br>

                                    <label class="form-label"for="fin">Fin de l'enchère : </label><br>

                                    <label class="form-label"for="rue">Rue : </label><br>

                                    <label  class="form-label"for="codePostal">Code Postal :</label><br>
                                    
                                    <label class="form-label"for="ville">Ville :</label><br>

                                </div> 


                                <div class="col-6 ">

                                    <input id="nomArticle"  class="float-right mb-2" type="text" name="nomArticle" /> <br>

                                    <textarea class="justify-content-center" name="description"rows="4"cols="30"id="description" ></textarea><br>
                        
                                    
                                    
                                    <select class="custom-select" id="categorie" name="categorie">
								    <c:forEach var="cat" items="${listeCategories}">
								    	<option value="${cat.noCategorie}">${cat.libelle}</option>
								    </c:forEach>
								      
								 </select>
                        
                                    <input type="file" name="photo" class="d-flex justify-content-center mb-3 form-control" id="photo">
                        
                                    <input type="number" name="prixInitial" class="d-flex justify-content-center mb-4 form-control" id="prixInitial" />
                        
                                    <input type="date" id="debut" class="d-flex justify-content-center mb-3 form-control" name="debut" />
                        
                                    <input type="date" id="fin" class="d-flex justify-content-center mb-3 form-control" name="fin" />
                        
                                    <div id="retrait">
                                            <input type="text" id="rue" class="d-flex justify-content-center mb-4 form-control" name="rue" value=<%=request.getAttribute("rue")%>>
                        
                                            <input type="text" id="codePostal" class="d-flex justify-content-center mb-1 form-control" name="codePostal" value=<%=request.getAttribute("codePostal")%>>
                        
                                            <input type="text" name="ville" class="d-flex justify-content-center mb-1 form-control" id="ville" value=<%=request.getAttribute("ville")%>>
                        
                                    </div>

                                    <div>
                                            <input type="submit" class="btn btn-success" value="Enregistrer">
                                            <a href="<%=request.getContextPath()%>/accueil.html">
                                            <button type="button" class="btn btn-danger" value="Annuler">Annuler</button> 
                                            </a>
                                    </div>
                                </div>  


                            
                        </div> 
                                
                </form>
                                   </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

</body>
</html>