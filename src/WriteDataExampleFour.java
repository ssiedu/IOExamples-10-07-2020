
import java.io.FileOutputStream;


public class WriteDataExampleFour {

    public static void main(String[] args) throws Exception {

        String str="some text we are writing to a file";
        //converting a string to byte array
        byte b[]=str.getBytes();
        
        FileOutputStream fos=new FileOutputStream("g:/data/info.txt");
        //fos.write(b);   //complete array
        fos.write(b,5,15);  //index-5 start, to bytes written will be 15
        fos.close();
        System.out.println("Data Stored");
    }
}
