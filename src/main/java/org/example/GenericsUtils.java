package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public final class GenericsUtils {
    private GenericsUtils() {}

    public static <T> void afficherListe(List<T> liste) {
        for (T t : liste) {
            System.out.println(String.valueOf(t));
        }
    }

    public static <T> List<T> filtrer(List<T> liste, Predicate<T> critere) {
        List<T> resultat = new ArrayList<>();
        for (T t : liste) {
            if (critere.test(t)) {
                resultat.add(t);
            }
        }
        return resultat;
    }

    public static <T> void copierCollection(Collection<T> source, Collection<T> destination) {
        destination.addAll(source);
    }
}
