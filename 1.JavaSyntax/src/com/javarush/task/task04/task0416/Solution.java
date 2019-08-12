package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minutes = (int) Double.parseDouble(br.readLine());
       // if(minutes%3 )
            while(minutes>4){
                minutes -=5;
            }
        switch (minutes){
            case 4:
                System.out.println("красный");
                break;
            case 3:
                System.out.println("жёлтый");
                break;
            case 2:
                System.out.println("зелёный");
                break;
            case 1:
                System.out.println("зелёный");
                break;
            case 0:
                System.out.println("зелёный");
                break;
        }
    }
}