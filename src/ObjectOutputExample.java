
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class ObjectOutputExample {

    public static void main(String[] args) throws Exception {

        Student st=new Student(111,"AAA","CS",4);
        st.info();
        //here we are preserving the object using ObjectOutputStream
        FileOutputStream fos=new FileOutputStream("g:/data/studinfo.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(st);
        oos.close();
        fos.close();
        System.out.println("Object Stored.....");
    }
}
