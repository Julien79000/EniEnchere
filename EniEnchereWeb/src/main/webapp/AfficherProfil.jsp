<%@page import="fr.eni.enchere.bo.*"%>
    <%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

            <!DOCTYPE html>
            <html lang="fr">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Afficher Profil</title>
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
                                            <h2 class="mb-5">Eni-Enchères</h2>

                                            <section>
                                                <div class="profil " style="text-align: center;">

                                                    <h1>${user.pseudo}</h1>

                                                    <p>Pseudo : ${user.pseudo} </p>
                                                    <p>Nom : ${user.nom}</p>
                                                    <p>Prenom : ${user.prenom}</p>
                                                    <p>Email : ${user.email}</p>
                                                    <p>Telephone : ${user.telephone}</p>
                                                    <p>Rue : ${user.rue} </p>
                                                    <p>CodePostal : ${user.codePostal}</p>
                                                    <p>Ville : ${user.ville}</p>

                                                    <a href="<%=request.getContextPath()%>/ProfilModify">
                                                        <button type="submit" value="modifier" name="modifier"
                                                        		style="text-align: center;">Modifier</button>
                                                    </a>
                                                    
                                                </div>
                                            </section>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                
                <script src="/js/bootstrap.bundle.min.js"></script>
                
            </body>

            </html>