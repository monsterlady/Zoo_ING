package com.ing.zoo.Animals;

import com.ing.zoo.Classes.Animal;
import com.ing.zoo.Interfaces.Omnivores;

public class Zebra extends Animal implements Omnivores {
    public Zebra() {
    }

    public Zebra(String name) {
        super(name);
        setHelloText("zebra zebra");
        setEatText("munch munch zank yee bra");
    }

    @Override
    public void eatLeaves() {
        super.printEatText();
    }
}
