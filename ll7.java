//issue books;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

class ll7 implements ActionListener
{
	JLabel l,l1,l2,l3,l4;
	JFrame f;
   JTextField t, t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b,b1,b2,b3;


 ll7(String s12)
{
JFrame f=new JFrame("my frame");
f.setVisible(true);
f.setSize(1366,768);
f.setLayout(null);

Font f1=new Font("Serif",Font.BOLD,40);
Font f2=new Font("Serif",Font.BOLD,15);

ImageIcon i=new ImageIcon("ll7.jpg");
JLabel l5=new JLabel();
l5.setIcon(i);
l5.setSize(1366,768);
f.add(l5);

JPanel p=new JPanel();
p.setBounds(230,100,800,185);
p.setBackground(new Color(0,0,0,10));
p.setLayout(null);
p.setBorder(new TitledBorder(new LineBorder(Color.black, 2) ,"Student Information"));
l5.add(p);


l1=new JLabel("Student ID");
p.add(l1);
l1.setForeground(Color.BLACK);
l1.setFont(f2);
l1.setBounds(25,30,160,30);

t=new JTextField();
t.setBounds(160,30,200,30);
p.add(t);

l2=new JLabel("Student Name");
p.add(l2);
l2.setForeground(Color.BLACK);
l2.setFont(f2);
l2.setBounds(420,20,160,30);

t1=new JTextField();
t1.setBounds(550,20,200,30);
p.add(t1);

l3=new JLabel("Course");
l3.setForeground(Color.BLACK);
p.add(l3);
l3.setFont(f2);
l3.setBounds(25,100,160,30);

t2=new JTextField();
t2.setBounds(160,100,200,30);
p.add(t2);

l4=new JLabel("year and sem");
l4.setForeground(Color.BLACK);
p.add(l4);
l4.setFont(f2);
l4.setBounds(420,100,160,30);

t3=new JTextField();
t3.setBounds(550,100,200,30);
p.add(t3);

b=new JButton("search");
p.add(b);
b.setBounds(100,150,100,20);
b.addActionListener(this);

JPanel p1=new JPanel();
p1.setBounds(230,290,800,180);
p1.setBackground(new Color(0,0,0,10));
p1.setLayout(null);
p1.setBorder(new TitledBorder(new LineBorder(Color.black, 2)  ,"Book Information"));
l5.add(p1);

l1=new JLabel("Book ID");
l1.setForeground(Color.BLACK);
p1.add(l1);
l1.setFont(f2);
l1.setBounds(25,30,160,30);

t4=new JTextField();
t4.setBounds(160,30,200,30);
p1.add(t4);

l2=new JLabel("Book Name");
l2.setForeground(Color.BLACK);
p1.add(l2);
l2.setFont(f2);
l2.setBounds(420,30,160,30);

t5=new JTextField();
t5.setBounds(550,30,200,30);
p1.add(t5);

l3=new JLabel("Author name");
p1.add(l3);
l3.setForeground(Color.BLACK);
l3.setFont(f2);
l3.setBounds(25,100,160,30);

t6=new JTextField();
t6.setBounds(160,100,200,30);
p1.add(t6);

l4=new JLabel("Total Book Quantity");
l4.setForeground(Color.BLACK);
p1.add(l4);
l4.setFont(f2);
l4.setBounds(400,100,160,30);

t7=new JTextField();
t7.setBounds(550,100,200,30);
p1.add(t7);

b1=new JButton("search");
p1.add(b1);
b1.setBounds(100,150,100,20);
b1.addActionListener(this);

JPanel p2=new JPanel();
p2.setBounds(230,480,800,160);
p2.setBackground(new Color(0,0,0,10));
p2.setLayout(null);
p2.setBorder(new TitledBorder(new LineBorder(Color.black, 2) ,"Issue"));
l5.add(p2);

java.util.Date d=new java.util.Date();
java.text.SimpleDateFormat ft = new java.text.SimpleDateFormat ("yyyy/MM/dd");
	  String ss=ft.format(d);
	  String[] sd=ss.split("/");

	  String sdate=sd[2];
	  int idate=Integer.parseInt(sdate);
	  String dat1=String.valueOf(idate+5);
	  String sdat1=sd[0]+"/"+sd[1]+"/"+dat1;

	  
	  

l1=new JLabel("Issue Date");
l1.setForeground(Color.BLACK);
p2.add(l1);
l1.setFont(f2);
l1.setBounds(25,30,160,30);

t8=new JTextField();
t8.setText(d.toString());
t8.setEditable(false);
t8.setBounds(160,30,200,30);
p2.add(t8);

l2=new JLabel("Return Date");
l2.setForeground(Color.BLACK);
p2.add(l2);
l2.setFont(f2);
l2.setBounds(420,30,160,30);

t9=new JTextField(sdat1);
t9.setEditable(false);
t9.setBounds(550,30,200,30);
p2.add(t9);

l3=new JLabel("Quantity");
l3.setForeground(Color.BLACK);
p2.add(l3);
l3.setFont(f2);
l3.setBounds(25,100,160,30);

t10=new JTextField();
t10.setBounds(160,100,200,30);
p2.add(t10);

b2=new JButton("Issue");
p2.add(b2);
b2.setBounds(530,100,130,30);
b2.addActionListener(this);

b3=new JButton("Back");
p2.add(b3);
b3.setBounds(400,100,130,30);
b3.addActionListener(this);
}
 public void actionPerformed(ActionEvent ae)
 {
	 if(ae.getSource()==b3)
	{
		String sback=b3.getText();
		new ll1(sback);
	}
    if(ae.getSource()==b2)
 {
 	String s=t.getText();
 	String s1=t1.getText();
     String s2=t2.getText();
     String s3=t3.getText();
     String s4=t4.getText();
     String s5=t5.getText();
     String s6=t6.getText();
     String s7=t7.getText();
     int i=Integer.parseInt(s7);
     String s8=t8.getText();
     //int i4=Integer.parseInt(s8);
     String s9=t9.getText();
     //int i3=Integer.parseInt(s9);
     String s10=t10.getText();
     int i1=Integer.parseInt(s10);
 	try
 {
 Class.forName("com.mysql.jdbc.Driver");//upload driver
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
 Statement stat = con.createStatement();
 stat.executeUpdate("insert into issue values('"+s+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"')");   
 JOptionPane.showMessageDialog(null,"issued");
 
 stat=con.createStatement();
 ResultSet rs=stat.executeQuery("select Quantity from book where  bookid='"+s4+"'");
 String sissue="";
 while(rs.next())
 {
	 System.out.println("hi");
	  sissue=rs.getString(1);
 
 	 System.out.println(sissue);
 }
 int qissue=Integer.parseInt(sissue);
 qissue=qissue-1;
 sissue=String.valueOf(qissue);
 
 stat=con.createStatement();
 System.out.println(sissue);
 stat.executeUpdate("update book set quantity='"+sissue+"' where bookid='"+s4+"'");
 System.out.println("..............."+sissue);
 }
 catch(Exception e)
 {
	 System.out.println(e);
 JOptionPane.showMessageDialog(null,"invalid");
 }
 
 t.setText("");
 t1.setText("");
 t2.setText("");
 t3.setText("");
 t4.setText("");
 t5.setText("");
 t6.setText("");
 t7.setText("");
 //t8.setText("");
 //t9.setText("");
 t10.setText("");
 }
 if(ae.getSource()==b)
 {
	 String str=t.getText();
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
			Statement stm=con.createStatement();
		    ResultSet rs=stm.executeQuery("select*from student where StudentID='"+str+"'");
		   // JOptionPane.showMessageDialog(null,"success");

          int ctr=0;
		   while(rs.next())
		    {
		    	String str1=rs.getString(1);
		    	t.setText(str1);
		    	String str2=rs.getString(2);
		    	t1.setText(str2);
		    	String str3=rs.getString(3);
		    	t2.setText(str3);
		    	String str4=rs.getString(4);
		    	t3.setText(str4);
		    }
			
		    		stm=con.createStatement();
					 rs=stm.executeQuery("select*from issue where StudentID='"+str+"'");
					 while(rs.next())
					 {
						 ctr++;
					 }
					 System.out.println("ctr............"+ctr);
					 if(ctr >=5)
					 {
						 
						 JOptionPane.showMessageDialog(null,"all ready 5 book issue");
						   t.setEditable(false);
	   t1.setEditable(false);
	   t2.setEditable(false);
	   t3.setEditable(false);
	   t4.setEditable(false);
	   t5.setEditable(false);
	   t6.setEditable(false);
	   t7.setEditable(false);
	   t8.setEditable(false);
	   t9.setEditable(false);
	   t10.setEditable(false);
					 }
       
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
 }
 if(ae.getSource()==b1)
 {
	 String str=t4.getText();
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
			Statement stm=con.createStatement();
		    ResultSet rs=stm.executeQuery("select*from book where BookID='"+str+"'");
		   //JOptionPane.showMessageDialog(null,"success");
		    while(rs.next())
		    {
		    	String str1=rs.getString(1);
		    	t4.setText(str1);
		    	String str2=rs.getString(2);
		    	t5.setText(str2);
		    	String str3=rs.getString(3);
		    	t6.setText(str3);
		    	String str4=rs.getString(4);
		    	t7.setText(str4);
		    }
		    	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
 }
 f.dispose();
 }

 
 }