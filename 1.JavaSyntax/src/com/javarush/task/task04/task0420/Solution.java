package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        /*int min1 = 0;
        int min2 = 0;
        int min3 = 0;*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        /*if(num1 < num2 && num1 < num3) min1 = num1;
        else if(num2 < num1 && num2 < num3) min1 = num2;
        else min1 = num3;

        if(min1 == num1){min2 = Math.min(num2, num3); min3 = Math.max(num2, num3);}
        else if(min1 == num2){min2 = Math.min(num1, num3); min3 = Math.max(num2, num3);}
        else {min2 = Math.min(num2, num1); min3 = Math.max(num2, num1);}

        //System.out.println(min3 + " " + min2 + " " + min1);*/
        ArrayList list = new ArrayList();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        Collections.sort(list,Collections.reverseOrder());
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }


    }
}
