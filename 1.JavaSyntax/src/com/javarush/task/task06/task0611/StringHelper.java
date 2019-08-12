package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/


public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        StringBuilder sb= new StringBuilder();
        //напишите тут ваш код
        for(int i =1; i<=5;i++){
            sb.append(s);
        }
        result = sb.toString();
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        //напишите тут ваш код
        for(int i = 0; i<count;i++){
            sb.append(s);
        }
        result = sb.toString();
        return result;
    }

    public static void main(String[] args) {

    }
}
