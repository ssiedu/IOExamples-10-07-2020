public class Student implements java.io.Serializable {
    private int rno;
    private String name;
    private String branch;
    private int sem;

    public Student(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }
    
    public void info(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Stud Name   : "+name);
        System.out.println("Branch ..   : "+branch);
        System.out.println("Semester    : "+sem);
        System.out.println("____________________________________________");
    }
}
