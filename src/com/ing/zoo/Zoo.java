package com.ing.zoo;

import com.ing.zoo.Animals.*;
import com.ing.zoo.Animals.Hippo;
import com.ing.zoo.Animals.Lion;
import com.ing.zoo.Animals.Pig;
import com.ing.zoo.Animals.Tiger;
import com.ing.zoo.Animals.Zebra;
import com.ing.zoo.Classes.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // init list
        List<Animal> animalList = new ArrayList<>();
        // init objects
        Animal henk = new Lion("henk");
        animalList.add(henk);

        Animal elsa = new Hippo("elsa");
        animalList.add(elsa);

        Animal dora = new Pig("dora");
        animalList.add(dora);

        Animal wally = new Tiger("wally");
        animalList.add(wally);

        Animal marty = new Zebra("marty");
        animalList.add(marty);

        // add two new animals
        Animal fufu = new Panda("fufu");
        animalList.add(fufu);

        Animal lon = new Dragon("lon");
        animalList.add(lon);

        Admin admin = new Admin(animalList);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();
        admin.start(commands, input);
    }
}
