package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int prev = 0;
        int maxcount=1;
        int currCount= 1;
        for(int i = 0; i < 10; i++)
        {
            int num = Integer.parseInt(br.readLine());

            if(i == 0)
            {
                prev = num + 1;
            }

                list.add(num);
                if(prev == num) currCount++;
                else {currCount = 1; prev = num;}

                if(currCount > maxcount){
                    maxcount = currCount;
                }

        }
        System.out.println(maxcount);

    }
}