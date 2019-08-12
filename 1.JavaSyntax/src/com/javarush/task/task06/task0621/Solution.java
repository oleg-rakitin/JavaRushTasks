package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String grfVasya, grmMurka,fathe,mathe,sonn,docha2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        grfVasya = reader.readLine();
        grmMurka = reader.readLine();
        fathe = reader.readLine();
        mathe = reader.readLine();
        sonn = reader.readLine();
        docha2 = reader.readLine();

        Cat grandfatherVasya = new Cat(grfVasya);
        Cat grandmotherMurka = new Cat(grmMurka);

        Cat father = new Cat(fathe, grandfatherVasya,null);
        Cat mother = new Cat(mathe, null,grandmotherMurka);

        Cat son = new Cat(sonn, father,mother);
        Cat docha = new Cat(docha2, father,mother);

        //String motherName = reader.readLine();
        //Cat catMother = new Cat(motherName);

        //String daughterName = reader.readLine();
        //Cat catDaughter = new Cat(daughterName, catMother);

       // System.out.println(catMother);
       // System.out.println(catDaughter);
        System.out.println(grandfatherVasya);
        System.out.println(grandmotherMurka);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(docha);
    }

    public static class Cat {
        private String name;
        private Cat parent,catFather,catMother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        Cat(String name, Cat catFather, Cat catMother) {
            this.name = name;
            this.catFather = catFather;
            this.catMother = catMother;

        }

        @Override
        public String toString() {
            if(catMother == null && catFather == null)
                return "The cat's name is " + name + ", no mother, no father ";
            if (catFather == null && catMother!=null)
                return "The cat's name is " + name + ", mother is "+catMother.name + ", no father ";
            if (catMother == null && catFather!=null)
                return "The cat's name is " + name + ", no mother, father is "+catFather.name;
            else
                return "The cat's name is " + name + ", mother is " + catMother.name +  ", father is "+catFather.name;
        }
    }

}
