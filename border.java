//issue books;
//search books
import java.sql.*;
import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

class ll9 //implements ActionListener
{
	JLabel l,l1,l2,l3;
	JFrame f;
   JTextField t, t1,t2,t3;
	//JButton b;

 ll9()//String s8)
{
JFrame f=new JFrame("my frame");
f.setVisible(true);
f.setSize(1366,768);
f.setLayout(null);

Font f1=new Font("Serif",Font.BOLD,40);

JPanel p=new JPanel();
p.setBounds(200,130,1000,250);
p.setBackground(new Color(0,0,0,10));
p.setBorder(new TitledBorder(new SoftBevelBorder(SoftBevelBorder.RAISED) ,"Student Information"));
f.add(p);


l1=new JLabel("Student ID");
p.add(l1);
l1.setBounds(10,30,160,30);

t=new JTextField();
t.setBounds(100,30,130,30);
p.add(t);
}
 public static void main(String[] args)
 {
	 ll9 l=new ll9();
 }
 }