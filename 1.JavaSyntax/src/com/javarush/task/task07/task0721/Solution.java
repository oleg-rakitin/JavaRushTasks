package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int[] nums = new int[20];
        for(int i = 0; i < 20; i++)
        {
            int num = Integer.parseInt(reader.readLine());
            nums[i] = num;
            if (num < minimum) minimum = num;
            else if(num > maximum) maximum = num;

        }
        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
