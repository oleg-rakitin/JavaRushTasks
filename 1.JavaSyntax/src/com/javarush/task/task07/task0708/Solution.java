package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        int length = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = bufferedReader.readLine();
            if (s.length() >= length) {
                length = s.length();
                strings.add(s);
            }
        }
        for (String s :
                strings) {
            if (s.length() == length)
                System.out.println(s);
        }
        //напишите тут ваш код
    }
}
