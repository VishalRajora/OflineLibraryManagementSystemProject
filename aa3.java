//add
//insert Librarian details
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

	 public class aa3  implements ActionListener
	{
		JLabel l,l1,l2,l3,l4,l5,l6;
		JFrame f;
		JTextField t, t1,t2,t3,t4,t5;
		JButton b,b1;
	 aa3(String s1)
	{
	JFrame f=new JFrame("my frame");
	f.setVisible(true);
	f.setSize(1366,768);
	f.setLayout(null);
	
		Font f1=new Font("Serif",Font.BOLD,20);
//set the image
		  ImageIcon icon = new ImageIcon("aa3.jpeg"); 
	      JLabel l = new JLabel();
	     l.setIcon(icon);
		 l.setSize(1366,768);
	     f.add(l);		
  //set panel for login
		  JPanel p=new JPanel(); 
			p.setLayout(null);
			 p.setBackground(new Color(0,0,0,50));
		     p.setBounds(800,100,450,600);    
	           l.add(p);
			   
			   

 JLabel l1=new JLabel("Librarian ID");
	l1.setForeground(Color.orange);
	p.add(l1);
	l1.setFont(f1);
	l1.setBounds(10,30,160,30);

	t=new JTextField();
	t.setBounds(190,30,130,30);
	p.add(t);

	JLabel l2=new JLabel("Librarian Name");
	l2.setForeground(Color.orange);
	l2.setFont(f1);
	p.add(l2);
	l2.setBounds(10,100,160,20);
	
	t4=new JTextField();
	p.add(t4);
	t4.setBounds(190,310,130,30);

	JLabel l3=new JLabel("Librarian Email");
	l3.setForeground(Color.orange);
	l3.setFont(f1);
	p.add(l3);
	l3.setBounds(10,170,160,20);

	t1=new JTextField();
	t1.setBounds(190,100,130,30);
	p.add(t1);


	JLabel l4=new JLabel("Librarian Password");
	l4.setForeground(Color.orange);
	l4.setFont(f1);
	l4.setBounds(10,240,180,20);
	p.add(l4);

	t2=new JTextField();
	t2.setBounds(190,170,130,30);
	p.add(t2);

	JLabel l5=new JLabel("Librarian Address");
	l5.setForeground(Color.orange);
	l5.setFont(f1);
	p.add(l5);
	l5.setBounds(10,310,160,20);

	t3=new JTextField();
	p.add(t3);
	t3.setBounds(190,240,130,30);

	JLabel l6=new JLabel("Librarian Contact");
	l6.setForeground(Color.orange);
	l6.setFont(f1);
	p.add(l6);
	l6.setBounds(10,380,160,20);

	t5=new JTextField();
	p.add(t5);
	t5.setBounds(190,380,130,30);

	b=new JButton("Submit");
	p.add(b);
	b.setBounds(220,450,130,30);
	b.addActionListener(this);
	
	b1=new JButton("BacK");
	p.add(b1);
	b1.setBounds(70,450,130,30);
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
		int i=Integer.parseInt(s);
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
        String s5=t5.getText();
		//int i1=Integer.parseInt(s5);
	
	 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarian","root","");
			Statement stm=con.createStatement();
			stm.executeUpdate("insert into lib values('"+s+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')"); 
			JOptionPane.showMessageDialog(null,"Successfully");
		}
		catch(Exception e)
		{
			
			JOptionPane.showMessageDialog(null,"invalid");
		}
		t.setText("");
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
	}
	f.dispose();
		}
		
	
	}
