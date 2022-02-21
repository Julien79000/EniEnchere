<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html lang="fr">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="bootstrap.min.css">
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
                                            <nav class="col-12">
                                                <p><a
                                                        href="<%=request.getContextPath() %>/LoginServlet">S'inscrire</a>-<a
                                                        href="<%=request.getContextPath()%>/Register">Se connecter</a>
                                                </p>
                                            </nav>

                                        </div>
                                    </header>
                                    <aside class="row">
                                        <p class="col-12">Filtres :</p>
                                        <p class="row">Catégories
                                        <FORM class="col-8">
                                            <SELECT name="nom" size="1">
                                                <OPTION>lundi
                                                <OPTION>mardi
                                                <OPTION>mercredi
                                                <OPTION>jeudi
                                                <OPTION>vendredi
                                            </SELECT>
                                        </FORM>
                                        </p>
                                        <div class="row">
                                            <input id="searchbar" onkeyup="search_animal()" type="text" name="search"
                                                placeholder="Le nom de l'article contient">
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