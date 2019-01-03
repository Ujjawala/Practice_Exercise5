package com.stackroute.unittest.pe5;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayList {
    public List<String> updateList(List<String> list, String oldString, String newString) {
        int c = 0;
        List<Integer> index = new ArrayList<>();
        for (String str: list) {

            if (str.equals(oldString)) {
//                System.out.println(str);
//                list.add(c, newString);
//                break;
                index.add(c);
            }
//            System.out.println(str);
            c++;
        }
        for (int i: index) {
            list.remove(i);
            list.add(i, newString);
        }
//        list.add(c, newString);
        return list;
    }
    public List<String> emptyList(List<String> list) {

        list.clear();
//        System.out.println(list);
        return list;
    }
}
