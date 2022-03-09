/*
      This code is completely written by Thota Santhosh Dheeraj
*/
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class App2 extends WindowAdapter implements ActionListener{
    Frame frame=new Frame();
    Label open=new Label("select one function");
    Button counter=new Button("counter");
    Button calculator=new Button("calulator");
    Button home=new Button("home");
    Label num1=new Label("enter num1 :");
    Label num2=new Label("enter num2 :");
    TextField getNum1=new TextField(10);
    TextField getNum2=new TextField(10);
    Label result=new Label("result=null");
    Button sum=new Button("sum");
    int counternum=0;
    TextField resultcount=new TextField(10);
    Button count=new Button("count");
    public void openApp(){
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(open);
        frame.add(counter);
        frame.add(calculator);
        frame.addWindowListener(this);
        counter.addActionListener(this);
        calculator.addActionListener(this);
    }
    public void opencalculator(){
        getNum1.setText("");
        getNum2.setText("");
        frame.add(num1);
        frame.add(getNum1);
        frame.add(num2);
        frame.add(getNum2);
        frame.add(sum);
        frame.add(home);
        frame.add(result);
        sum.addActionListener(this);
        home.addActionListener(this);
    }
    public void openCounter(){
        this.counternum=0;
        resultcount.setText("");
        frame.add(resultcount);
        frame.add(count);
        frame.add(home);
        home.addActionListener(this);
        count.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==counter){
            frame.removeAll();
            this.openCounter();
        }
        else if(e.getSource()==calculator){
            frame.removeAll();
            this.opencalculator();
        }
        else if(e.getSource()==home){
            frame.removeAll();
            this.openApp();
        }
        else if(e.getSource()==count){
            counternum++;
            resultcount.setText(counternum+"");
        }
        else if(e.getSource()==sum){
            int num1a=Integer.parseInt(getNum1.getText());
            int num2a=Integer.parseInt(getNum2.getText());
            int sumhere=num1a+num2a;
            result.setText("result = "+sumhere);  
        }
    }
    public void windowClosing(WindowEvent e){
        System.exit(1);
    }
}
public class AWT_multiPage_API{
    public static void main(String[] args) throws Exception{
       App2 myApp=new App2();
       myApp.openApp();
    }
}
