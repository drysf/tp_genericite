package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * Classe utilitaire contenant des méthodes génériques pour manipuler des collections.
 * <p>
 * Cette classe ne peut pas être instanciée et fournit des méthodes statiques
 * pour afficher, filtrer et copier des collections de manière générique.
 * </p>
 */
public final class GenericsUtils {
    /**
     * Constructeur privé pour empêcher l'instanciation.
     */
    private GenericsUtils() {}

    /**
     * Affiche tous les éléments d'une liste.
     * <p>
     * Chaque élément est affiché sur une ligne en utilisant sa méthode toString().
     * </p>
     * 
     * @param <T> le type des éléments de la liste
     * @param liste la liste à afficher
     */
    public static <T> void afficherListe(List<T> liste) {
        for (T t : liste) {
            System.out.println(String.valueOf(t));
        }
    }

    /**
     * Filtre une liste selon un critère donné.
     * <p>
     * Retourne une nouvelle liste contenant uniquement les éléments
     * qui satisfont le prédicat fourni.
     * </p>
     * 
     * @param <T> le type des éléments de la liste
     * @param liste la liste à filtrer
     * @param critere le prédicat de filtrage
     * @return une nouvelle liste contenant les éléments filtrés
     */
    public static <T> List<T> filtrer(List<T> liste, Predicate<T> critere) {
        List<T> resultat = new ArrayList<>();
        for (T t : liste) {
            if (critere.test(t)) {
                resultat.add(t);
            }
        }
        return resultat;
    }

    /**
     * Copie tous les éléments d'une collection source vers une collection destination.
     * <p>
     * Cette méthode générique préserve le type des éléments lors de la copie.
     * </p>
     * 
     * @param <T> le type des éléments des collections
     * @param source la collection source à copier
     * @param destination la collection destination qui recevra les éléments
     */
    public static <T> void copierCollection(Collection<T> source, Collection<T> destination) {
        destination.addAll(source);
    }
}
