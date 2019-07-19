
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;
class aa2 implements ActionListener
	{
	JFrame f;
	JLabel l;
	JButton b,b1,b2,b3;
	aa2(String s)
	{		  
	f=new JFrame("server");
	f.setVisible(true);
	f.setSize(1366,768);
	f.setLayout(null);
	 
	

	//font
	Font f1=new Font("Serif",Font.BOLD,40);

//set the image
		  ImageIcon icon = new ImageIcon("aa2.jpeg"); 
	    JLabel l = new JLabel();
	     l.setIcon(icon);
		 l.setSize(1366,768);
	     f.add(l);		
  //set panel for login
		  JPanel p=new JPanel(); 
			p.setLayout(null);
		     p.setBounds(100,100,300,300);    
		      p.setBackground(new Color(0,0,0,50));
	           l.add(p);		 
		      

	b=new JButton("Add Librarian");
	p.add(b);
	b.setBounds(50,50,150,30);
	b.addActionListener(this);

	b1=new JButton("Delete Librarian");
	p.add(b1);
	b1.setBounds(50,100,150,30);
	b1.addActionListener(this);

	b2=new JButton("view Librarian");
	p.add(b2);
	b2.setBounds(50,150,150,30);
	b2.addActionListener(this);

	b3=new JButton("Logout");
	p.add(b3);
	b3.setBounds(50,200,150,30);
	b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
		String s1=b.getText();
		new aa3(s1);
		}
		if(ae.getSource()==b1)
		{
			String s2=b3.getText();
			new aa5(s2);
		}
		if(ae.getSource()==b2)
		{
			String s3=b2.getText();
	        new aa4(s3);		
		}
		if(ae.getSource()==b3)
		{
			
			String slogout=b3.getText();
	        new aa1(slogout);
       			
		}
		f.dispose();
		
	}
	
	public static void main(String[] args)
	{
		aa2 a =new aa2("abc");
		
	}
	public void windowClosing(WindowEvent e)
 {  
    f.dispose();  
} 
	
	
	
	}
