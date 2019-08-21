package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        for(int i= 0; i < 20; i++)
        {
            set.add(i);
        }
        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator i = set.iterator();
        while (i.hasNext())
        {
            int s = (int)i.next();
            if(s > 10)
            {
                //set.remove(s);
                i.remove();

            }
        }


       // System.out.println(set);
        return set;

    }

    public static void main(String[] args) {
        //Set<Integer> set = createSet();
        //removeAllNumbersGreaterThan10(set);
    }
}
