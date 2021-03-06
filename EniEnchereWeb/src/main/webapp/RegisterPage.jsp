<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="fr">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Register Page</title>
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

                                    <form method="post" action="<%=request.getContextPath()%>/Register">

                                        <!-- Pseudo -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="pseudo">Pseudo : </label>
                                            <input type="text" id="pseudo" name="pseudo"
                                                class="form-control form-control-lg" />
                                        </div>

                                        <!-- Nom -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="nom">Nom : </label>
                                            <input type="text" id="nom" name="nom"
                                                class="form-control form-control-lg" />
                                        </div>

                                        <!-- Prenom -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="prenom">Prénom : </label>
                                            <input type="text" id="prenom" name="prenom"
                                                class="form-control form-control-lg" />
                                        </div>

                                        <!-- Email -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="email">Email : </label>
                                            <input type="text" id="email" name="email"
                                                class="form-control form-control-lg" />
                                        </div>

                                        <!-- Telephone -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="telephone">Téléphone : </label>
                                            <input type="tel" id="telephone" name="telephone"
                                                class="form-control form-control-lg" />
                                        </div>

                                        <!-- Rue -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="rue">Rue : </label>
                                            <input type="text" id="rue" name="rue"
                                                class="form-control form-control-lg" />
                                        </div>
                                        <!-- Code postal -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="codePostal">Code postal : </label>
                                            <input type="text" id="codePostal" name="codePostal"
                                                class="form-control form-control-lg" />
                                        </div>

                                        <!-- Ville -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="ville">Ville : </label>
                                            <input type="text" id="ville" name="ville"
                                                class="form-control form-control-lg" />
                                        </div>

                                        <!-- Mot de passe -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="motDePasse">Mot de passe : </label>
                                            <input type="password" id="motDePasse" name="motDePasse"
                                                class="form-control form-control-lg" />
                                        </div>

                                        <!-- Confirmation Mot de passe -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="motDePasseRepeat">Confirmation : </label>
                                            <input type="password" id="motDePasseRepeat" name="motDePasseRepeat"
                                                class="form-control form-control-lg" />
                                        </div>

                                        <!-- Boutons créer et annuler -->
                                        <div class="container-fluid">
                                            <div class="row">
                                                <button class="col-6 btn btn-primary" type="submit" name="ceer"
                                                    class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Créer</button>

                                                <button class="col-6 btn btn-secondary" type="submit" name="annuler"
                                                    class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Annuler</button>
                                            </div>
                                        </div>

                                        <!-- Lien page Login si l'utilisateur a déjà un compte -->
                                        <p class="text-center text-muted mt-5 mb-0">Vous avez déjà un compte ?<a
                                                href="LoginPage.jsp" class="fw-bold text-body"><u>Se connecter</u></a>
                                        </p>
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