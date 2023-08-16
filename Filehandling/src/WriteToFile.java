import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public void writeToFile(){
        try(FileWriter writer = new FileWriter("example.txt")){
            String[] texts = {"Here is file handling in java.\n","Every Java developer should know."};
            int x = 0;
           while(x < texts.length){
               writer.write(texts[x]);
               x++;
            }
            System.out.println("done writing to a file");
        }catch (IOException io){
            System.out.println("An error occured : "+io.getMessage());
        }
    }
}
