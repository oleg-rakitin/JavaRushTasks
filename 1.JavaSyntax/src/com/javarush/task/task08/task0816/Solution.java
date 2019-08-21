package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        for(int i = 0; i < 7; i++)
        {
            map.put("Сталлоне" + i, dateFormat.parse("MAY 1 2012"));

        }

        map.put("Сталлоне32", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне23", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне", dateFormat.parse("JUNE 1 2012"));
        //System.out.println(map);
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator it = map.keySet().iterator();
        while(it.hasNext())
        {
            //Date date = (Date) it;
            String name = (String) it.next();
            if(map.get(name).getMonth() > 4 && map.get(name).getMonth() <= 7)
            {
                it.remove();
            }
        }
        //System.out.println(map);
    }

    public static void main(String[] args) {
        Map<String ,Date > map = null;
        try {
           map  = createMap();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        removeAllSummerPeople(map);
    }
}
