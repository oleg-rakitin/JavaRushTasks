package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int countThis=0;
        int countAnother = 0;
        if(this.age > anotherCat.age)
            countThis++;
        else
            countAnother++;
        if(this.weight>anotherCat.weight)
            countThis++;
        else
            countAnother++;
        if(this.strength > anotherCat.strength)
            countThis++;
        else
            countAnother++;
        if(countThis>countAnother)
            return true;
        else return false;
    }

    public static void main(String[] args) {

    }
}
