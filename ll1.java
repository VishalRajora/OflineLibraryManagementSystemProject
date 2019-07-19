//frame OF lib.
    import java.sql.*;
	import java.awt.*;
	import java.awt.Color;
	import java.awt.event.*;
	import javax.swing.*;
	
    class ll1 implements ActionListener
	{ 
	JFrame f;
	JLabel l1;
	JButton b,b0,b1,b2,b3,b4,b5,b6,b7,b8;
	ll1(String s5)
	{
	f=new JFrame("my frame");
	f.setLayout(null);
	f.setVisible(true);
	f.setSize(1366,768);
	
	
			Font f1=new Font("Serif",Font.BOLD,30);
	//set the image
			 ImageIcon icon = new ImageIcon("ll1.jpeg"); 
		     JLabel l = new JLabel();
		     l.setIcon(icon);
			 l.setSize(1366,768);
		     f.add(l);	
//panel
		  JPanel p=new JPanel(); 
			p.setLayout(null);
			 p.setBackground(new Color(0,0,0,50));
			     p.setBounds(650,60,450,600);    
		           l.add(p);
	
	l1=new JLabel("Book Information");
	l1.setBounds(70,10,300,70);
	p.add(l1);
	l1.setForeground(Color.WHITE);
	l1.setFont(f1);
	
	
	b=new JButton("Add Book");
	b.setBounds(100,100,160,30);
	p.add(b);
	b.addActionListener(this);
	
	b0=new JButton("View all Books");
	b0.setBounds(100,150,160,30);
	p.add(b0);
	b0.addActionListener(this);
	
	b1=new JButton("Delete Book");
	b1.setBounds(100,200,160,30);
	p.add(b1);
	b1.addActionListener(this);
	
    b2=new JButton("Update Book");
	b2.setBounds(100,250,160,30);
	p.add(b2);
	b2.addActionListener(this);
	
	b3=new JButton("Search Book");
	b3.setBounds(100,300,160,30);
	p.add(b3);
	b3.addActionListener(this);

	b4=new JButton("Issue books");
	b4.setBounds(100,350,160,30);
	p.add(b4);
	b4.addActionListener(this);
	
	b5=new JButton("Return Book");
	b5.setBounds(100,400,160,30);
	p.add(b5);
	b5.addActionListener(this);
	
	b6=new JButton("view Issue books");
	b6.setBounds(100,450,160,30);
	p.add(b6);
	b6.addActionListener(this);
		
	b7=new JButton("view Return books");
	b7.setBounds(100,500,160,30);
	p.add(b7);
	b7.addActionListener(this);
	
	b8=new JButton("Logout");
	b8.setBounds(100,550,160,30);
	p.add(b8);
	b8.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
	{
		String s6=b.getText();
		new ll2(s6);
	}
		if(ae.getSource()==b0)
	{
	  String s8=b0.getText();	
	   new ll3(s8);
	}

	if(ae.getSource()==b1)
	{
	  String s9=b1.getText();	
	   new ll4(s9);
	}
		if(ae.getSource()==b2)
		{
	  String s10=b2.getText();	
	   new ll5(s10);
	}
	if(ae.getSource()==b3)
	{
		String s11=b3.getText();
		new ll6(s11);
	}
	if(ae.getSource()==b4)
	{
		String s12=b4.getText();
		new ll7(s12);
	}
	if(ae.getSource()==b5)
	{
		String s13=b5.getText();
		new ll8(s13);
	}
	if(ae.getSource()==b6)
	{
		String s14=b6.getText();
		new ll9(s14);
	}
	if(ae.getSource()==b7)
	{
		String s15=b7.getText();
		new ll10(s15);
	}
	if(ae.getSource()==b8)
	{
		String slog1=b8.getText();
		new ll0(slog1);
		
	}
	//f.dispose();
	
	}

	
	}
