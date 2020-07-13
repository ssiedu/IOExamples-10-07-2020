
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ObjectInputExample {
    public static void main(String[] args) throws Exception {
        //here we will read the object from studinfo.txt 
        FileInputStream fis=new FileInputStream("g:/data/studinfo.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s= (Student) ois.readObject();   //will read the object and return it to you
        s.info();
        ois.close();
        fis.close();
    }
}
