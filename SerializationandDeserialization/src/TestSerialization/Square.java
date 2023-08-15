package TestSerialization;

import java.io.Serializable;

public class Square implements Serializable {
    private int width;
    private int height;

    public Square(){}

    public Square(int w, int h){
        this.width = w;
        this.height = h;
    }
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
