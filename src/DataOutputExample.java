
import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DataOutputExample {

    public static void main(String[] args) throws Exception {

        //here we will write some premitive data to file
        
        int eno=1516;       double sal=74500.55;        boolean married=true;
        //to write the data to a file we need FileOutputStream
        FileOutputStream fos=new FileOutputStream("g:/data/empinfo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(eno); dos.writeDouble(sal); dos.writeBoolean(married);
        dos.close();
        fos.close();
        System.out.println("Data Stored .... ");
    }
}
