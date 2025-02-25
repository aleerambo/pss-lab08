package it.unibo.generics.utilities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 */
public final class Utilities {

    private static final Random RANDOM_GENERATOR = new Random();

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> union(final Set<? extends X> setA, final Set<? extends X> setB) {
        final Set<X> result = new HashSet<>(setA);
        result.addAll(setB);
        return result;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> intersection(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> result = new HashSet<>(setA);
        result.retainAll(setB); // Mantieni solo gli elementi presenti in setB
        return result;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> symmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> allElements = union(setA, setB);
        Set<X> commonElements = intersection(setA, setB);
        allElements.removeAll(commonElements);
        return allElements;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X randomElement(final Collection<X> coll) {
        int n = RANDOM_GENERATOR.nextInt(coll.size());
        for (final X x : coll) {
            if (n == 0) {
                return x;
            }
            n--;
        }
        return null;
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> randomPair(final Collection<X> first, final Collection<Y> second) {
        return new Pair<>(randomElement(first), randomElement(second));
    }
}
