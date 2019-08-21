package com.javarush.task.task08.task0817;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Нам повторы не нужны
*/

public class answer {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < 7; i++)
        {
            map.put("Сталлоне" + i, "NAME" + i);

        }

        map.put("Сталлоне32", "NAME6");
        map.put("Сталлоне23", "NAME5");
        map.put("Сталлоне", "NAME4");
        //System.out.println(map);
        return map;
        //напишите тут ваш код
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Iterator it = map.values().iterator();
        List<String> list = new ArrayList<>();

        while(it.hasNext())
        {
            int i = 0;
            String name = (String) it.next();
            Iterator it2 = map.values().iterator();
            for (Map.Entry<String, String> pair : map.entrySet())
            {
                if(name.equals(pair.getValue())){
                    i++;
                    list.add(pair.getValue());
                }
            }
            if(i==1){
                list.remove(name);
            }
        }
        for(String pair : list)
        {
            removeItemFromMapByValue(map, pair);
        }
        //System.out.println(map);
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
