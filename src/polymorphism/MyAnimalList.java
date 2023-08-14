package polymorphism;

import Encapsulation.Dog;

public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a){
        if(nextIndex < animals.length){
            animals[nextIndex] = a;  // instantiate an animal of a passed parameter

            if(a instanceof Dog){
                System.out.println("A dog is added too.");
            }
            nextIndex++;
            System.out.println("Animal added at index :"+nextIndex);
        }
    }
}
