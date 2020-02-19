package com.pattern;

public class Cat extends Animal {

    public String leg;
    public String color;
    public String speak;

    public Cat(String leg, String color, String speak) {
        this.leg = leg;
        this.color = color;
        this.speak = speak;
    }

    @Override
    public String getLegNumber() {
        return this.leg;
    }

    @Override
    public String getHairColor() {
        return this.color;
    }

    @Override
    public String getSpeak() {
        return this.speak;
    }
}
