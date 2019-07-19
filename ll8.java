//return book
import java.sql.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.border.LineBorder;

class ll8 implements ActionListener
{
	JLabel l,l1,l2,l3,l4,l5;
	JFrame f;
   JTextField t, t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
	JButton b,b1,b2;


 ll8(String s13)
{
JFrame f=new JFrame("my frame");
f.setVisible(true);
f.setSize(1366,768);
f.setLayout(null);

Font f1=new Font("Serif",Font.BOLD,40);
Font f2=new Font("Serif",Font.BOLD,15);

ImageIcon i=new ImageIcon("ll7.jpg");
l5=new JLabel();
f.add(l5);
l5.setIcon(i);
l5.setSize(1366,768);

JPanel p=new JPanel();
p.setBounds(80,70,1200,300);
p.setBackground(new Color(0,0,0,10));
p.setLayout(null);
p.setBorder(new TitledBorder(new LineBorder(Color.black, 2) ,"Issue Information"));
l5.add(p);


l1=new JLabel("Student ID");
p.add(l1);
l1.setFont(f2);
l1.setBounds(25,30,160,30);

t=new JTextField();
t.setBounds(160,30,200,30);
p.add(t);

l2=new JLabel("Student Name");
p.add(l2);
l2.setFont(f2);
l2.setBounds(420,30,160,30);

t1=new JTextField();
t1.setBounds(550,30,200,30);
p.add(t1);

l3=new JLabel("Course");
p.add(l3);
l3.setFont(f2);
l3.setBounds(800,30,160,30);

t2=new JTextField();
t2.setBounds(900,30,200,30);
p.add(t2);

l4=new JLabel("year and sem");
p.add(l4);
l4.setFont(f2);
l4.setBounds(25,100,160,30);

t3=new JTextField();
t3.setBounds(160,100,200,30);
p.add(t3);

l1=new JLabel("Book ID");
p.add(l1);
l1.setFont(f2);
l1.setBounds(420,100,160,30);

t4=new JTextField();
t4.setBounds(550,100,200,30);
p.add(t4);

l2=new JLabel("Book Name");
p.add(l2);
l2.setFont(f2);
l2.setBounds(800,100,160,30);

t5=new JTextField();
t5.setBounds(900,100,200,30);
p.add(t5);

l3=new JLabel("Author name");
p.add(l3);
l3.setFont(f2);
l3.setBounds(25,170,160,30);

t6=new JTextField();
t6.setBounds(160,170,200,30);
p.add(t6);

l4=new JLabel("Total Book Quantity");
p.add(l4);
l4.setFont(f2);
l4.setBounds(400,170,160,30);

t7=new JTextField();
t7.setBounds(550,170,200,30);
p.add(t7);

l1=new JLabel("Issue Date");
p.add(l1);
l1.setFont(f2);
l1.setBounds(800,170,160,30);

t8=new JTextField();
t8.setBounds(900,170,200,30);
p.add(t8);

l2=new JLabel("Return Date");
p.add(l2);
l2.setFont(f2);
l2.setBounds(25,240,160,30);

t9=new JTextField();
t9.setBounds(160,240,200,30);
p.add(t9);

l3=new JLabel("Quantity");
p.add(l3);
l3.setFont(f2);
l3.setBounds(400,240,160,30);

t10=new JTextField();
t10.setBounds(550,240,200,30);
p.add(t10);

b=new JButton("Search");
p.add(b);
b.setBounds(900,240,150,30);
b.addActionListener(this);

JPanel p1=new JPanel();
p1.setBounds(80,400,1200,100);
p1.setBackground(new Color(0,0,0,10));
p1.setLayout(null);
p1.setBorder(new TitledBorder(new LineBorder(Color.black, 2) ,"Return"));
l5.add(p1);

l2=new JLabel("fine");
p1.add(l2);
l2.setFont(f2);
l2.setBounds(25,25,160,30);

t11=new JTextField();
t11.setBounds(130,25,200,30);
p1.add(t11);


b1=new JButton("Return");
p1.add(b1);
b1.setBounds(900,25,150,30);
b1.addActionListener(this);

b2=new JButton("Back");
p1.add(b2);
b2.setBounds(700,25,150,30);
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
		 String s4=t4.getText();
			try
			{
				//Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
				Statement stm=con.createStatement();
			    stm.executeUpdate("delete from issue where StudentID='"+str+"' and bookid='"+s4+"'");
			   // JOptionPane.showMessageDialog(null,"deleted");
			    	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	 }

 if(ae.getSource()==b)
 {
	 String str=t.getText();
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
			Statement stm=con.createStatement();
		    ResultSet rs=stm.executeQuery("select*from issue where StudentID='"+str+"'");
		    //JOptionPane.showMessageDialog(null,"success");
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
		    	String str5=rs.getString(5);
		    	t4.setText(str5);
		    	String str6=rs.getString(6);
		    	t5.setText(str6);
		    	String str7=rs.getString(7);
		    	t6.setText(str7);
		    	String str8=rs.getString(8);
		    	t7.setText(str8);
		    	String str9=rs.getString(9);
		    	t8.setText(str9);
		    	String str10=rs.getString(10);
		    	t9.setText(str10);
		    	String str11=rs.getString(11);
		    	t10.setText(str11);
		    }
		    	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
 }
 if(ae.getSource()==b1)
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
   //int i2=Integer.parseInt(s9);
   String s10=t10.getText();
   int i1=Integer.parseInt(s10);
   String s11=t11.getText();
   int i3=Integer.parseInt(s11);
   //String s12=t12.getText();
   //int i5=Integer.parseInt(s12);
	try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
Statement stat = con.createStatement();
stat.executeUpdate("insert into returnbook values('"+s+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"')");   
JOptionPane.showMessageDialog(null,"Book Return");


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
 qissue=qissue+1;
 sissue=String.valueOf(qissue);
 
 stat=con.createStatement();
 System.out.println(sissue);
 stat.executeUpdate("update book set quantity='"+sissue+"' where bookid='"+s4+"'");
 System.out.println("..............."+sissue);
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
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
t10.setText("");
t11.setText("");
} 
f.dispose();
}
 public static void main(String[] args)
{
ll8 l=new ll8("abc");
}
}
