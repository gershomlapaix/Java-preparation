package TestSerialization;

import java.io.Serializable;

public class Duck implements Serializable {
    private int size;
    transient String name;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size){
        this.size = size;
    }

}
