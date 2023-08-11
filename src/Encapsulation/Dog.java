package Encapsulation;

public class Dog {
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
}
