
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteDataExampleThree {
     public static void main(String[] args) throws Exception {
         //trying to add something in begining
         
         //reading the existing contents
         FileInputStream fis=new FileInputStream("g:/data/mydata.txt");
         byte b[]=new byte[fis.available()];
         fis.read(b);
         String str=new String(b);
         fis.close();
         System.out.println(str);
         str="XYZ"+str;
         System.out.println(str);
         
         FileOutputStream fos=new FileOutputStream("g:/data/mydata.txt");
         byte barray[]=str.getBytes();
         fos.write(barray);
         fos.close();
         System.out.println("DATA STORED");
         
    }
}
/*
    OutputStream
    ---------------------------------------------------------------------
    void write(int)                 //single byte
    void write(byte[])              //whole byte array
    void write(byte[],int,int)      //writing the part of a byte array
    void close()
*/