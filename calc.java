import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class calculator extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,c;
JTextField t1,t3;
String s0,s1,s2;
    calculator()
    {
        
        super("Calculator");
        s0=s1=s2="";
        setSize(300,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
         t1=new JTextField(30);
        
        JLabel l3=new JLabel("Result:  ");
         t3=new JTextField(20);

         b1=new JButton("0");
         b2=new JButton("1");
        b3=new JButton("2");
         b4=new JButton("3");
         b5=new JButton("4");
         b6=new JButton("5");
        b7=new JButton("6");
         b8=new JButton("7");
         b9=new JButton("8");
         b10=new JButton("9");
         b11=new JButton("+");
        b12=new JButton("-");
        b13=new JButton("x");
        b14=new JButton("%");
       b15=new JButton("=");
       c=new JButton("CLEAR");
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
       

        
        add(t1);
       
        
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);

        add(p2);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        add(b15);
        add(p1);
       p1.add(l3);
        p1.add(t3);
        add(c);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        t1.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        c.addActionListener(this);
        t3.addActionListener(this);
       
        t1.addActionListener(this);
        t1.setEditable(false);
       
        t3.setEditable(false);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        int result=0;
       String s=e.getActionCommand();
       if(s.charAt(0)>='0'&&s.charAt(0)<='9')
       {
         if(!s1.equals(""))
         s2=s2+s;
         else
         s0=s0+s;
         t1.setText(s0+s1+s2);
       }
       else if(s.charAt(0)=='=')
       {
        
        if(s1=="+")
        result=Integer.parseInt(s0)+Integer.parseInt(s2);
        else if(s1=="-")
        result=Integer.parseInt(s0)-Integer.parseInt(s2);
        else if(s1=="x")
        result=Integer.parseInt(s0)*Integer.parseInt(s2);
        else if(s1=="%")
        result=Integer.parseInt(s0)%Integer.parseInt(s2);
        t3.setText(""+result);

       }
       else if(s1.equals(""))
       {
        s1=s;
        t1.setText(s0+s1+s2);
       }
       if(e.getSource()==c)
       {
        s1=s2=s0="";
        t1.setText(s0+s1+s2);
        t3.setText("");
       }
     
        
    }

}

public class calc {
     public static void main(String[] args) {
       calculator c=new calculator(); 
    }
}
