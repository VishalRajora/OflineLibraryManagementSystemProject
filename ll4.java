//delete book
import javax.swing.*;
 import java.awt.event.*;
 import java.sql.*;
 import java.awt.*;

public class ll4 implements ActionListener
{
 JFrame f;
 JLabel l,l1;
 JButton b,b1;
 JTextField t;
ll4(String s9) 
{
	
	f=new JFrame("Delete");
	f.setVisible(true);
	f.setLayout(null);
	f.setSize(1366,768);
	Font f1=new Font("Serif",Font.BOLD,20);
	
	//set the image
			  ImageIcon icon = new ImageIcon("ll5.jpg"); 
		      JLabel l3 = new JLabel();
		     l3.setIcon(icon);
			 l3.setSize(1366,768);
		     f.add(l3);		
	  //set panel for login
			  JPanel p=new JPanel(); 
				p.setLayout(null);
				 p.setBackground(new Color(0,0,0,50));
			     p.setBounds(450,270,400,200);    
		           l3.add(p);
	
	l=new JLabel("Enter the ID");
	p.add(l);
	l.setFont(f1);
	l.setBounds(130,10,200,100);
	
	t=new JTextField();
	p.add(t);
	t.setBounds(90,80,200,30);
	
	b=new JButton("Delete");
	p.add(b);
	b.setBounds(170,130,100,30);
    b.addActionListener(this);
	
	b1=new JButton("Back");
	p.add(b1);
	b1.setBounds(70,130,100,30);
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
	
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
	Statement stm=con.createStatement();
	System.out.println("b");
	stm.executeUpdate("delete from book where BookID='"+s+"'");
	JOptionPane.showMessageDialog(null,"Delete");
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,"invalid id");
	}
	t.setText("");
	}
	//f.dispose();
}
public static void main(String[] args)
{
ll4 l=new ll4("abc");
}

}