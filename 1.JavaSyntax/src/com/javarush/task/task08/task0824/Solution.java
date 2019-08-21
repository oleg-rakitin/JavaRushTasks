package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("child12", true, 12);
        Human child2 = new Human("child13", true, 12);
        Human child3 = new Human("child14", true, 12);

        Human father = new Human("father", true, 25, new ArrayList<Human>(Arrays.asList(child1,
                child2,
                child3)));
        Human mother = new Human("mother", false, 312, new ArrayList<Human>(Arrays.asList(child1,
                child2,
                child3)));

        Human grandfather1 = new Human("grandfather", true, 25, new ArrayList<Human>(Arrays.asList(father)));
        Human grandmother2 = new Human("grandmother", false, 312, new ArrayList<Human>(Arrays.asList(father)));

        Human grandfather3 = new Human("grandfather1", true, 25, new ArrayList<Human>(Arrays.asList(mother)));
        Human grandmother4 = new Human("grandmother2", false, 312, new ArrayList<Human>(Arrays.asList(mother)));

        for(Human h : Human.humans)
        {
            System.out.println(h);
        }
    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;
        public static ArrayList<Human> humans = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            humans.add(this);
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
