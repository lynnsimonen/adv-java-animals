package us.mattgreen;
import java.util.Scanner;

//??? --- Hint: Pass the list to the user input-gathering object. --- ???
public class NewUserAnimal {

    public Talkable newPet() {
        Scanner keyboard = new Scanner(System.in);
        String petName="";
        String choice="";
        int miceKilled = 0;
        String friendlyDog = "";
        Boolean friendly = true;

        //Ask the user what type of animal they want to create
        //Use decisions and exceptions to verify that the user has entered data of the correct type.
        do {
            try {
                System.out.println("\n\rWhich pet would you like to create? \n" +
                        "a. cat\n" +
                        "b. dog\n");
                choice = keyboard.nextLine().toUpperCase();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } while (!choice.equals("A") && !choice.equals("B"));
        //} while (choice.equals(""));

        //   ----------------------  CAT  --------------------------------------------
        if (choice.equals("A")) {
            do {
                try {
                System.out.println("What would you like to name your cat?");
                //Accept the input(s) necessary to instantiate that type of object
                petName = keyboard.nextLine();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            } while (petName.equals(""));
            do{
                try {
                    System.out.println("How many mice has " + petName + " killed?");
                    miceKilled = Integer.parseInt(keyboard.nextLine());
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            } while(miceKilled < 0);
            //Create an object of that type
            return new Cat(miceKilled, petName);
        }

            //   ----------------------  DOG  --------------------------------------------
        else {
            do {
                try {
                    System.out.println("What would you like to name your dog?");
                    //Accept the input(s) necessary to instantiate that type of object
                    petName = keyboard.nextLine();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            } while (petName.equals(""));
            do {
                try {
                    System.out.println("Is " + petName + " friendly? \r\nyes (Y)\r\nno (N)");
                    friendlyDog = keyboard.nextLine().toUpperCase();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
                // Why is there no error statement for "2"?
            } while (!friendlyDog.equals("Y") && !friendlyDog.equals("N"));
            //} while (friendlyDog.equals(""));
            if (friendlyDog.equals("N"))
                friendly = false;
            //Create an object of that type
            return new Dog(friendly, petName);
        }
    }
}
