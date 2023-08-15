package Encapsulation;

import DDDAbolish.Pet;
import polymorphism.Canine;

public class Dog extends Canine implements Pet {
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int incomingSize){
        size = incomingSize;
    }

    public void bark(){
        if(size > 60){
            System.out.println("Woof woof!!");
        } else if (size > 14) {
            System.out.println("Ruff ruff!");
        }else {
            System.out.println("Yip yip!!");
        }
    }

    @Override
    public void roam() {
        System.out.println("Dog roams.");
    }

    @Override
    public void eat(){
        System.out.println("Dog feeds on bones and meat.");
    }

    @Override
    public void beFriendly() {
        System.out.println("The dog must be friendlier.");
    }

    @Override
    public void play() {
        System.out.println("The dog must play with it's boss.");
    }
}
