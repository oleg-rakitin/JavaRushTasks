package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        if((num1 != num3) && (num3 == num2)) {
            System.out.println(1);
        } else if(num2 != num1 && num1 == num3) System.out.println(2);
        else if(num3 != num1 && num1 == num2) System.out.println(3);



    }
}
