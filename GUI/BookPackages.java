//package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//import java.lang.*;
 public class  BookPackages extends JFrame{
	 
	 BookPackages(){
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
	 
	 JLabel head1=new JLabel(" BOOK NOW! ");
	 head1.setBounds(200,200,300,40);
	 head1.setForeground(Color.RED);
	 head1.setBackground(Color.GREEN);
	 head1.setFont(new Font("Tahoma",Font.BOLD,30));
	 p12.add(head1);
	 
	 JLabel head13=new JLabel(" CALL US:01608200386/01738177354  Or");
	 head13.setBounds(50,300,700,40);
	 head13.setForeground(Color.BLUE);
	 head13.setBackground(Color.GREEN);
	 head13.setFont(new Font("Tahoma",Font.BOLD,20));
	 p12.add(head13);
	 
	 JLabel head132=new JLabel(" EMAIL US:travel@gmail.com");
	 head132.setBounds(50,350,700,40);
	 head132.setForeground(Color.BLUE);
	 head132.setBackground(Color.GREEN);
	 head132.setFont(new Font("Tahoma",Font.BOLD,20));
	 p12.add(head132);
	 
	 }
	 public static void main(String[] args) {
		 new BookPackages();
        }
	 
	 
 }