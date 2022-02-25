<%@page import="fr.eni.enchere.bo.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profil</title>
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
                                <h2 class="text-uppercase text-center mb-5">Créer un compte</h2>
                                

								 <form method="post" action="<%=request.getContextPath()%>/ProfilModify">
								 
								
								 
								 
                                    <!-- Pseudo -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="pseudo" ><b>Pseudo : </b> </label>
                                        <input type="text" id="pseudo" name="pseudo"  value="${user.pseudo}" 
                                        class="form-control form-control-lg" />
                                        
                                    </div>
                                    <!-- Nom -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="nom" ><b>Nom :</b>  </label>
                                        <input type="text" id="nom" name="nom" value="${user.nom}"
                                        class="form-control form-control-lg" />
                                        
                                    </div>
                                    <!-- Prenom -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="prenom" ><b>Prenom :</b>  </label>
                                        <input type="text" id="prenom" name="prenom" value="${user.prenom}"
                                            class="form-control form-control-lg" />
                                        
                                    </div>
                                    <!-- Email -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="email"><b>Email : </b> </label>
                                        <input type="text" id="email"  name="email" value="${user.email}"
                                            class="form-control form-control-lg" />
                                        
                                    </div>
                                    <!-- Telephone -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="telephone" ><b>Teléphone :</b>  </label>
                                        <input type="tel" id="telephone" name="telephone" value="${user.telephone}"
                                            class="form-control form-control-lg" />
                                       
                                    </div>
                                    <!-- Rue -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="rue" ><b>Rue :</b>  </label>
                                        <input type="text" id="rue" name="rue" value="${user.rue}"
                                            class="form-control form-control-lg" />
                                       
                                    </div>
                                    <!-- Code postal -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="codePostal" ><b>Code postal :</b>  </label>
                                        <input type="text" id="codePostal" name="codePostal" value="${user.codePostal}"
                                            class="form-control form-control-lg" />
                                       
                                    </div>
                                    <!-- Ville -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="ville" ><b>Ville :</b> </label>
                                        <input type="text" id="ville" name="ville" value="${user.ville}"
                                            class="form-control form-control-lg" />
                                        
                                    </div>
                                    <!-- Mot de passe -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="motDePasse" ><b>Mot de passe :</b> </label>
                                        <input type="password" id="motDePasse" name="motDePasse" value="${user.motDePasse}"
                                            class="form-control form-control-lg" />
                                       
                                    </div>
                                    <!-- Confirmation Mot de passe -->
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="motDePasseRepeat" ><b>Confirmation :</b> </label>
                                        <input type="password" id="motDePasseRepeat" name="motDePasseRepeat" value="${user.motDePasse}"
                                            class="form-control form-control-lg" />
                                        
                                    </div>
                                 <p id="credit">
					                           <b>Vous avez ${user.credit} crédits</b>
				</p>
                                   
                                    <div class="container-fluid">
                                        <div class="row">
                                        
                                            
                                            <button class="col-3 btn btn-primary" type="submit" name="enregistrer"
                                                class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Enregistrer</button>
                                                
                                                <button class="col-6 btn btn-danger" type="submit" name="supprimer"
                                                class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Supprimer</button>

                                          

                                           
                                            <button class="col-3 btn btn-secondary" type="submit" name="annuler"
                                                class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Retour</button>
                                               

                                               

                    

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