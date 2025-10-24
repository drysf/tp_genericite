package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Représente un membre de la bibliothèque.
 * <p>
 * Un membre peut emprunter des médias. Les membres sont identifiés
 * de manière unique par leur identifiant.
 * </p>
 */
public class Membre {
    /** Le nom du membre */
    private String nom;
    
    /** L'identifiant unique du membre */
    private int id;
    
    /** La liste des médias empruntés par le membre */
    private List<Media> mediasEmpruntes = new ArrayList<>();

    /**
     * Constructeur paramétré pour créer un membre.
     * 
     * @param nom le nom du membre
     * @param id l'identifiant unique du membre
     */
    public Membre(String nom, int id) {
        this.nom = nom;
        this.id = id;
    }

    /**
     * Retourne le nom du membre.
     * 
     * @return le nom du membre
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne l'identifiant du membre.
     * 
     * @return l'identifiant du membre
     */
    public int getId() {
        return id;
    }

    /**
     * Retourne la liste des médias empruntés par le membre.
     * 
     * @return la liste des médias empruntés
     */
    public List<Media> getMediasEmpruntes() {
        return mediasEmpruntes;
    }

    /**
     * Ajoute un média à la liste des emprunts du membre.
     * <p>
     * Si le média implémente l'interface Empruntable, la méthode emprunter() est appelée.
     * </p>
     * 
     * @param media le média à emprunter
     */
    public void emprunterMedia(Media media) {
        mediasEmpruntes.add(media);
        if (media instanceof Empruntable e) {
            e.emprunter();
        }
    }

    /**
     * Retourne une représentation textuelle du membre.
     * 
     * @return une chaîne au format "Membre {nom, id}"
     */
    @Override
    public String toString() {
        return "Membre {" + nom + ", " + id + "}";
    }

    /**
     * Détermine si deux membres sont égaux.
     * <p>
     * Deux membres sont égaux s'ils ont le même identifiant.
     * </p>
     * 
     * @param o l'objet à comparer
     * @return true si les membres sont égaux, false sinon
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membre membre = (Membre) o;
        return id == membre.id;
    }

    /**
     * Calcule le code de hachage du membre basé sur son identifiant.
     * 
     * @return le code de hachage
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
