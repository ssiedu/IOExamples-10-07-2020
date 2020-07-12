import java.io.FileOutputStream;

public class WriteDataExampleOne {

    public static void main(String[] args) throws Exception {

        //trying to write to a file "g:/data/mydata.txt"
        
        //step-1 (opening a stream to output destination)
        FileOutputStream fos=new FileOutputStream("g:/data/mydata.txt" , true);
        //step-2 (write the data on stream)
        //fos.write(65); fos.write(66); fos.write(67); fos.write(68);
        //fos.write(101); fos.write(102); fos.write(103);
        fos.write(65); fos.write(66);fos.write(67);
        //step-3 (close the stream)
        fos.close();
        System.out.println("Data Stored Successfully");
    }
}
