package com.ing.zoo.Animals;

import com.ing.zoo.Classes.Animal;
import com.ing.zoo.interfaces.Carnivores;
import com.ing.zoo.interfaces.TrickAnimal;

public class Dragon extends Animal implements Carnivores, TrickAnimal {
    public Dragon() {
    }

    public Dragon(String name) {
        super(name);
        setHelloText("Dragon here!");
        setEatText("Told ya durum is the best!");
        setTrick("'spray fire!!!'");
    }

    @Override
    public void eatMeat() {
        super.printEatText();
    }

    @Override
    public void performTrick() {
        super.printTrick();
    }

}
