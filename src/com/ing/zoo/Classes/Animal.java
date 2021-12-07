package com.ing.zoo.Classes;

public abstract class Animal {
    // attributes
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String prefix(){
        return getName() + ": ";
    }

    public void printTrick(){
        System.out.println(prefix() + getTrick());
    }

    public void printEatText(){
        System.out.println(prefix() + getEatText());
    }

    // abstract method
    public void sayHello(){
        System.out.println(prefix()  + getHelloText());
    }

    public String getHelloText() {
        return helloText;
    }

    public void setHelloText(String helloText) {
        this.helloText = helloText;
    }

    public String getEatText() {
        return eatText;
    }

    public void setEatText(String eatText) {
        this.eatText = eatText;
    }
}
