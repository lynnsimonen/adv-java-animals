package us.mattgreen;

import java.util.ArrayList;

        //In your project, create a class that does the following:
        //
        //Ask the user what type of animal they want to create
        //Accept the input(s) necessary to instantiate that type of object
        //Create an object of that type
        //Add the object to the ArrayList
        //Hint: Pass the list to the user input-gathering object.
        //
        //This class should use decisions and exceptions to verify that the user has entered data of the correct type.
        //
        //In Main.java, find the three lines surround by comments.
        //
        //Replace these three lines with code that does the following:
        //
        //Instantiate an object of your user input-gathering class
        //Use that object to add an object to the list

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {
        ArrayList<Talkable> zoo = new ArrayList<>();

        // Lines to Replace Begin Here
        zoo.add(new Dog(true, "Bean"));
        zoo.add(new Cat(9, "Charlie"));
        zoo.add(new Teacher(44, "Stacy Read"));
        // End Lines to Replace

        for (Talkable thing : zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
