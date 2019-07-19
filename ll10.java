//view return book
import java.awt.*;
	import javax.swing.*;
	import javax.swing.table.*;
	import java.awt.event.*;
	import java.sql.*;
public class ll10
		{
		JFrame f;
		JLabel l,l1;
		JTable t;
		JScrollPane s;
		DefaultTableModel m;//we use this for dymaaclly row and column add krne k liy mens khud row and colmn add krega acording to your database
		ll10(String s15)
		{	  
		f=new JFrame("server");
		f.setVisible(true);
		f.setSize(1366,768);
		f.setLayout(null);
		
		//font
		Font f1=new Font("Serif",Font.BOLD,40);


			//set the image
			/*  ImageIcon icon = new ImageIcon("aa.jpeg"); 
		    JLabel l = new JLabel();
		     l.setIcon(icon);
			 l.setSize(1366,768);
		     f.add(l);
			 
			  //set panel for login
			   JPanel p=new JPanel(); 
				p.setLayout(null);
			     p.setBounds(500,200,450,450);    
			      p.setBackground(new Color(40,40,40,40));
		           l.add(p);	*/	  
			l1=new JLabel("Returned Books");
		    f.add(l1);
			l1.setBounds(500,5,500,100);
			l1.setFont(f1);
			
			
	     m=new DefaultTableModel(0,0);
	  
			t=new JTable(m);
			String[] column= {"Student ID","Student Name","Course","Year/semstem","Book ID","Book Name","Author Name","Total Book Quantity","Issue Date","Return Date","Quantity","Fine"};
			m.setColumnIdentifiers(column);//for chnge the coloumn name in tabel
			s=new JScrollPane(t);//if hmari window full ho jati h to left se ye scroll krne k liy ek thing deta h
			s.setBounds(50,100,1250,1000);
					f.add(s);
				try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/issuebooks","root","");
						Statement stm=con.createStatement();
						ResultSet rs=stm.executeQuery("select*from returnbook;"); 
						while(rs.next())//jb tk hmare database m row h..ye jb tk chlga..
						{
							String s0=rs.getString(1);//database mai phli row ka phla coloumn data
							String s1=rs.getString(2);//database mai phli row ka 2nd coloumn ka data
							String s3=rs.getString(3);
							String s4=rs.getString(4);
							String s5=rs.getString(5);
							String s6=rs.getString(6);
							String s7=rs.getString(7);
							String s8=rs.getString(8);
							String s9=rs.getString(9);
							String s10=rs.getString(10);
							String s11=rs.getString(11);
							String s12=rs.getString(12);
							//String s13=rs.getString(13);
							m.addRow(new Object[] {s0,s1,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12});//iske through hm database se data table m print krwaty h
						}
					}
					catch(Exception e)
					{
						System.out.println(e);
						//JOptionPane.showMessageDialog(null,"invalid");
					}
				//	f.dispose();
		}
					
		}
		
	

