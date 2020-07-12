import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageCopyExample {

    public static void main(String[] args) throws Exception {

        //creating a copy of image.png
        
        //reading image.png
        FileInputStream fis=new FileInputStream("e:/images/mobile.png");
        byte b[]=new byte[fis.available()];
        fis.read(b);    //we are reading the data and storing it to an byte array
        fis.close();        
        //writing to imgcopy.png
        FileOutputStream fos=new FileOutputStream("g:/data/imgcopy.png");
        fos.write(b);   //the same byte array containing the data from mobile.png we are write to o/p dest
        fos.close();
        System.out.println("Operation Success..");
    }
}
