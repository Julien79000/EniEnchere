<nav>
    <ul>
        <li><a href="">Vendre un article</a></li>
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
<aside class="row">
    <p class="col-12">Filtres :</p>
    <p class="row">Cat�gories
    <form class="col-8">
        <SELECT name="nom" size="1">
            <OPTION>lundi
            <OPTION>mardi
            <OPTION>mercredi
            <OPTION>jeudi
            <OPTION>vendredi
        </SELECT>
    </form>
    </p>
    <div class="row">
        <input id="searchbar" onkeyup="search_animal()" type="text" name="search"
            placeholder="Le nom de l'article contient">
    </div>
</aside>