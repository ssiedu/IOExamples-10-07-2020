
import java.io.FileInputStream;


public class ReadDataExampleThree {
    public static void main(String[] args) throws Exception {

        FileInputStream fis=new FileInputStream("g:/data/alpha.txt");
        int n=fis.read();
        System.out.println((char)n);        //a
        n=fis.read();
        System.out.println((char)n);        //b
        fis.skip(3);                        //c,d,e
        n=fis.read();
        System.out.println((char)n);        //f
        n=fis.read();
        System.out.println((char)n);        //g
        n=fis.read();
        System.out.println((char)n);        //h
        fis.skip(2);                        //i,j
        n=fis.read();
        System.out.println((char)n);        //k
        fis.close();
        
    }
}
