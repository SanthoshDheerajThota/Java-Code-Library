package professions;
import java.util.*;
public class Programmer extends Professions{
    int languages;
    int projects;
    public void getData(){
        super.getData();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of  languages known and projects done");
        this.languages=sc.nextInt();
        this.projects=sc.nextInt();
    }
    public void printData(){
        super.PrintData();
        System.out.println("The languages Known are "+this.languages);
        System.out.println("The projects done are "+this.projects);
    }
}