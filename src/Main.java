import Encapsulation.Dog;
import polymorphism.MakeCanine;

public class Main {
    public static void main(String[] args) {

//        test the encapsulation
        Dog dog = new Dog();
        dog.setSize(70);

        Dog dog2 = new Dog();
        dog2.setSize(8);

        System.out.println("For the first dog: ");
        dog.bark();

        System.out.println("\n For the second dog: ");
        dog2.bark();

//        test polymorphism
        MakeCanine makeCanine = new MakeCanine();
        makeCanine.go();

    }
}