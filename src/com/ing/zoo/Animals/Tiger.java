package com.ing.zoo.Animals;

import com.ing.zoo.Classes.Animal;
import com.ing.zoo.Interfaces.Carnivores;
import com.ing.zoo.Interfaces.TrickAnimal;

import java.util.Random;

public class Tiger extends Animal implements Carnivores, TrickAnimal {
    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
        setHelloText("rraaarww");
        setEatText("nomnomnom oink wubalubadubdub");
    }

    @Override
    public void eatMeat() {
        super.printEatText();
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            setTrick("jumps in tree");
        }
        else
        {
            setTrick("scratches ears");
        }
        super.printTrick();
    }
}
