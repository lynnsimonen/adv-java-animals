package us.mattgreen;
import java.util.ArrayList;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {
        ArrayList<Talkable> zoo = new ArrayList<>();

        //Instantiate an object of your user input-gathering class
        NewUserAnimal animal = new NewUserAnimal();

        //Add the object to the ArrayList
        zoo.add(animal.newPet());


        for (Talkable thing : zoo) {
            //print animal 2x
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            //print animal 1x
            System.out.println(line);
        }
    }

    //method to print the animal information:
    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
