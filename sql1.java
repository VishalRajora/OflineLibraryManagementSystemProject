import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;
class aa implements ActionListener
{
JFrame f;
JLabel l,l1,l2;
JTextField t,t1,t2;
JButton b;
aa()
{
f=new JFrame("student");
f.setSize(700,700);
f.setLayout(null);
f.setVisible(true);

l=new JLabel("Name");
f.add(l);
l.setBounds(100,100,40,40);

t=new JTextField();
f.add(t);
t.setBounds(150,100,100,40);

l1=new JLabel("Course");
f.add(l1);
l1.setBounds(100,200,40,40);

t1=new JTextField();
f.add(t1);
t1.setBounds(150,250,100,40);

l2=new JLabel("roll");
f.add(l2);
l2.setBounds(100,300,40,40);

t2=new JTextField();
f.add(t2);
t2.setBounds(150,350,100,40);

b=new JButton("Submit");
f.add(b);
b.setBounds(100,400,40,40);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b)
	{
		String s1=t.getText();
		String s2=t1.getText();
		String s3=t2.getText();
		try
		{
			class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql","root","");
			Statement st=con.createStatement();
			st.executeUpdate("insert into student values('"+s1+"','"+s2+"','"+s3+"')");
			JOptionPane.showMessageDialog(null,"Successfill");
		}
		catch(Exception e)
		{
				JOptionPane.showMessageDialog(null,"invalid");
			System.out.println(e);
		}
		t.setText("");
		t1.setText("");
		t2.setText("");
	}
}
public static void main(String[] args)
{
aa a=new aa();

}
}