package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String,Integer> map = new HashMap<>();
        for(int i = 150; i <1650; i += 150)
        {
            map.put("NAME" + i, i);
        }
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator it = map.keySet().iterator();
        while (it.hasNext())
        {
            String name = (String) it.next();
            if(map.get(name) < 500)
            {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}