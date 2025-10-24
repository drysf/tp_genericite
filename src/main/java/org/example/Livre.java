package org.example;

/**
 * Représente un livre, type spécifique de média.
 * <p>
 * Un livre possède un auteur et un nombre de pages en plus des attributs de Media.
 * </p>
 */
public class Livre extends Media implements Empruntable {
    /** L'auteur du livre */
    private String auteur;
    
    /** Le nombre de pages du livre */
    private int nbPages;

    /**
     * Constructeur paramétré pour créer un livre.
     * 
     * @param titre le titre du livre
     * @param anneePublication l'année de publication du livre
     * @param auteur l'auteur du livre
     * @param nbPages le nombre de pages du livre
     */
    public Livre(String titre, int anneePublication, String auteur, int nbPages) {
        super(titre, anneePublication);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    /**
     * Retourne l'auteur du livre.
     * 
     * @return l'auteur du livre
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * Retourne le nombre de pages du livre.
     * 
     * @return le nombre de pages
     */
    public int getNbPages() {
        return nbPages;
    }

    /**
     * Retourne la description du livre.
     * 
     * @return une description au format "Livre de &lt;auteur&gt;, &lt;nbPages&gt; pages."
     */
    @Override
    public String getDescription() {
        return "Livre de " + auteur + ", " + nbPages + " pages.";
    }

    /**
     * Implémente l'emprunt du livre.
     * Affiche un message indiquant que le livre a été emprunté.
     */
    @Override
    public void emprunter() {
        System.out.println("Livre emprunté: " + toString());
    }
}
