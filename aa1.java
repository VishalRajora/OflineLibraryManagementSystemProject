import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class aa1 implements ActionListener
	{
	JFrame f;
	JLabel l,l1,l2,l3,l4;
	JTextField t;
	JPasswordField t1;
	JButton b,b1,b2,b3;
	aa1(String s0)
	{
			  
	f=new JFrame("Admin server");
	f.setVisible(true);
	f.setSize(1366,768);
	f.setLayout(null);
	

	//font
	Font f1=new Font("Serif",Font.BOLD,40);

	Font f2=new Font("Serif",Font.BOLD,20);

	Font f3=new Font("Serif",Font.BOLD,15);

		//set the image
		  ImageIcon icon = new ImageIcon("aa1.jpg"); 
	    JLabel l2 = new JLabel();
	     l2.setIcon(icon); 
		 l2.setSize(1366,768);
	     f.add(l2);
		 
		  //set panel for login
		   JPanel p=new JPanel(); 
			p.setLayout(null);
		     p.setBounds(480,180,450,450);    
		      p.setBackground(new Color(40,40,40,40));
	           l2.add(p);		  
		      
	l3=new JLabel("Admin Login");
	p.add(l3);
	l3.setBounds(120,40,250,50);
	l3.setForeground(Color.BLACK);
	l3.setFont(f1);



	l=new JLabel("Email");
	l.setForeground(Color.BLACK);
	l.setFont(f2);
	p.add(l);
	l.setBounds(70,130,150,30);


	t=new JTextField();
	p.add(t);
	t.setBounds(70,155,250,30);//(x,y,w,h)

	l1=new JLabel("Password");
	l1.setForeground(Color.BLACK);
	l1.setFont(f2);
	p.add(l1);
	l1.setBounds(70,205,150,30);

	t1=new JPasswordField();
	p.add(t1);
	t1.setBounds(70,230,250,30);

	b=new JButton("Login");
	p.add(b);
	b.setBounds(180,285,100,30);
	b.addActionListener(this);
	
	b1=new JButton("Back");
	p.add(b1);
	b1.setBounds(60,285,100,30);
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=t.getText();
		String s2= t1.getText();
		if(ae.getSource()==b1)
		{
			String sback=b1.getText();
	        new aa(sback);
		}
		if(s1.equals("") || s2.equals(""))
		{
			JOptionPane.showMessageDialog(null,"Please Enter your ID and Password");
			return;
		}
		
		try
		{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","");
	Statement stat = con.createStatement();
	ResultSet rs =stat.executeQuery("Select password from adminlogin where id='"+s1+"'");
	String get_password="";
	while(rs.next())
	{
	get_password=rs.getString(1);
	}
	if(get_password.equals(s2))
			{
		JOptionPane.showMessageDialog(null,"Login Successfully");
		String s=b.getText();
		new aa2(s);
			}
	else
	{
		JOptionPane.showMessageDialog(null,"Incorrect ID and Password");
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
		aa1 a =new aa1("abc");
	}
	}
