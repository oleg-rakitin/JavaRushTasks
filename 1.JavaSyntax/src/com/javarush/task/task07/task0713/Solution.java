package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

/* 
Играем в Jолушку
*/

public class Solution {

    public static int readInt() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }


    //public static ArrayList<Integer> list = new ArrayList();
    //public static ArrayList<Integer> listDel3 = new ArrayList<>();
    //public static ArrayList<Integer> listDel2 = new ArrayList<>();
    //public static ArrayList<Integer> all = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> listDel3 = new ArrayList<>();
        ArrayList<Integer> listDel2 = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();
        int i = 0;
        int num;
        //ReaderUtil.readInt();
        while (i < 20) {
            num = readInt();
            list.add(num);
            i++;
        }
        for (int al : list) {
            if (al % 3 == 0)
                listDel3.add(al);
            if (al % 2 == 0)
                listDel2.add(al);
            if (al % 2 != 0 && al % 3 != 0) {
                all.add(al);
            }
        }

        //zhizha();
        printList(listDel3);
        printList(listDel2);
        printList(all);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int elem : list) {
            System.out.println(elem);
        }
    }

}
