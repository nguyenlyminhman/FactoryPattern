package com.pattern;

public abstract class Animal {

    public abstract String getLegNumber();

    public abstract String getHairColor();

    public abstract String getSpeak();

    public String toString(){
        return "Leg= " + this.getLegNumber() + ", Hair color: " + this.getHairColor() + ", Speak: " + this.getSpeak();
    }
}
