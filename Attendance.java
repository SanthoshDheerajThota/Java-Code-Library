package students;
import java.util.*;
public class Attendance extends Student{
    float attendance;
    public void getData(){
        super.getData();
        System.out.println("Enter the attendance percentage of the student :");
        Scanner sc=new Scanner(System.in);
        this.attendance=sc.nextFloat();
    }
    public void printData(){
        super.printData();
    }
    public void setAttendance(){
        System.out.println("Enter the attendance percentage");
        Scanner sc=new Scanner(System.in);
        this.attendance=sc.nextFloat();
    }
    public void  getAttendance(){
        System.out.println("The name of the Student is "+super.name);
        System.out.println("Th attendance of the student is "+this.attendance);
    }
}