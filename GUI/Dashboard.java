//package GUI;
//button ulta palta jaga asle frame ekbar (class file delete)constractor/mainfunction/previous class e dia run kore dekbo

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
//import java.lang.*;
 public class  Dashboard extends JFrame implements ActionListener {
	 
	 private JButton addPersonDetails,DeletePersonDetails,showPersonDetails,cheackPackage,updatePersonDetails;        //addActionListener somoy add dis onno method e
	 
	 Dashboard(){
	 this.setBounds(0,0,1600,1000);
	 this.setVisible(true);
	 this.setBackground(Color.WHITE);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	 
	 //create panel
	 JPanel p1=new JPanel();
	 p1.setLayout(null);
	 p1.setBounds(0,0,1600,65);
	 p1.setBackground(Color.WHITE);
     this.add(p1);
	 
	 //head jlabel
	 JLabel head=new JLabel("DashBoard");
	 head.setBounds(50,10,300,40);
	 head.setForeground(Color.RED);
	 head.setBackground(Color.GREEN);
	 head.setFont(new Font("Tahoma",Font.BOLD,30));
	 p1.add(head);
	 
	 
	/*  //create  left panel
	 JPanel p2=new JPanel();
	 p2.setLayout(null);
	 p2.setBounds(0,65,300,900);
	 p2.setBackground(Color.RED);
     this.add(p2);*/
	 
	 //JBUTTON
	  addPersonDetails=new JButton("Add Personal Details");
	 addPersonDetails.setBounds(0,65,300,50);
	 addPersonDetails.setBackground(Color.YELLOW);
	 addPersonDetails.addActionListener(this);
	 p1.add(addPersonDetails);
	 
	 
	  updatePersonDetails=new JButton("Book packages");
	 updatePersonDetails.setBounds(0,120,300,50);
	 updatePersonDetails.setBackground(Color.YELLOW);
	 updatePersonDetails.addActionListener(this);
	 p1.add(updatePersonDetails);
	 
	 showPersonDetails=new JButton("Payment");
	 showPersonDetails.setBounds(0,175,300,50);
	 showPersonDetails.setBackground(Color.YELLOW);
	 showPersonDetails.addActionListener(this);
	 p1.add(showPersonDetails);
	 
	 DeletePersonDetails=new JButton("Calculator");
	 DeletePersonDetails.setBounds(0,230,300,50);
	 DeletePersonDetails.setBackground(Color.YELLOW);
	 DeletePersonDetails.addActionListener(this);
	 p1.add(DeletePersonDetails);
	 
	  cheackPackage=new JButton("Support center");
	 cheackPackage.setBounds(0,285,300,50);
	 cheackPackage.setBackground(Color.YELLOW);
	  cheackPackage.addActionListener(this);
	 p1.add(cheackPackage);
	 
	/* JButton choosekPackage=new JButton("Book Package");
	 choosekPackage.setBounds(0,340,300,50);
	 choosekPackage.setBackground(Color.YELLOW);
	 p1.add(choosekPackage);
	 
	 JButton viewPackage=new JButton("View Package");
	 viewPackage.setBounds(0,395,300,50);
	 viewPackage.setBackground(Color.YELLOW);
	 p1.add(viewPackage);*/
	 
	 			           //image add
      ImageIcon iiimg=new ImageIcon(getClass().getResource("Resources/travel1.jpg"));           
	   JLabel ll35=new JLabel("WELL-COME!");                                               
       ll35.setBounds(320,80,1100,800); 
	   ll35.setFont(new Font("Tahoma",Font.BOLD,40));
	   ll35.setIcon(iiimg);
	   p1.add(ll35);
	   
	   
	 }
	 	
			public void actionPerformed(ActionEvent elo) {
        if (addPersonDetails == elo.getSource()) {
			JOptionPane.showMessageDialog(null,"Add All Traveler Details");
				Addcustomar x1=   new Addcustomar();
     
	  // Addcustomar x1=   new Addcustomar();
         // x1.setBounds(200, 20, 800, 800);
        // x1.setVisible(true);
	     //x1.setTitle("Add Info");
         //x1.setBackground(Color.WHITE);
         // x1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//x1.setLayout(null);
		}
		else if(elo.getSource()==DeletePersonDetails){
			new Calculator();
			
			
		}
		else if(elo.getSource()==showPersonDetails){
			
			 new Payment();
			
		}
		else if(elo.getSource()==cheackPackage){
              new SupportCenter();
		
		
		
		}
		else if(elo.getSource()==updatePersonDetails){
			new  BookPackage();                                      
		
		}
		
		
			}
			
			
			
			
			
	public static void main(String[] args) {
		 new Dashboard();
        }
			}