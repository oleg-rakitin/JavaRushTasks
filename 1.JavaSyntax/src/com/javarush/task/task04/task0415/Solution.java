package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int side1, side2, side3;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        side1 = Integer.parseInt(bufferedReader.readLine());
        side2 = Integer.parseInt(bufferedReader.readLine());
        side3 = Integer.parseInt(bufferedReader.readLine());
        if(checkSide(side1,side2,side3) && checkSide(side1,side3,side2) && checkSide(side3,side2,side1)){
            System.out.println("Треугольник существует.");
        }
        else System.out.println("Треугольник не существует.");
    }

    public static boolean checkSide(int side1,int side2,int side3){
        if((side1+side2)>side3) return true;
        else return false;
    }
}