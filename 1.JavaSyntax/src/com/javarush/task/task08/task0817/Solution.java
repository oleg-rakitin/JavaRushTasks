package com.javarush.task.task08.task0817;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < 7; i++)
        {
            map.put("Сталлоне" + i, "NAME" + i);

        }

        map.put("Сталлоне32", "NAME6");
        map.put("Сталлоне23", "NAME5");
        map.put("Сталлоне283", "NAME5");
        map.put("Сталлоне", "NAME4");
        //System.out.println(map);
        return map;
        //напишите тут ваш код
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String ,String> copy = new HashMap<>(map);

        String firstName;
        int count;
        for(Map.Entry pair:copy.entrySet()){
            count=0;
            firstName= (String) pair.getValue();
            for(Map.Entry te:copy.entrySet()){
                if(te.getValue().equals(firstName)){
                    if(count>0)
                    removeItemFromMapByValue(map,firstName);
                    count++;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
       Map<String,String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
       System.out.println(map);
    }
}
