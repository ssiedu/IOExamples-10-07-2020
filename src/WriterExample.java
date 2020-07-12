import java.io.FileWriter;


public class WriterExample {

    public static void main(String[] args) throws Exception {

        FileWriter writer=new FileWriter("g:/data/writedata.txt");
        writer.write("This is some text we are writing using writer", 5, 20);
        writer.close();
        System.out.println("Data Stored");
        
        
        
    }
}
