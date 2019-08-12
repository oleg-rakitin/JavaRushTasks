package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandmother1 = new Human("Аня", false, 65);
        Human grandfather1 = new Human("Павел", true, 65);
        Human grandmother2 = new Human("Дрында", false, 65);
        Human grandfather2 = new Human("Чечемен", true,65);

        Human mother = new Human("жожа", false, 451, grandfather1,grandmother1);
        Human father = new Human("жижа", true,435, grandfather2, grandmother2);
        Human son1 = new Human("жкжв", true, 65,father,mother);
        Human son2 = new Human("дадэ", true, 65,father,  mother);
        Human dota3 = new Human("Яшрныда", false, 65,father,  mother);

        for(Human hu : Human.list) System.out.println(hu);







    }

    public static class Human {
        // напишите тут ваш код
        public String name;
        public boolean sex;
        public Human father;
        public int age;
        public Human mother;

        public static ArrayList<Human> list = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.father = father;
            this.age = age;
            this.mother = mother;
            list.add(this);
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            list.add(this);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}