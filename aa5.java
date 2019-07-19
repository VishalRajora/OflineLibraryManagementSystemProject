//delete librarian 
import javax.swing.*;
 import java.awt.event.*;
 import java.sql.*;
 import java.awt.*;
 import java.awt.*;

public class aa5 implements ActionListener
{
 JFrame f;
 JLabel l,l1,l2;
 JButton b,b1;
 JTextField t;
aa5(String s2) 
{
	Font f1=new Font("Serif",Font.BOLD,20);
	f=new JFrame("Delete");
	f.setVisible(true);
	f.setLayout(null);
	f.setSize(1366,768);
	// f.addWindowListener(this); 
	
	ImageIcon img=new ImageIcon("aa4.jpg");
	l1=new JLabel();
	l1.setIcon(img);
	f.add(l1);
	l1.setSize(1366,768);
	
	JPanel p=new JPanel();
	p.setBounds(450,230,400,200);
	p.setBackground(new Color(0,0,0,80));
	l1.add(p);
	p.setLayout(null);
	
	l=new JLabel("Enter the ID");
	p.add(l);
	l.setForeground(Color.WHITE);
	l.setFont(f1);
	l.setBounds(130,10,200,100);
	
	t=new JTextField();
	p.add(t);
	t.setBounds(80,80,220,30);
	
	b=new JButton("Delete");
	p.add(b);
	b.setBounds(170,130,100,30);
	b.addActionListener(this);
	
	b1=new JButton("Back");
	p.add(b1);
	b1.setBounds(50,130,100,30);
	b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
		{
			String sback=b1.getText();
	        new aa2(sback);
		}
	if(ae.getSource()==b)
	{
		String s=t.getText();
	
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarian","root","");
	Statement stm=con.createStatement();
	stm.executeUpdate("delete from lib where ID='"+s+"'");
	JOptionPane.showMessageDialog(null,"Delete ID");
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,"Invalid ID");
	}
	t.setText("");
	}
	
	f.dispose();
	
}
 public static void main(String[] args)
 {
	 aa5 aa=new aa5("abc");
 }

}
