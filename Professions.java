package professions;
import java.util.*;
public class Professions{
    String name;
    String mobile_Number;
    int age;
    int Experience;
    public void getData(){
        System.out.println("Enter the name");
        Scanner sc1=new Scanner(System.in);
        this.name=sc1.nextLine();
        System.out.println("Enter the mobile number");
        this.mobile_Number=sc1.nextLine();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the age");
        this.age=sc2.nextInt();
        System.out.println("Enter the Experience");
        this.Experience=sc2.nextInt();
    }
    public void PrintData(){
        System.out.println("the name"+this.name);
        System.out.println("the mobile number"+this.mobile_Number);
        System.out.println("the age"+this.age);
        System.out.println("the Experience"+this.Experience);
    }
}