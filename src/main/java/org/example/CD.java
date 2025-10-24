package org.example;

/**
 * Représente un CD, type spécifique de média.
 * <p>
 * Un CD possède un artiste et une durée en minutes en plus des attributs de Media.
 * </p>
 */
public class CD extends Media implements Empruntable {
    /** L'artiste du CD */
    private String artiste;
    
    /** La durée du CD en minutes */
    private int duree;

    /**
     * Constructeur paramétré pour créer un CD.
     * 
     * @param titre le titre du CD
     * @param anneePublication l'année de publication du CD
     * @param artiste l'artiste du CD
     * @param duree la durée du CD en minutes
     */
    public CD(String titre, int anneePublication, String artiste, int duree) {
        super(titre, anneePublication);
        this.artiste = artiste;
        this.duree = duree;
    }

    /**
     * Retourne l'artiste du CD.
     * 
     * @return l'artiste du CD
     */
    public String getArtiste() {
        return artiste;
    }

    /**
     * Retourne la durée du CD en minutes.
     * 
     * @return la durée en minutes
     */
    public int getDuree() {
        return duree;
    }

    /**
     * Retourne la description du CD.
     * 
     * @return une description au format "CD de &lt;artiste&gt;, durée : &lt;duree&gt; min."
     */
    @Override
    public String getDescription() {
        return "CD de " + artiste + ", durée : " + duree + " min.";
    }

    /**
     * Implémente l'emprunt du CD.
     * Affiche un message indiquant que le CD a été emprunté.
     */
    @Override
    public void emprunter() {
        System.out.println("CD emprunté: " + toString());
    }
}
