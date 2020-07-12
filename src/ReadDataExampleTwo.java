
import java.io.FileInputStream;


public class ReadDataExampleTwo {
    public static void main(String[] args) throws Exception {

        //opening a stream
        FileInputStream fis=new FileInputStream("g:/data/alpha.txt");
        //finding the no bytes available in stream
        int total=fis.available();
        //creating an array of size equals to no bytes available
        byte b[]=new byte[total];  
        //reading the data from stream and storing to byte array
        fis.read(b);           
        //converting byte array to String
        String s=new String(b);
        //showing the string on console.
        System.out.println(s);
        //closing the stream
        fis.close();
            
        
    }
}
/*
    read(), 
    read(byte[]),
    available(),
    close()
    skip

*/