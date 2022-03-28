package us.mattgreen;

import java.util.Scanner;

public class NewUserAnimal extends Pet {

    public NewUserAnimal(String name) {
        super(name);
    }

    public Pet newPet(String name) {

        Pet petChoice;
        String petName;
        String choice;
        Scanner keyboard = null;

        System.out.println("\n\rWhich pet would you like to create? \n" +
                "a. cat\n" +
                "b. dog");
        choice = keyboard.nextLine();
        if (choice.toUpperCase() == "A") {
            do {
                System.out.println("What would you like to name your cat?");
                petName = keyboard.nextLine();
                if (petName != "") {
                    petChoice = new Cat(0, petName);
                    return petChoice;
                }
            } while (petName == "");
        }
        if (choice.toUpperCase() == "B") {
            do {
                System.out.println("What would you like to name your dog?");
                petName = keyboard.nextLine();
                if (petName != "") {
                    petChoice = new Dog(true, petName);
                    return petChoice;
                }
            } while (petName == "");
        }

        // do ... while leads to an error asking for a return (it doesn't seem to be able
        // to recognize the returns in the do... while statement  :(
        return petChoice = new Cat(0, "Poor Little Noname Kitty");
    }
}
