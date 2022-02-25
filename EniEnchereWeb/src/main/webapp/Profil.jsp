<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html lang="fr">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>LoginPage</title>
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

                                    <form method="post" action="<%=request.getContextPath()%>/LoginServlet">

                                        <!-- Pseudo -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="identifiant">Identifiant : </label>
                                            <input type="text" id="identifiant" name="identifiant"
                                                class="form-control form-control-lg" />

                                        </div>

                                        <!-- Nom -->
                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="motDePasse">Mot de passe : </label>
                                            <input type="text" id="motDePasse" name="motDePasse"
                                                   class="form-control form-control-lg" />
                                        </div>

                                            <!-- Bouton de connection -->
                                            <div class="row">
                                                <div class="col-5">
                                                    <input type="submit" class="connection btn btn-success"
                                                        value="Connexion" name="connexion" />
                                                </div>
                                                <div class="col-7">
                                                    <div class="row">
                                                        <p>Se souvenir de moi</p>
                                                    </div>
                                                    <div class="row">
                                                        <a class="text-blue-50" href="#!">Mot de passe oublié</a>
                                                    </div>
                                                </div>
                                                <div class="creerUnCompte">
                                                    <input type="submit" class="btn btn-primary" value="creerUnCompte"
                                                        name="creerUnCompte">
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