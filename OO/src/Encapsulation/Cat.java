package Encapsulation;

import polymorphism.Canine;

public class Cat extends Canine {
    @Override
    public void eat() {
        System.out.println("Cat feeds on milk and rats.");
    }
}
