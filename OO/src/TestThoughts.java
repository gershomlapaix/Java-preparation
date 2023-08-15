public class TestThoughts {
    private int legs;

    public TestThoughts(int l){
        legs = l;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if(legs < 4){
            System.out.println("No animal with such number of legs.");
        }
        else {
            this.legs = legs;
        }
    }
}
