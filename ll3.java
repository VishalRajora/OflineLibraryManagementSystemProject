//view all books details
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.sql.*;
 class ll3
 {
	JFrame f;
	JLabel l,l1;
	JTable t;
	JScrollPane s;
	DefaultTableModel m;//we use this for dymaaclly row and column add krne k liy mens khud row and colmn add krega acording to your database
	ll3(String s8)
	{	  
	f=new JFrame("server");
	f.setVisible(true);
	f.setSize(1366,768);
	f.setLayout(null);
	
	//font
	Font f1=new Font("Serif",Font.BOLD,40);


		//set the image
		  ImageIcon icon = new ImageIcon("aa.jpeg"); 
	    JLabel l = new JLabel();
	     l.setIcon(icon);
		 l.setSize(1366,768);
	     f.add(l);
		   
		l1=new JLabel("All Book which is Store in Library");
	    f.add(l1);
		l1.setBounds(400,5,700,100);
		l1.setFont(f1);
		
		
  m=new DefaultTableModel(0,0);
  
		t=new JTable(m);
		String[] column= {"Book ID","Book Name","Author Name","Quantity"};
		m.setColumnIdentifiers(column);//for chnge the coloumn name in tabel
		s=new JScrollPane(t);//if hmari window full ho jati h to left se ye scroll krne k liy ek thing deta h
		s.setBounds(100,100,1100,1000);
		s.setOpaque(false);
				f.add(s);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
					Statement stm=con.createStatement();
					ResultSet rs=stm.executeQuery("select*from book;"); 
					while(rs.next())//jb tk hmare database m row h..ye jb tk chlga..
					{
						String s0=rs.getString(1);//database mai phli row ka phla coloumn data
						String s1=rs.getString(2);//database mai phli row ka 2nd coloumn ka data
						String s3=rs.getString(3);
						String s4=rs.getString(4);
				
						m.addRow(new Object[] {s0,s1,s3,s4});//iske through hm database se data table m print krwaty h
					}
				}
				catch(Exception e)
				{
					
				JOptionPane.showMessageDialog(null,"invalid");
				}
				//f.dispose();
	}
	
	
}
