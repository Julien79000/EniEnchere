<nav>
    <ul>
        <li><a href="<%=request.getContextPath()%>/ArticleAVendreServlet">Vendre un article</a></li>
        <li><a href="<%=request.getContextPath()%>/ProfilServlet">Mon profil</a></li>
        <li><a href="<%=request.getContextPath()%>/Deconnexion">D�connexion</a></li>
    </ul>

</nav>



<div class="row">
    <p class="col-12">Filtres :</p>
    <div>
        <form>
            <input type="radio" id="Achats" name="Achats" value="Achats">
            <label for="Achats">Achats
                <div>
                    <input type="checkbox" id="Choix1" name="Choix1" value="Choix1">
                    <label for="Choix1">ench�res ouvertes</label>
                </div>
                <div>
                    <input type="checkbox" id="Choix2" name="Choix2" value="Choix2">
                    <label for="Choix1">mes ench�res en cours</label>
                </div>
                <div>
                    <input type="checkbox" id="Choix3" name="Choix3" value="Choix3">
                    <label for="Choix3">mes ench�res remport�es</label>
                </div>
            </label>
    </div>

    <div>
        <input type="radio" id="Ventes" name="Ventes" value="Ventes">
        <label for="Ventes">Mes ventes
            <div>
                <input type="checkbox" id="Choix1" name="Choix1" value="Choix1">
                <label for="Choix1">mes ventes en cours</label>
            </div>
            <div>
                <input type="checkbox" id="Choix2" name="Choix2" value="Choix2">
                <label for="Choix1">ventes non d�but�es</label>
            </div>
            <div>
                <input type="checkbox" id="Choix3" name="Choix3" value="Choix3">
                <label for="Choix3">ventes termin�es</label>
        </label>
        </form>

    </div>
</div>