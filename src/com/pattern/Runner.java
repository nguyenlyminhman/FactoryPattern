package com.pattern;

public class Runner {
    public static void main(String [] args){
        Animal cat = AnimalFactory.getAnimal("cat", "4", "yellow", "meow meow");
        Animal dog = AnimalFactory.getAnimal("dog", "4", "black", "gau gau");

        System.out.println("Factory cat: " + cat);
        System.out.println("Factory dog: " + dog);
    }
}
