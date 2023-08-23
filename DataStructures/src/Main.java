import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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


//        Convenience methods for collections
        System.out.println("\nConvenience methods\n--------------\n");
        System.out.println("Creating a collections of items");

//        with lists
        List<String> strings = List.of("somersault", "cassidy", "$10");
        System.out.println("List : " + strings);
        System.out.println(strings instanceof List);

//        with sets
        Set<Song> songs = Set.of(new Song("somersault", "zero 7", 147),
                new Song("cassidy", "grateful dead", 158),
                new Song("$10", "hitchhiker", 140));
        System.out.println("Set : " + songs);   //  will print according toString method defined earlier

// with map
        Map<String, Integer> scores2 = Map.of("Kathy", 42,
                "Bert", 343,
                "Skyler", 420);
        System.out.println("Maps : " + scores2);

//        with map entries
        Map<String, String> stores = Map.ofEntries(Map.entry("Riley", "Supersports"),
                Map.entry("Brooklyn", "Camera World"),
                Map.entry("Jay", "Homecase"));

        System.out.println(stores);
    }
}