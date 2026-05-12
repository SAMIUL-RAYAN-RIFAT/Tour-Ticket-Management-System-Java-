//package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//import java.lang.*;
 public class  Payment extends JFrame{
	 
	 Payment(){
	 this.setBounds(100,50,700,600);
	 this.setVisible(true);
	 this.setBackground(Color.WHITE);
	 this.setTitle("BOOK NOW BOSS!");
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	 
	 JPanel p12=new JPanel();
	 p12.setLayout(null);
	 p12.setBounds(0,0,1600,65);
	 p12.setBackground(Color.WHITE);
     this.add(p12);
	 
	 JLabel head1=new JLabel(" PAY NOW! ");
	 head1.setBounds(250,20,300,40);
	 head1.setForeground(Color.RED);
	 head1.setBackground(Color.GREEN);
	 head1.setFont(new Font("Tahoma",Font.BOLD,30));
	 p12.add(head1);
	 //Bkash
	  ImageIcon image1 = new ImageIcon("Resources/Bkash.jpg");
        JLabel  label1 = new JLabel(image1);
        label1.setBounds(50, 90, image1.getIconWidth(), image1.getIconHeight());
        p12.add(label1);
		
		JLabel head13=new JLabel("   01608200386/01738177354");
	 head13.setBounds(120,140,700,40);
	 head13.setForeground(Color.BLUE);
	 head13.setBackground(Color.GREEN);
	 head13.setFont(new Font("Tahoma",Font.BOLD,15));
	 p12.add(head13);
	 //Visa
	 ImageIcon image1x = new ImageIcon("Resources/Visa.png");
        JLabel  label1x = new JLabel(image1x);
        label1x.setBounds(50,200, image1x.getIconWidth(), image1x.getIconHeight());
        p12.add(label1x);
		
		JLabel head13e=new JLabel("Click Here to Pay");
	 head13e.setBounds(120,250,700,40);
	 head13e.setForeground(Color.BLUE);
	 head13e.setBackground(Color.GREEN);
	 head13e.setFont(new Font("Tahoma",Font.BOLD,15));
	 p12.add(head13e);
		//Duch Bangla
		 ImageIcon image1xa = new ImageIcon("Resources/DuchB.png");
        JLabel  label1xa = new JLabel(image1xa);
        label1xa.setBounds(50,310, image1xa.getIconWidth(), image1xa.getIconHeight());
        p12.add(label1xa);
		
		JLabel head13c=new JLabel("A/C:00987543453457");
	 head13c.setBounds(120,390,700,40);
	 head13c.setForeground(Color.BLUE);
	 head13c.setBackground(Color.GREEN);
	 head13c.setFont(new Font("Tahoma",Font.BOLD,15));
	 p12.add(head13c);
	 
	
	 
	 }
	 public static void main(String[] args) {
		 new Payment();
        }
	 
	 
 }