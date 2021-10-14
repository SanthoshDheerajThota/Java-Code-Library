import java.util.*;
abstract class Phone{
   String name;
   String model_Number;
   abstract public void setDetails();
   abstract public void printModel();
   abstract public void printDetails();
   abstract public void Call();
}
class Realme extends Phone{
   public void setDetails(){
      System.out.println("Enter the model name :");
      Scanner sc=new Scanner(System.in);
      super.name=sc.nextLine();
      System.out.println("Enter the model number of the company :");
      super.model_Number=sc.nextLine();
   }
   public void printModel(){
      System.out.println("The model name of the Phone is "+super.name);
   }
   public void printDetails(){
      System.out.println("the name of the model is "+super.name);
      System.out.println("The model number of the Phone is "+super.model_Number);
   }
   public void Call(){
      System.out.println("The call is placed");
   }
}
public class deleteNow{
   public static void main(String[] args) {
      Phone mobile=new Realme();
      mobile.setDetails();
      mobile.printDetails();
   }
}
