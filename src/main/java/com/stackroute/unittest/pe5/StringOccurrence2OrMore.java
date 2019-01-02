package com.stackroute.unittest.pe5;

import java.util.HashMap;
import java.util.Map;

public class StringOccurrence2OrMore {
    public Map<String,Boolean> stringOccurence(String[] string) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s: string) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }
        return map;
    }
}
