package org.example;

/**
 * Classe abstraite représentant un média générique.
 * <p>
 * Un média possède un titre et une année de publication.
 * Les classes concrètes doivent fournir une description spécifique.
 * </p>
 */
public abstract class Media {
    /** Le titre du média */
    private String titre;
    
    /** L'année de publication du média */
    private int anneePublication;

    /**
     * Constructeur par défaut.
     */
    public Media() {
    }

    /**
     * Constructeur paramétré.
     * 
     * @param titre le titre du média
     * @param anneePublication l'année de publication du média
     */
    public Media(String titre, int anneePublication) {
        this.titre = titre;
        this.anneePublication = anneePublication;
    }

    /**
     * Retourne le titre du média.
     * 
     * @return le titre du média
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Retourne l'année de publication du média.
     * 
     * @return l'année de publication
     */
    public int getAnneePublication() {
        return anneePublication;
    }

    /**
     * Retourne une description spécifique du média.
     * <p>
     * Cette méthode abstraite doit être implémentée par les classes concrètes.
     * </p>
     * 
     * @return la description du média
     */
    public abstract String getDescription();

    /**
     * Affiche les détails du média en utilisant le polymorphisme.
     * <p>
     * Méthode bonus qui combine toString() et getDescription().
     * </p>
     */
    public void afficherDetails() {
        // Bonus: non-abstract method using polymorphism
        System.out.println(toString() + " - " + getDescription());
    }

    /**
     * Retourne une représentation textuelle du média.
     * 
     * @return une chaîne au format "Titre (année)"
     */
    @Override
    public String toString() {
        return getTitre() + " (" + getAnneePublication() + ")";
    }
}
