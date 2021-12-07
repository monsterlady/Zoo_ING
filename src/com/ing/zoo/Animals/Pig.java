package com.ing.zoo.Animals;

import com.ing.zoo.Classes.Animal;
import com.ing.zoo.interfaces.Carnivores;
import com.ing.zoo.interfaces.Omnivores;
import com.ing.zoo.interfaces.TrickAnimal;

import java.util.Random;

public class Pig extends Animal implements Omnivores, Carnivores, TrickAnimal {
    public Pig() {
    }

    public Pig(String name) {
        super(name);
        setHelloText("splash");
    }


    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            setTrick("rolls in the mud");
        }
        else
        {
            setTrick("runs in circles");
        }
        super.printTrick();
    }

    @Override
    public void eatMeat() {
        setEatText("nomnomnom oink thx");
        super.printEatText();

    }

    @Override
    public void eatLeaves() {
        setEatText("munch munch oink");
        super.printEatText();
    }
}
