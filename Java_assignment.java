import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
interface Santhosh{
    public void open();
}
class App extends WindowAdapter implements ActionListener {
    Frame frame;
    Button countup=new Button("up");
    Button countdown=new Button("down");
    Button reset=new Button("reset");
    Label display=new Label("count = 0");
    int counter=0;
    public void openApp(){
        frame=new Frame("santhosh app");
        frame.setSize(300,300);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.add(display,BorderLayout.CENTER);
        frame.add(countup,BorderLayout.WEST);
        frame.add(countdown,BorderLayout.EAST);
        frame.add(reset,BorderLayout.NORTH);
        reset.addActionListener(this);
        countup.addActionListener(this);
        countdown.addActionListener(this);
        frame.addWindowListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==countup){
            counter++;
            display.setText("count = "+counter);
        }
        else if(e.getSource()==countdown){
            if(counter==0){
                return ;
            }
            else{
                counter--;
                display.setText("count = "+counter);
            }
        }
        else if(e.getSource()==reset){
            counter=0;
            display.setText("count = "+counter);
        }
    }
    public void windowClosing(WindowEvent e){
        System.exit(1);
    }
}
class temporary{
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Expecting to arguments received one");
            return ;
        }
        else{
            for(String i :args){
                System.out.println(i);
            }
        }
        FileInputStream source=null;
        FileOutputStream destination=null;
        try{
            source=new FileInputStream (args[0]);
            destination=new FileOutputStream(args[1]);
            int line;
            while((line=source.read())!=-1){
                if(line!=-1)destination.write(line);
            }
        }
        catch(Exception e){
            System.out.println(e);
            try{
                source.close();
                destination.close();
            }
            catch(Exception e1){
                System.out.println(e1);
            }
        }
    }
}
