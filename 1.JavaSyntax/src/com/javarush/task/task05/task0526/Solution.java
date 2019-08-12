package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("a", 12, "asda");
        Man man2 = new Man("asda", 44, "asda");

        Woman w = new Woman("sda", 662, "21d");
        Woman as = new Woman("asda", 211, "2easd");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(w);
        System.out.println(as);
    }
    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
    public static class Woman extends Man{
        public Woman(String name, int age, String address) {
            super(name, age, address);
        }
    }

    //напишите тут ваш код
}
