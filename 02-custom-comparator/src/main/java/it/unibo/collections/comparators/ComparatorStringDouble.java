package it.unibo.collections.comparators;

public class ComparatorStringDouble {
    public int compare(String s1, String s2) {
        return Double.compare(Double.parseDouble(s1), Double.parseDouble(s2));
    }
}
