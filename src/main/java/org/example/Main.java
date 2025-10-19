package org.example;

import java.util.*;

import static org.example.GenericsUtils.afficherListe;
import static org.example.GenericsUtils.filtrer;
import static org.example.GenericsUtils.copierCollection;
import static org.example.MediaComparators.LIVRE_BY_AUTEUR_THEN_TITRE;
import static org.example.MediaComparators.MEDIA_BY_YEAR_DESC_THEN_TITLE;

public class Main {
    public static void main(String[] args) {
        Media l1 = new Livre("Le Petit Prince", 1943, "Antoine de Saint-Exupéry", 96);
        Media l2 = new Livre("Clean Code", 2008, "Robert C. Martin", 464);
        Media l3 = new Livre("Algorithmique", 2015, "Thomas H. Cormen", 1312);
        Media c1 = new CD("Random Access Memories", 2013, "Daft Punk", 74);
        Media c2 = new CD("Thriller", 1982, "Michael Jackson", 42);

        List<Media> tousLesMedias = new ArrayList<>(List.of(l1, l2, l3, c1, c2));

        Membre m1 = new Membre("Alice", 1);
        Membre m2 = new Membre("Bob", 2);
        Membre m3 = new Membre("Alex", 3);

        Set<Membre> membres = new HashSet<>(List.of(m1, m2, m3));

        Map<Membre, List<Media>> emprunts = new HashMap<>();
        emprunts.put(m1, new ArrayList<>());
        emprunts.put(m2, new ArrayList<>());
        emprunts.put(m3, new ArrayList<>());

        m1.emprunterMedia(l2); emprunts.get(m1).add(l2);
        m2.emprunterMedia(c1); emprunts.get(m2).add(c1);
        m3.emprunterMedia(l1); emprunts.get(m3).add(l1);
        m3.emprunterMedia(c2); emprunts.get(m3).add(c2);

        System.out.println("\nTous les médias:");
        afficherListe(tousLesMedias);

        System.out.println("\nMédias publiés après 2010:");
        List<Media> apres2010 = filtrer(tousLesMedias, m -> m.getAnneePublication() > 2010);
        afficherListe(apres2010);

        System.out.println("\nMembres dont le nom commence par A:");
        List<Membre> membresList = new ArrayList<>(membres);
        List<Membre> membresA = filtrer(membresList, mem -> mem.getNom().startsWith("A"));
        afficherListe(membresA);

        System.out.println("\nTri des médias (année décroissante, puis titre):");
        List<Media> mediasTries = new ArrayList<>(tousLesMedias);
        mediasTries.sort(MEDIA_BY_YEAR_DESC_THEN_TITLE);
        afficherListe(mediasTries);

        System.out.println("\nTri des livres (auteur, puis titre):");
        List<Livre> livresSeulement = new ArrayList<>();
        for (Media m : tousLesMedias) if (m instanceof Livre li) livresSeulement.add(li);
        livresSeulement.sort(LIVRE_BY_AUTEUR_THEN_TITRE);
        afficherListe(livresSeulement);

        System.out.println("\nCopie de collection (livres -> nouvelle liste):");
        List<Livre> copieLivres = new ArrayList<>();
        copierCollection(livresSeulement, copieLivres);
        afficherListe(copieLivres);

        System.out.println("\nMédias empruntés (sans doublons):");
        Set<Media> mediasEmpruntesSansDoublon = new HashSet<>();
        for (Map.Entry<Membre, List<Media>> e : emprunts.entrySet()) {
            mediasEmpruntesSansDoublon.addAll(e.getValue());
        }
        afficherListe(new ArrayList<>(mediasEmpruntesSansDoublon));

        System.out.println("\nFiltrage polymorphe (seulement les livres):");
        List<Media> seulementLivres = filtrer(tousLesMedias, m -> m instanceof Livre);
        afficherListe(seulementLivres);

        System.out.println("\nDétails des médias (polymorphisme):");
        for (Media m : tousLesMedias) {
            m.afficherDetails();
        }
    }
}