//librarian login
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

class ll0 implements ActionListener
{
JFrame f;
JLabel l,l1,l2,l3,l4;
JTextField t;
JPasswordField t1;
JButton b,b1,b2;

ll0(String s4)
{	  
f=new JFrame("server");
f.setVisible(true);
f.setSize(1366,768);
f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//font
Font f1=new Font("Serif",Font.BOLD,25);

Font f2=new Font("Serif",Font.BOLD,20);

Font f3=new Font("Serif",Font.BOLD,15);

	//set the image
	  ImageIcon icon = new ImageIcon("ll0.jpg"); 
      JLabel l2 = new JLabel();
      l2.setIcon(icon);
	  l2.setSize(1366,768);
      f.add(l2);
	 
	  //set panel for login
	    JPanel p=new JPanel(); 
		p.setLayout(null);
	    p.setBounds(500,200,450,450);    
	    p.setBackground(new Color(40,40,40,80));
        l2.add(p);		  
	      
l3=new JLabel("Librarian Login");
p.add(l3);
l3.setBounds(120,40,250,50);
l3.setForeground(Color.WHITE);
l3.setFont(f1);



l=new JLabel("Email");
l.setForeground(Color.WHITE);
l.setFont(f2);
p.add(l);
l.setBounds(50,100,150,30);


t=new JTextField();
p.add(t);
t.setBounds(50,125,250,30);//(x,y,w,h)
t.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));

l1=new JLabel("Password");
l1.setForeground(Color.WHITE);
l1.setFont(f2);
p.add(l1);
l1.setBounds(50,175,150,30);

t1=new JPasswordField();
p.add(t1);
t1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
t1.setBounds(50,200,250,30);

b=new JButton("Login");
p.add(b);
b.setBounds(150,270,100,30);
b.addActionListener(this);

b1=new JButton("Back");
p.add(b1);
b1.setBounds(25,270,100,30);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		String sback=b1.getText();
		new aa(sback);
	}
	String s1=t.getText();
	String s2= t1.getText();
	if(s1.equals("") || s2.equals(""))
	{
		JOptionPane.showMessageDialog(null,"Please Enter your Email and Password");	
		return;
	}
	try
	{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarian","root","");
Statement stat = con.createStatement();
ResultSet rs =stat.executeQuery("Select libpassword from lib where libemail='"+s1+"'");
String get_password="";//this is for database password
while(rs.next())
{
get_password=rs.getString(1);
}


if(get_password.equals(s2))
{
	JOptionPane.showMessageDialog(null,"Login successfully");
	 String s5=b.getText();
	  new ll1(s5);
}

else
{
	JOptionPane.showMessageDialog(null,"Incorrect Email and Password");
}

}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,"invalid");
}
	f.dispose();
}
public static void main(String[] args)
{
	aa a =new aa("abc");
}
}