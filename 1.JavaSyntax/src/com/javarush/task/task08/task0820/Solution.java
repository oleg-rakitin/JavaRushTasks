package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        for(int i = 0; i < 4; i++)
        {
            result.add(new Cat());
        }

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<Dog>();
        for(int i = 0; i < 3; i++)
        {
            result.add(new Dog());
        }

        //напишите тут ваш код

        return result;

    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш кодs
        Set<Object> set = new HashSet<>();
        set.addAll(cats);
        set.addAll(dogs);
        return set;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator iter = pets.iterator();
        while (iter.hasNext())
        {
            if(cats.contains(iter.next()))
            {
                iter.remove();
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for(Object obj : pets)
        {
            System.out.println(obj);
        }
    }

    public static class Cat{}
    public static class Dog{}

    //напишите тут ваш код
}
