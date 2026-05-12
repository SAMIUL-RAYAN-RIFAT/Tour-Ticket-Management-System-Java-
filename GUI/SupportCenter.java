//package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

 public class  SupportCenter extends JFrame{
	 
	 SupportCenter(){
	 this.setBounds(80,20,700,600);
	 this.setVisible(true);
	 this.setBackground(Color.WHITE);
	 this.setTitle("support center");
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	 
	 JPanel p12=new JPanel();
	 p12.setLayout(null);
	 p12.setBounds(0,0,1600,65);
	 p12.setBackground(Color.WHITE);
     this.add(p12);
	 
	  //image add
	  ImageIcon img3=new ImageIcon(getClass().getResource("Resources/welcome.jpg"));           
	  JLabel l23=new JLabel(img3);                                               
	  l23.setBounds(50,0,500,300); 
	  p12.add(l23);       
	 
	  JLabel head1=new JLabel(" For Any Query ");
	 head1.setBounds(170,200,500,40);
	 head1.setForeground(Color.RED);
	 head1.setBackground(Color.GREEN);
	 head1.setFont(new Font("Tahoma",Font.BOLD,30));
	 p12.add(head1);
	 
	
	 
	 JLabel head13=new JLabel(" CALL US:0096662343454 ");
	 head13.setBounds(150,320,700,40);
	 head13.setForeground(Color.BLUE);
	 head13.setBackground(Color.GREEN);
	 head13.setFont(new Font("Tahoma",Font.BOLD,20));
	 p12.add(head13);
	 
	 JLabel head132=new JLabel(" EMAIL US:supporttravel@gmail.com");
	 head132.setBounds(150,370,700,40);
	 head132.setForeground(Color.BLUE);
	 head132.setBackground(Color.GREEN);
	 head132.setFont(new Font("Tahoma",Font.BOLD,20));
	 p12.add(head132);
	 
	 }
	 public static void main(String[] args) {
		 new SupportCenter();
        }
	 
	 
 }