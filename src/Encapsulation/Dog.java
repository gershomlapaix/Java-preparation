package Encapsulation;

import polymorphism.Canine;

public class Dog extends Canine {
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
}
