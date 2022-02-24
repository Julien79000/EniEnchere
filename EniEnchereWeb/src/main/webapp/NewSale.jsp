<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nouvelle vente</title>
    <link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
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
        <span class="col-6 text-center">Photo de l'article</span> 
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