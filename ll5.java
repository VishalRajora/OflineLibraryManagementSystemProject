//update book
	import java.sql.*;
	import javax.swing.*;
	import java.awt.event.*;
	import java.util.*;
	import java.awt.*;
public class ll5 implements ActionListener
	{
		JLabel l,l1;
		JFrame f;
		JTextField t, t1;
		JButton b,b1;
	 ll5(String s10)
	{
	JFrame f=new JFrame("my frame");
	f.setVisible(true);
	f.setSize(1378,768);
	f.setLayout(null);

	
		Font f1=new Font("Serif",Font.BOLD,20);
	//set the image
			  ImageIcon icon = new ImageIcon("ll5.jpg"); 
		      JLabel l4 = new JLabel();
		     l4.setIcon(icon);
			 l4.setSize(1366,768);
		     f.add(l4);		
	  //set panel for login
			  JPanel p=new JPanel(); 
				p.setLayout(null);
				 p.setBackground(new Color(0,0,0,50));
			     p.setBounds(450,270,400,200);    
		           l4.add(p);
				   
	JLabel l=new JLabel("Book ID");
	p.add(l);
	l.setForeground(Color.WHITE);
	l.setBounds(70,50,100,30);

	t=new JTextField();
	t.setBounds(220,50,130,20);
	p.add(t);

	JLabel l1=new JLabel("Enter new Book Name");
	l1.setForeground(Color.WHITE);
	p.add(l1);
	l1.setBounds(70,100,150,20);

	t1=new JTextField();
	t1.setBounds(220,100,130,20);
	p.add(t1);

	
	b=new JButton("Submit");
	p.add(b);
	b.setBounds(250,150,100,20);
	b.addActionListener(this);
	
	b1=new JButton("Back");
	p.add(b1);
	b1.setBounds(160,150,100,20);
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
		int i1=Integer.parseInt(s);

		String s1=t1.getText();
		try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
	Statement stat = con.createStatement();
	stat.executeUpdate("update book set BookName='"+s1+"' where BookID='"+s+"'");   
	JOptionPane.showMessageDialog(null,"Updated");
	}
	catch(Exception e)
	{
		System.out.println(e);
	//JOptionPane.showMessageDialog(null,"invalid");
	}
	t.setText("");
	t1.setText("");
	}
	 //  f.dispose();
	}
public static void main(String[] args)
{
	ll5 ll=new ll5("abc");
}
}
