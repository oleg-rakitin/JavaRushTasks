package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++)
        {
            list.add(br.readLine());
        }
        int lengthPrev = 0;
        for(String str : list)
        {
            if(str.length() >= lengthPrev) lengthPrev = str.length();
            else {
                System.out.println(list.indexOf(str));
                break;
            }
        }
    }
}

