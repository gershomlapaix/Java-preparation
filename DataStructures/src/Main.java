import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        test the collections
        new JukeBox().go();

//        Maps
        System.out.println("\nMaps\n----");
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kathy", 42);
        scores.put("Bert", 342);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println("Bert got "+ scores.get("Bert"));
    }
}