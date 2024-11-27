package it.unibo.collections.comparators;

import java.util.Comparator;

public class ComparatorStringDouble implements Comparator<String>{
    public int compare(String s1, String s2) {
        return Double.compare(Double.parseDouble(s1), Double.parseDouble(s2));
    }
}
