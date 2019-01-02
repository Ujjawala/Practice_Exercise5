package com.stackroute.unittest.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
    }
    public Map<String, Integer> wordCount(String string) {
        Map<String, Integer> map = new HashMap<>();
//        String[] strings = string.split("[\\s+,@?_\\-\\*]");
//        for (String str: strings) {
//            int c = 0;
//            for (String st: strings) {
//                if (str.equals(""));
//                else if (str.matches("[a-zA-Z0-9]*") && str.equals(st)) {
//                    c++;
//                }
//            }
//            if (c != 0) {
//                map.put(str, c);
//            }
//        }
        String string1 = string.replaceAll("[,@?_\\-\\*]", " ");
        String[] splitedString = string1.split("\\s+");
        for (String str: splitedString) {
            int c = 0;
            for (String st: splitedString) {
                if (str.equals(st)) {
                    c++;
                }
            }
            map.put(str, c);
        }
        return map;
    }
}
