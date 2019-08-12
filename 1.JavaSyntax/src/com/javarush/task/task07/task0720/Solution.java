package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());
        while (i < n) {
            list.add(reader.readLine());
            i++;
        }
        int j = 0;
        while (j != m) {
            list.add(list.remove(0));
            j++;
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
