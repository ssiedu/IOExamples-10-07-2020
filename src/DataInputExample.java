
import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInputExample {

    public static void main(String[] args) throws Exception {
        //here we will read premitive data from empinfo.txt
        
        FileInputStream fis=new FileInputStream("g:/data/empinfo.txt");
        DataInputStream dis=new DataInputStream(fis);
        int v1=dis.readInt();
        double v2=dis.readDouble();
        boolean v3=dis.readBoolean();
        dis.close(); fis.close();
        System.out.println("Emp No : "+v1);
        System.out.println("Salary : "+v2);
        System.out.println("Marrid : "+v3);
    }
}
