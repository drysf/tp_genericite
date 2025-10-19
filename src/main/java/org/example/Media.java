package org.example;

public abstract class Media {
    private String titre;
    private int anneePublication;

    public Media() {
    }

    public Media(String titre, int anneePublication) {
        this.titre = titre;
        this.anneePublication = anneePublication;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public abstract String getDescription();

    public void afficherDetails() {
        // Bonus: non-abstract method using polymorphism
        System.out.println(toString() + " - " + getDescription());
    }

    @Override
    public String toString() {
        return getTitre() + " (" + getAnneePublication() + ")";
    }
}
