package com.ing.zoo;

import com.ing.zoo.Classes.Animal;
import com.ing.zoo.Interfaces.Carnivores;
import com.ing.zoo.Interfaces.Omnivores;
import com.ing.zoo.Interfaces.TrickAnimal;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Animal> animalList = new ArrayList<>();

    public Admin(List<Animal> animalList) {
        this.animalList = animalList;
    }


    public void start(String[] commands, String input){
        if(input.length() != 0){
            if (commands[0].equals(input)) {
                allSayHello();
            } else if (commands[1].equals(input)){
                giveLeaves();
            } else if (commands[2].equals(input)){
                giveMeat();
            } else if (commands[3].equals(input)){
                performTricks();
            } else if (input.split(" ")[0].equals(commands[0])){
                String name = input.split(" ")[1];
                sayHello(name);
            }
            else {
                printError(input);
            }
        }
    }

    public void allSayHello(){
        for (Animal each: animalList) {
            each.sayHello();
        }
    }

    public Animal getAnimalByName(String name){
        for(Animal each : animalList){
            if (each.getName().equals(name)){
                return each;
            }
        }
        return null;
    }

    public void sayHello(String name){
        Animal temp = getAnimalByName(name);
        if (temp != null){
            temp.sayHello();
        } else {
            printError("hello " + name);
        }
    }

    public void giveLeaves(){
        for(Animal each : animalList){
            if(each instanceof Omnivores){
                ((Omnivores) each).eatLeaves();
            }
        }
    }

    public void giveMeat(){
        for(Animal each : animalList){
            if(each instanceof Carnivores){
                ((Carnivores) each).eatMeat();
            }
        }
    }

    public void performTricks(){
        for(Animal each : animalList){
            if(each instanceof TrickAnimal){
                ((TrickAnimal) each).performTrick();
            }
        }
    }

    public void printError(String input){
        System.out.println("Unknown command: " + input);
    }
}
