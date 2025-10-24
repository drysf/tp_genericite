package org.example;

/**
 * Interface représentant un objet empruntable.
 * <p>
 * Les classes qui implémentent cette interface peuvent être empruntées
 * et doivent définir le comportement associé à l'emprunt.
 * </p>
 */
public interface Empruntable {
    /**
     * Effectue l'emprunt de l'objet.
     * <p>
     * Cette méthode doit définir le comportement spécifique
     * lorsqu'un objet est emprunté (affichage, mise à jour d'état, etc.).
     * </p>
     */
    void emprunter();
}
