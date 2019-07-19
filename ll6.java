//search book
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;

class ll6 implements ActionListener
{
	JFrame f;
	JLabel l,l1,l2,l3,l4,l7;
	JTextField t,t1,t2,t3;
	JButton b1,b2;
	
	ll6(String s11)
	{
	
		f=new JFrame("my");
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(1366,768);
		
		Font f1=new Font("Serif",Font.BOLD,20);
			Font f2=new Font("Serif",Font.BOLD,30);
			
			ImageIcon i=new ImageIcon("ll6.jpg");
			JLabel l7=new JLabel();
			f.add(l7);
			l7.setIcon(i);
			l7.setSize(1368,768);
		
		JPanel p=new JPanel();
		p.setLayout(null);
		p.setBackground(new Color(0,0,0,50));
		p.setBounds(450,180,400,400);
		l7.add(p);
	
		
		l4=new JLabel("Search Book");
		p.add(l4);
		l4.setBounds(100,5,200,100);
		l4.setFont(f2);
		
		l=new JLabel("Book ID");
		p.add(l);
		l.setBounds(50,100,100,40);
		l.setFont(f1);
		
		l1=new JLabel("Book Name");
		p.add(l1);
		l1.setBounds(50,160,150,40);
		l1.setFont(f1);
		
		l2=new JLabel("Author Name");
		p.add(l2);
		l2.setBounds(50,220,150,40);
		l2.setFont(f1);
		
		l3=new JLabel("quantity");
		p.add(l3);
		l3.setBounds(50,280,150,40);
		l3.setFont(f1);
		
		t=new JTextField();
		p.add(t);
		t.setBounds(170,100,150,30);
		
		t1=new JTextField();
		p.add(t1);
		t1.setBounds(170,160,150,30);
		
		t2=new JTextField();
		p.add(t2);
		t2.setBounds(170,220,150,30);
		
		t3=new JTextField();
		p.add(t3);
		t3.setBounds(170,280,150,30);
		
		b1=new JButton("Search");
		b1.setBounds(200,350,100,30);
		p.add(b1);
		b1.setFont(f1);
		b1.addActionListener(this);
		
		b2=new JButton("back");
		b2.setBounds(100,350,100,30);
		p.add(b2);
		b2.setFont(f1);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==b2)
	{
		String sback=b2.getText();
		new ll1(sback);
	}
		   if(ae.getSource()==b1)
		   {
		   	String str=t.getText();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
			Statement stm=con.createStatement();
		    ResultSet rs=stm.executeQuery("select*from book where BookID='"+str+"'");
		    JOptionPane.showMessageDialog(null,"success");
		    while(rs.next())
		    {
		    	String s=rs.getString(1);
		    	t.setText(s);
		    	String s1=rs.getString(2);
		    	t1.setText(s1);
		    	String s2=rs.getString(3);
		    	t2.setText(s2);
		    	String s3=rs.getString(4);
		    	t3.setText(s3);
		    }
		    	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		//f.dispose();
	}
	
}