import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public void writeToFile(){
        String[] texts = {"Here is file handling in java.","Every Java developer should know."};

        /*
        try(FileWriter writer = new FileWriter("example.txt")){
            int x = 0;
           while(x < texts.length){
               writer.write(texts[x]);
               x++;
            }
            System.out.println("done writing to a file");
        }
         */

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))){
            int x = 0;
            while(x < texts.length) {
                writer.write("Hello, bufferedWriter!");
                writer.newLine();    // move to the next line
                x++;
            }
        }
        catch (IOException io){
            System.out.println("An error occured : "+io.getMessage());
        }
    }
}
