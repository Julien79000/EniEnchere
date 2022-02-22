<%@page import="fr.eni.enchere.bo.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html lang="fr">

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
                                    <aside class="row">
                                        <p class="col-12">Filtres :</p>
                                        <p class="row">Catégories</p>
                                        <FORM class="col-8">
                                            <SELECT name="nom" size="1">
                                                <OPTION>lundi
                                                <OPTION>mardi
                                                <OPTION>mercredi
                                                <OPTION>jeudi
                                                <OPTION>vendredi
                                            </SELECT>
                                        </FORM>
                                        
                                        <div class="row">
                                            <input id="searchbar" onkeyup="search_animal()" type="text" name="search"
                                                placeholder="Le nom de l'article contient">
                                        </div>
                                        
                                      
                                        
                                        
                                        
                                        
                                        
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