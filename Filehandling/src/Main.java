import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        test file Handling

//        create file
        new CreateFileExample().createFile();

//        write to a file
        new WriteToFile().writeToFile();

//        read from a file
        System.out.println("\n---- Reading from the file -----");
        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))){
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
}