package students;
import java.util.*;
public class Marks extends Student{
    int []marks=new int[6];
    float percentage;
    public void setMarks(){
        System.out.println("Enter the marks in 6 subjects :");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            marks[i]=sc.nextInt();
            percentage=(float)this.percentage+marks[i];
        }
        this.percentage=(float)this.percentage/6;
    } 
    public void showResults(){
        System.out.println("The name of the student is "+this.name);
        System.out.println("The result i as folows :");
        for(int i=0;i<6;i++){
            System.out.println("Marks["+i+"] = "+this.marks[i]);
        }
        System.out.println("The percentage is "+this.percentage);
    }
}