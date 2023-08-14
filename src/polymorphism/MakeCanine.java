package polymorphism;

import Encapsulation.Dog;

public class MakeCanine {
    public void go(){
        Canine c;
        c = new Dog();
//        c = new Canine();  // Error
        c.roam();
    }
}
