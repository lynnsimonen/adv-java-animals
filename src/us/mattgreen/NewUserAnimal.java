package us.mattgreen;
import java.util.Scanner;

//??? --- Hint: Pass the list to the user input-gathering object. --- ???
public class NewUserAnimal {

    public Talkable newPet() {
        String petName;
        String choice;
        Scanner keyboard = new Scanner(System.in);

        //Ask the user what type of animal they want to create
        //Use decisions and exceptions to verify that the user has entered data of the correct type.
        do {
            System.out.println("\n\rWhich pet would you like to create? \n" +
                    "a. cat\n" +
                    "b. dog\n");
            choice = keyboard.nextLine();
            if (choice.toUpperCase().equals("A")) {
                do {
                    System.out.println("What would you like to name your cat?");
                    //Accept the input(s) necessary to instantiate that type of object
                    petName = keyboard.nextLine();
                } while (petName.equals(""));
                //Create an object of that type
                return new Cat(0, petName);
            }
            if (choice.toUpperCase().equals("B")) {
                System.out.println("What would you like to name your dog?");
                //Accept the input(s) necessary to instantiate that type of object
                petName = keyboard.nextLine();
                if (petName != "") {
                    //Create an object of that type
                    return new Dog(true, petName);
                }
            }
        } while (choice.toUpperCase() != "A" || choice.toUpperCase() != "B");
            // do ... while leads to an error asking for a return (it doesn't seem to be able
            // to recognize the returns in the "do... while" statement  :(
            //return petChoice = new Cat(0, " YOU FORGOT TO GIVE ME A NAME!!!,  ");
            //System.out.println("ERROR: String is null or wrong entry");
            return new Cat(0, " YOU DIDN'T GIVE ME A NAME!!!");

    }
}

