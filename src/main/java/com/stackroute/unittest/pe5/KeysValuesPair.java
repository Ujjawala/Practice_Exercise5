package com.stackroute.unittest.pe5;

import java.util.Iterator;
import java.util.Map;

public class KeysValuesPair {
    public Map<String, String> replaceValues(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator6 = map.entrySet().iterator();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map.Entry<String,String> entry = iterator.next();
        String temp = map.get(entry.getKey());
        map.put(entry.getKey(), " ");
        iterator6.next();
        String temp2;
        while (iterator6.hasNext()){
            Map.Entry<String,String> entry1 = iterator6.next();
            temp2 = map.get(entry1.getKey());
//            System.out.println("temp2" +temp2);
            map.put(entry1.getKey(), temp);
//            System.out.println("temp before"+temp);
            temp = temp2;
//            System.out.println("temp after"+temp);
        }
//        for (Map.Entry me: map.entrySet()) {
//            if (map.get(me.getKey()) != null) {
//                replace = map.get()
//                map.put()
//            }
//        }
//        if (map.get("val1") != null) {
//            map.put("val2", map.get("val1"));
//            map.put("val1"," ");
//        }
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String,String> entry12 = iterator1.next();
            System.out.println(entry12.getKey());
            System.out.println(entry12.getValue());
        }
//        System.out.println("data in code"+map.get("val1"));
//        System.out.println("data in code 2"+map.get("val2"));
        return map;
    }
}
