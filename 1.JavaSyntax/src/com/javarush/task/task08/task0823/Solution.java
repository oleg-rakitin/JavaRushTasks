package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String newString = "";
        for (String word : string.split(" ")) {


                //System.out.println(word);
                for (String str : word.split("")) {

                        try {
                            word = str.toUpperCase() + word.substring(1);
                        }catch (StringIndexOutOfBoundsException e)
                        {

                        }
                        newString += word + " ";
                        break;
                }


        }

        System.out.println(newString);

        //напишите тут ваш код
    }
}
