package com.javarush.task.task07.task0716;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        //System.out.println(strings.size());
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> newArr = new ArrayList();
        for(String str : strings)
        {
            String[] symb = str.split("");
            ArrayList<String> sy = new ArrayList<>();

            for(String s : symb)
            {
                sy.add(s);
            }
            if(!sy.contains("р"))
            {
                newArr.add(str);
                if(sy.contains("л")) newArr.add(str);
            }else if(sy.contains("л")) newArr.add(str);
            //else if (sy.contains("л") && !sy.contains("р")) strings.add(strings.get(str));
        }
        return newArr;
    }
}