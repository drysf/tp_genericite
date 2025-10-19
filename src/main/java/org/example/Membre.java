package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Membre {
    private String nom;
    private int id;
    private List<Media> mediasEmpruntes = new ArrayList<>();

    public Membre(String nom, int id) {
        this.nom = nom;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public List<Media> getMediasEmpruntes() {
        return mediasEmpruntes;
    }

    public void emprunterMedia(Media media) {
        mediasEmpruntes.add(media);
        if (media instanceof Empruntable e) {
            e.emprunter();
        }
    }

    @Override
    public String toString() {
        return "Membre {" + nom + ", " + id + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membre membre = (Membre) o;
        return id == membre.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
