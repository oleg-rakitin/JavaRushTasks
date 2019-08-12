package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш кодt
        String s = String.valueOf(number);
        String[] ar = s.split("");
        int sum = 0;
        for(String s1 : ar)
        {
            sum += Integer.parseInt(s1);
        }
        return sum;
    }
}