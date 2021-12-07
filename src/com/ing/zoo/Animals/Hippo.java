package com.ing.zoo.Animals;

import com.ing.zoo.Classes.Animal;
import com.ing.zoo.Interfaces.Omnivores;

public class Hippo extends Animal implements Omnivores {
    public Hippo() {
    }

    public Hippo(String name) {
        super(name);
        setHelloText("splash");
        setEatText("munch munch lovely");
    }

    @Override
    public void eatLeaves() {
        super.printEatText();
    }

}
