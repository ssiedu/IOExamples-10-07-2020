
import java.io.File;

public class FileExampleTwo {

    public static void main(String[] args) {

        File f1=new File("g:/data/info.txt");       //for the file to be renamed
        File f2=new File("g:/data/trial.txt");      //for the new file
        boolean res=f1.renameTo(f2);
        
        /*
        File f = new File("g:/data/pom.xml");
        //boolean res = f.mkdir();
        boolean res=f.delete();
        */
        if(res){
            System.out.println("Operation Success");
        }else{
            System.out.println("Operation Failed");
        }
        
    }
}
/*
    boolean mkdir()
    boolean delete()
    boolean renameTo(File)

*/
