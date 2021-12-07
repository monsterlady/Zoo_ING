package com.ing.zoo.Animals;

import com.ing.zoo.Classes.Animal;
import com.ing.zoo.Interfaces.Carnivores;
import com.ing.zoo.Interfaces.Omnivores;
import com.ing.zoo.Interfaces.TrickAnimal;

public class Panda extends Animal implements Carnivores, Omnivores, TrickAnimal {
    public Panda() {
    }


    public Panda(String name) {
        super(name);
        setHelloText("I'm Panda!!!");
        setTrick("Kong fu Panda!!");
    }

    @Override
    public void eatMeat() {
        setEatText("BBQ hehehe");
        super.printEatText();
    }

    @Override
    public void eatLeaves() {
        setEatText("Bamboo hahahaha");
        super.printEatText();
    }

    @Override
    public void performTrick() {
        super.printTrick();
    }
}
