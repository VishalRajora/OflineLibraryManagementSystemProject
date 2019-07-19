//add book
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class ll2 implements ActionListener
{
	JLabel l,l1,l2,l3;
	JFrame f;
	JTextField t, t1,t2,t3;
	JButton b,b1;
 ll2(String s6)
{
JFrame f=new JFrame("my frame");
f.setVisible(true);
f.setSize(1366,768);
f.setLayout(null);

   		Font f1=new Font("Serif",Font.BOLD,20);
	//set the image
			  ImageIcon icon = new ImageIcon("ll2.jpeg"); 
		      JLabel l4 = new JLabel();
		      l4.setIcon(icon);
			  l4.setSize(1366,768);
		      f.add(l4);		
	  //set panel for login
			  JPanel p=new JPanel(); 
				p.setLayout(null);
			     p.setBounds(100,100,450,400);
                p.setBackground(new Color(0,0,0,80));				 
		           l4.add(p);

JLabel l=new JLabel("Book ID");
p.add(l);
l.setForeground(Color.WHITE);
l.setBounds(50,30,100,30);
l.setFont(f1);

t=new JTextField();
t.setBounds(200,30,150,30);
p.add(t);

JLabel l1=new JLabel("Book Name");
p.add(l1);
l1.setForeground(Color.WHITE);
l1.setFont(f1);
l1.setBounds(50,100,150,20);

t1=new JTextField();
t1.setBounds(200,100,150,30);
p.add(t1);


JLabel l2=new JLabel("Author Name");
l2.setBounds(50,170,150,20);
l2.setForeground(Color.WHITE);
l2.setFont(f1);
p.add(l2);

t2=new JTextField();
t2.setBounds(200,170,150,30);
p.add(t2);

JLabel l3=new JLabel(" Book Quantity");
p.add(l3);
l3.setForeground(Color.WHITE);
l3.setFont(f1);
l3.setBounds(50,240,150,20);

t3=new JTextField();
p.add(t3);
t3.setBounds(200,240,150,30);

b=new JButton("Submit");
p.add(b);
b.setBounds(200,330,100,30);
b.setFont(f1);
b.addActionListener(this);

b1=new JButton("Back");
p.add(b1);
b1.setBounds(90,330,100,30);
b1.setFont(f1);
b1.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		String sback=b1.getText();
		new ll1(sback);
	}
   if(ae.getSource()==b)
{
	String s=t.getText();
	int i1=Integer.parseInt(s);

	String s1=t1.getText();
    String s2=t2.getText();
    String s3=t3.getText();
	int i=Integer.parseInt(s3);
	try
{
Class.forName("com.mysql.jdbc.Driver");//upload driver
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
Statement stat = con.createStatement();
stat.executeUpdate("insert into book values('"+s+"','"+s1+"','"+s2+"','"+s3+"')");   
JOptionPane.showMessageDialog(null,"successfully");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,"invalid");
}
t.setText("");
t1.setText("");
t2.setText("");
t3.setText("");
}
   //f.dispose();
}
public static void main(String[] args)
{
	ll2 ll=new ll2("abc");
}

}