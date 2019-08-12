package com.javarush.task.task02.task0202;//package com.javarush.task.task01.task0130;

/*
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код
        //TC = (TF - 32) * 5/9
        double f = (9/5*celsius)+32;
        return f;
    }
}
