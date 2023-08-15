import TestSerialization.Duck;
import TestSerialization.Pond;
import TestSerialization.Square;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Square square = new Square();

        square.setHeight(6);
        square.setWidth(4);


        try{
            FileOutputStream fs = new FileOutputStream("shapes.ser");
            ObjectOutputStream os  = new ObjectOutputStream(fs);

            os.writeObject(square);
            os.close();
            System.out.println("Done saving a shape object!");
        }catch (Exception ex){
            ex.printStackTrace();
        }

//        Deserialization
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("shapes.ser"));
            Square restoredSquare = (Square) is.readObject();
            System.out.println(restoredSquare.getHeight());
        }catch(Exception ex){
            ex.printStackTrace();
        }

//        Another serialization
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ponds.ser"));

            Duck duck = new Duck();
            duck.setSize(30);
            duck.setName("Bestduck");

            Pond pond = new Pond();
            pond.setDuck(duck);
            os.writeObject(pond);

            System.out.println("object saved");
        }catch(Exception ex){
            ex.printStackTrace();
        }

//        Deserialization
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("ponds.ser"));
            Pond restoredPond = (Pond) is.readObject();
            System.out.println("Duck's size is "+restoredPond.getDuck().getSize());
            System.out.println("Duck's name is "+ restoredPond.getDuck().getName());
        }catch(Exception ex){
            ex.printStackTrace();
        }
        }
}