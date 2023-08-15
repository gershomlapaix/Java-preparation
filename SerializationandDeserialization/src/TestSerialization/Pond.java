package TestSerialization;

import java.io.Serializable;

public class Pond implements Serializable {
    // Duck instance in pond
    private Duck duck;

    public Duck getDuck() {
        return duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }
}
