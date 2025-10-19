package org.example;

import java.util.Comparator;

public final class MediaComparators {
    private MediaComparators() {}

    public static final Comparator<Media> MEDIA_BY_YEAR_DESC_THEN_TITLE =
            Comparator.comparingInt(Media::getAnneePublication).reversed()
                      .thenComparing(Media::getTitre);

    public static final Comparator<Livre> LIVRE_BY_AUTEUR_THEN_TITRE =
            Comparator.comparing(Livre::getAuteur)
                      .thenComparing(Livre::getTitre);
}
