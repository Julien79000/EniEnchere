<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nouvelle vente</title>
    <link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
    <header class="container">
        <div class="row">
            <h2 class="titreSite col-12 ms-3">ENI-Enchères</h2>
            <h2 class="titrePage col-12 text-center">Nouvelle vente</h2>
            
    
        </div>
    
    </header>
    <form class="container" action="/ma-page-de-traitement" method="post">
        <div class="row mt-2">
            <label class="col-4" for="name">Article :</label>
            <input class="col-8" type="text" id="name" name="user_name">
        </div>
        <div class="row mt-2">
            <label class="col-4" for="mail">Catégorie :</label>
            <input class="col-8"  type="select" id="categorie" name="categorie">
        </div>
        <div class="row mt-2">
            <label class="col-4"  for="msg">Description :</label>
            <textarea class="col-8"  id="description" name="description"></textarea>
        </div>
        
    </form>
    <div class="row mt-4">
        <p class="col-6 text-center">Photo de l'article</p> 
        <button class="col-5">UPLOADER</button>
    </div>
    
    <form class="container" action="/ma-page-de-traitement" method="post">
        <div class="row mt-2">
            <label class="col-6" for="name">Prix initial :</label>
            <input class="col-6" type="number" id="prix_initial" name="prix_initial">
        </div>
        <div class="row mt-2">
            <label class="col-6" for="debut_enchere">Début de l'enchère :</label>
            <input class="col-6"  type="date" id="mail" name="user_mail">
        </div>
        <div class="row mt-2">
            <label class="col-6"  for="fin_enchere">Fin de l'enchère :</label>
            <input class="col-6" type="date"  id="msg" name="user_message"></input>
        </div>
        
        <div>
            <p> retrait : </p>
    
        </div>
        <div class="row">
            <button class="col-4 bd-highlight">Enregistrer</button>
            <button class="col-4 d-flex justify-content-sm-between">Annuler</button>
        </div>
        
    </form>
    
</body>
</html>



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
								
								 <form method="post" action="<%=request.getContextPath()%>/LoginServlet">
                                    <!-- Pseudo -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="identifiant" >Identifiant: </label>
                                        <input type="text" id="identifiant" name="identifiant" class="form-control form-control-lg" />
                                        
                                    </div>
                                    <!-- Nom -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="motDePasse" >Mot de passe : </label>
                                        <input type="text" id="motDePasse" name="motDePasse" class="form-control form-control-lg" />
                                        
                                       
                                         <!-- Bouton de connection -->
                                                    <div class="row">
                                                        <div class="col-5">
                                                            <input type="submit" class="connection btn btn-success"value="Connexion" name="connexion">
                                                            
                                                        </div>
                                                        <div class="col-7">
                                                            <div class="row">
                                                                <p>Se souvenir de moi</p>
                                                            </div>
                                                            
                                                            <div class="row">
                                                                <a class="text-blue-50" href="#!">Mot de passe
                                                                    oublié</a>
                                                            </div>
                                                              </div>
                                                    </div>
                                                    <div class="créerUnCompte">
                                                    <input type="submit"  class="btn btn-primary"value="Créer un compte" name="creerUnCompte" >
                                                       
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
          <script src="/js/bootstrap.bundle.min.js"></script>
</body>

</html>