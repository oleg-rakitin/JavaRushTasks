package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.net.Inet4Address;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String name;
        int age;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        name =  bufferedReader.readLine();
        age = Integer.parseInt(bufferedReader.readLine());
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха");
    }
}
