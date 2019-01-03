package com.stackroute.unittest.pe5;

import java.util.*;

public class SortedStringSet {
    public List<String> sortedString (List<String> strings) {
        SortedSet<String> sortedSet = new TreeSet<>();
        for (String str: strings) {
            sortedSet.add(str);
        }
        Iterator<String> iterator = sortedSet.iterator();
        List<String> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        if (result.isEmpty()) {
            return null;
        } else {
            return result;
        }
    }
}
