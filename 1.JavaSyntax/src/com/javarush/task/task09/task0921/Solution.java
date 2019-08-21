package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ints = new ArrayList<>();
        while (true)
        {
            try {
                int num = Integer.parseInt(br.readLine());
                ints.add(num);
            } catch (NumberFormatException | IOException e) {
                for(int i : ints)
                {
                    System.out.println(i);
                }
                break;
            }
        }
        //напишите тут ваш код
    }
}
