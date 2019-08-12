package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i=1;
        int j=1;
        while(i<=10){
            while(j<=10){
                System.out.print("S");
                j++;
            }
            System.out.println("");
            i++;
            j=1;
        }
    }
}
