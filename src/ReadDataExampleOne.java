
import java.io.FileInputStream;
import java.util.Scanner;

//reading the data from a file

public class ReadDataExampleOne {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        //String path="g:/data/trial.txt";
        //String path="e:/javaprog/Test.java";
        System.out.println("Enter The File Name : ");
        String path=sc.next();
        //step-1 (open the stream)
        FileInputStream fis=new FileInputStream(path);
        //step-2 (read the data from stream)
        while(true){
            int n=fis.read();
            if(n==-1)break;
            System.out.print((char)n);
        }
        
        //step-3 (close the stream)
        fis.close();
        System.out.println();
    }
}
