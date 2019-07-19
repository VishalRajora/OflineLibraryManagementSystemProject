//signup for librarian
	import java.awt.*;
	import javax.swing.*;
	import java.util.*;
	import java.awt.event.*;
	import java.sql.*;
 class ll  implements ActionListener
		{
			JLabel l,l1,l2,l3,l4,l5,l6,l7;
			JFrame f;
			JTextField t, t1,t2,t3,t4,t5;
			JButton b;
		 ll(String s7)
		{
		JFrame f=new JFrame("my frame");
		f.setVisible(true);
		f.setSize(1366,768);
		f.setLayout(null);
		
			Font f1=new Font("Serif",Font.BOLD,20);
			
			Font f2=new Font("Serif",Font.BOLD,30);
	//set the image
			  ImageIcon icon = new ImageIcon("ll.jpg"); 
		      JLabel l = new JLabel();
		     l.setIcon(icon);
			 l.setSize(1366,768);
		     f.add(l);		
	  //set panel for login
			  JPanel p=new JPanel(); 
				p.setLayout(null);
				 p.setBackground(new Color(0,0,0,50));
			     p.setBounds(100,90,500,500);    
		           l.add(p);
	
	 JLabel l7=new JLabel("Signup For Login");
		l7.setForeground(Color.WHITE);
		l.add(l7);
		l7.setFont(f2);
		l7.setBounds(170,20,250,80);	

	 JLabel l1=new JLabel("Your ID");
		l1.setForeground(Color.WHITE);
		p.add(l1);
		l1.setFont(f1);
		l1.setBounds(20,30,160,30);

		t=new JTextField();
		t.setBounds(190,30,150,30);
		p.add(t);

		JLabel l2=new JLabel("Enter Your Name");
		l2.setForeground(Color.WHITE);
		l2.setFont(f1);
		p.add(l2);
		l2.setBounds(20,100,160,20);
		
		t4=new JTextField();
		p.add(t4);
		t4.setBounds(190,310,150,30);

		JLabel l3=new JLabel("Email");
		l3.setForeground(Color.WHITE);
		l3.setFont(f1);
		p.add(l3);
		l3.setBounds(20,170,160,20);

		t1=new JTextField();
		t1.setBounds(190,100,150,30);
		p.add(t1);
		//in above codding it show a text field//

		JLabel l4=new JLabel("Password");
		l4.setForeground(Color.WHITE);
		l4.setFont(f1);
		l4.setBounds(20,240,160,20);
		p.add(l4);

		t2=new JTextField();
		t2.setBounds(190,170,150,30);
		p.add(t2);

		JLabel l5=new JLabel("Address");
		l5.setForeground(Color.WHITE);
		l5.setFont(f1);
		p.add(l5);
		l5.setBounds(20,310,160,20);

		t3=new JTextField();
		p.add(t3);
		t3.setBounds(190,240,150,30);

		JLabel l6=new JLabel("Contact");
		l6.setForeground(Color.WHITE);
		l6.setFont(f1);
		p.add(l6);
		l6.setBounds(20,380,160,20);

		t5=new JTextField();
		p.add(t5);
		t5.setBounds(190,380,150,30);

		b=new JButton("Submit");
		p.add(b);
		b.setBounds(120,450,130,30);
		b.addActionListener(this);

		}
		public void actionPerformed(ActionEvent ae)
		{
		   if(ae.getSource()==b)
		{
			String s=t.getText();
			int i=Integer.parseInt(s);
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			String s4=t4.getText();
	         String s5=t5.getText();
			int i1=Integer.parseInt(s5);
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
				System.out.println(e);
				//JOptionPane.showMessageDialog(null,"invalid");
			}
			t.setText("");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
		}
			}
			
		public static void main(String[] arg)
		{
			aa a =new aa();
		}
	}