package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
В убывающем порядке
*/

public class answer {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Integer[] ints = new Integer[array.length];
        for(int i = 0; i < array.length;i++)
        {
            ints[i] = array[i];
        }
        Arrays.sort(ints, Collections.reverseOrder());
        for(int i = 0; i < ints.length; i++)
        {
            array[i] = ints[i];
        }
        //int[] newar = new int[array.length];
        //return newar;
    }
}
