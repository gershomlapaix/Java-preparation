import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoreExample {
    public void moreExamples(){
        List<String> names = Arrays.asList("Alice", "Bob", "Anna","Alex", "John");

//        filter out the names that start with the letter "A"
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);

//        square each number
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squareNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println(squareNumbers);

//        get the sum of numbers using "reduce" method
        int sum = numbers.stream()
                .reduce(0, (a,b)-> a+b);
        System.out.println("Sum : "+sum);

//        parallel processing for large datasets
        int sumOfSquares = IntStream.rangeClosed(1,10)
                .parallel()
                .map(i ->i*i)
                .sum();

        System.out.println("Sum of squares: " + sumOfSquares); // Output: Sum of squares: 385
    }
}
