
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

class aa implements ActionListener
	{
	JFrame f;
	JLabel l;
	JButton b,b1;
   aa(String sback)
	{ 
	f=new JFrame("server");
	f.setVisible(true);
	f.setSize(1366,768);
	f.setLayout(null);
	

	//font
	Font f1=new Font("Serif",Font.BOLD,15);


		//set the image
		  ImageIcon icon = new ImageIcon("login.jpg"); 
	    JLabel l = new JLabel();
	     l.setIcon(icon);
		 //l.setForeground(new Color(0,100,0,50));
		 l.setSize(1366,768);
	     f.add(l);
		 
		  //set panel for login
		   JPanel p=new JPanel(); 
			p.setLayout(null);
		     p.setBounds(500,250,300,200);    
		      p.setBackground(new Color(40,40,40,40));
	           l.add(p);		  
		      

	b=new JButton("Admin Login");
	p.add(b);
	b.setBounds(80,50,150,40);
	b.setFont(f1);
	b.addActionListener(this);

	b1=new JButton("Librarian Login");
	p.add(b1);
	b1.setBounds(80,110,150,40);
    b1.setFont(f1);
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
		String s0=b.getText();
		 new aa1(s0);
		}
		if(ae.getSource()==b1)
		{
			String s4=b1.getText();
	         new ll0(s4);
	}
		//f.dispose();
	}
	public static void main(String[] args)
	{
		aa a =new aa("abc");
		
	}
	}
