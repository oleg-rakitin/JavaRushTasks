package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //List<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String town = reader.readLine();

            if (town.isEmpty()) {
                break;
            }

            String family = reader.readLine();

            map.put(town, family);
          //  System.out.println("");
        }
       // System.out.println("Type a town");

        // Read the house number
        String town = reader.readLine();

        //if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = map.get(town);
            System.out.println(familyName);
        //}
    }
}
