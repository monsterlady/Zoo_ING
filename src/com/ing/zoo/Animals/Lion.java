package com.ing.zoo.Animals;

import com.ing.zoo.Classes.Animal;
import com.ing.zoo.Interfaces.Carnivores;

public class Lion extends Animal implements Carnivores {
    public Lion() {
    }

    public Lion(String name) {
        super(name);
        setHelloText("roooaoaaaaar");
        setEatText("nomnomnom thx mate");
    }


    @Override
    public void eatMeat() {
        super.printEatText();
    }
}
