package students;
import java.util.*;
public class Student{
    String name;
    int age;
    String mobileNumber;
    String rollNo;
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name :");
        this.name=sc.nextLine();
        System.out.println("Enter the age :");
        Scanner sc2=new Scanner(System.in);
        this.age=sc2.nextInt();
        System.out.println("Enter the roll number :");
        this.rollNo=sc.nextLine();
        System.out.println("Enter the mobile number :");
        this.mobileNumber=sc.nextLine();
    }
    public void printData(){
        System.out.println("The name of the student is           : "+this.name);
        System.out.println("The roll number of the student is    : "+this.rollNo);
        System.out.println("The mobile number of the student is  : "+this.mobileNumber);
        System.out.println("The age of the student is            : "+this.age);
    } 
};