import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        using Stream API
        List<String> strings = List.of("I", "am", "a", "list", "of", "strings");



//        long result = limit.count();  // calling the count terminal operator
//        System.out.println("The result is "+result);

        /*
        * ----How the streams work----
        * 1. Get the Stream from a source collection ==> .stream()
        * 2. Call zero or more "intermediate operations" on the stream     ==> .limit()
        * 3. Output the results with a "terminal operation" ==> .collect()
        *
        */

        /*
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        List<String> result = limit.collect(Collectors.toList());
        System.out.println(result);*/

//        by chaining
        List<String> result = strings.stream()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(result);

//        sorted result
        List<String> sortedResult = strings.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(sortedResult);

//        less natural sorting
        List<String> result2 = strings.stream()
                .sorted((str1, str2)->str1.compareToIgnoreCase(str2))
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(result2);

//        other more examples
        System.out.println("\n-----More examples----");
        new MoreExample().moreExamples();
    }
}