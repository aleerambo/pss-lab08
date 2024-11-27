package it.unibo.collections.sets;

//import java.util.Collection;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final TreeSet<String> set = new TreeSet<String>();

        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for(int i=1; i<=ELEMS; i++) {
            set.add(String.valueOf(i));
        }

        /*
         * 3) Prints its content
         */
        System.out.println(set.toString());

        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        for(int i=1; i<=ELEMS; i++) {
            if(i%3 == 0) {
                set.remove(String.valueOf(i));
            }
        }

        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for (String element : set) {
            System.out.println(element);
        }

        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        boolean allEven = true;
        for(String element : set) {
            int number = Integer.parseInt(element); // Converte la stringa in numero intero
            if (number % 2 != 0) { // Controlla se il numero è dispari
                allEven = false;
                break; // Interrompi il ciclo appena trovi un dispari
            }
        }

        if (allEven) {
            System.out.println("All numbers in the set are even.");
        } else {
            System.out.println("Not all numbers in the set are even.");
        }
    }
}
