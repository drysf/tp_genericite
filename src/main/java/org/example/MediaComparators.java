package org.example;

import java.util.Comparator;

/**
 * Classe utilitaire fournissant des comparateurs pour les médias.
 * <p>
 * Cette classe contient des comparateurs prédéfinis pour trier
 * les médias et les livres selon différents critères.
 * </p>
 */
public final class MediaComparators {
    /**
     * Constructeur privé pour empêcher l'instanciation.
     */
    private MediaComparators() {}

    /**
     * Comparateur pour trier les médias par année de publication décroissante,
     * puis par titre en ordre croissant en cas d'égalité.
     */
    public static final Comparator<Media> MEDIA_BY_YEAR_DESC_THEN_TITLE =
            Comparator.comparingInt(Media::getAnneePublication).reversed()
                      .thenComparing(Media::getTitre);

    /**
     * Comparateur spécifique pour trier les livres par auteur,
     * puis par titre en ordre croissant en cas d'égalité.
     */
    public static final Comparator<Livre> LIVRE_BY_AUTEUR_THEN_TITRE =
            Comparator.comparing(Livre::getAuteur)
                      .thenComparing(Livre::getTitre);
}
