package com.pattern;

public class AnimalFactory {
    public static Animal getAnimal(String type, String leg, String color, String speak){
        Animal animal = null;
        if(type.equalsIgnoreCase("dog")){
            animal = new Dog(leg, color, speak);
        } else if (type.equalsIgnoreCase("cat")){
            animal = new Cat(leg, color, speak);
        }
        return animal;
    }
}
