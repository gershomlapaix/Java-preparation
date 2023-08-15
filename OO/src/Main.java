import Encapsulation.Cat;
import Encapsulation.Dog;
import polymorphism.MakeCanine;
import polymorphism.MyAnimalList;

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

//        test polymorphism 2
        MyAnimalList animalList = new MyAnimalList();
        animalList.add(new Dog());
        animalList.add(new Cat());

//        test interfaces
        dog2.play();

//        test
        TestThoughts tt = new TestThoughts(1);
        System.out.println(tt.getLegs());


    }
}