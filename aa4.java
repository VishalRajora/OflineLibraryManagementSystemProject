
//view librarian details
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.sql.*;
 class aa4 
	{
	JFrame f;
	JLabel l,l1;
	JTable t;
	JScrollPane s;
	DefaultTableModel m;//we use this for dymaaclly row and column add krne k liy mens khud row and colmn add krega acording to your database
	aa4(String s3)
	{	  
	f=new JFrame("server");
	f.setVisible(true);
	f.setSize(1366,768);
	f.setLayout(null);
	
	//font
	Font f1=new Font("Serif",Font.BOLD,40);


		//set the image
		  ImageIcon icon = new ImageIcon("aa4.jpg"); 
	    JLabel l = new JLabel();
	     l.setIcon(icon);
		 l.setSize(1366,768);
	     f.add(l);
		 
		l1=new JLabel("Details of librarian");
	    l.add(l1);
		l1.setBounds(500,5,500,100);
		l1.setFont(f1);
		
		
  m=new DefaultTableModel(0,0);
  
		t=new JTable(m);
		String[] column= {"Librarian ID","Librarian Name","Librarian Email","Librarian Password","Address","Contact"};
		m.setColumnIdentifiers(column);//for chnge the coloumn name in tabel
		s=new JScrollPane(t);//if hmari window full ho jati h to left se ye scroll krne k liy ek thing deta h
		s.setBounds(100,100,1100,1000);
				l.add(s);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarian","root","");
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery("select*from lib;"); 
					while(rs.next())//jb tk hmare database m row h..ye jb tk chlga..
					{
						String str=rs.getString(1);//database mai phli row ka phla coloumn data
						String str1=rs.getString(2);//database mai phli row ka 2nd coloumn ka data
						String str3=rs.getString(3);
						String str4=rs.getString(4);
						String str5=rs.getString(5);
						String str6=rs.getString(6);
						m.addRow(new Object[] {str,str1,str3,str4,str5,str6});//iske through hm database se data table m print krwaty h
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
					//JOptionPane.showMessageDialog(null,"invalid");
				}
				f.dispose();
	}
	
}
