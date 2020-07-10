
import java.io.File;
import java.util.Date;


public class FileExampleOne {
    public static void main(String[] args) {
        
        File f=new File("g:/data/info.txt");
        //File f=new File("e:/javaprog/Test.txt");
        long val=f.lastModified();
        System.out.println(val);
        Date dt=new Date(val);
        System.out.println(dt);
        /*
        File f=new File("g:/data/info.txt");
        //boolean res=f.isHidden();
        boolean res=f.canWrite();
        System.out.println(res);
        */
        
        /*
        File f=new File("g:/data");
        if(f.isDirectory()){
            String s[]=f.list();
            for(String str:s){
                System.out.println(str);
            }
        }else{
            System.out.println("Not a folder or doesnt exists");
        }
        */
        
        /*
        File f=new File("g:/data/info.txt");        
        if(f.exists()){
            if(f.isFile()){
                long size=f.length();
                System.out.println(size);
            }else{
                System.out.println("Its A Folder");
            }
            
        }else{
            System.out.println("Doesn't Exists");
        }
        */
    }
}
/*
    File class Methods (non-static)
    ---------------------------------
    long lastModified()
    boolean canWrite()
    boolean isHidden()
    boolean isFile()    //true if it is a file, false if it doesnt exists or its folder
    boolean isDirectory()   //true if it is a folder otherwise false
    boolean exists()
    long length()
    String[] list()     //returns the elements of a folder in form of a String array

*/