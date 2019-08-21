package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDeep();
       // System.out.println(deep);
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        int len = Thread.currentThread().getStackTrace().length;
        System.out.println(len);
        return len;
    }
}

