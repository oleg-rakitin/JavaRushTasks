package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int count = 0;
        double res = 0;
        int num = 0;
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            num = Integer.parseInt(bufferedReader.readLine());
            if (num == -1)
                break;
           // System.out.println(num);
            sum += num;
            count++;
            //System.out.println(count);

            //System.out.println(sum);
        }
        res = (double)(sum)/ (double)(count);
        System.out.println(res);
    }
}

