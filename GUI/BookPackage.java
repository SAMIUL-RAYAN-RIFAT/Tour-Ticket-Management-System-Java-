 //NumberFormatException used
 //package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;      
import java.io.*;


//Economic

 public class BookPackage extends JFrame implements ActionListener{
	 
	   private Container c;
	   private JRadioButton rr33,rr44,rr55;
	   private ButtonGroup bq3;
	   public JTextField f1,f12;
	   private JButton Ok,Book_Now; 
		
	   public BookPackage(){
		   super("Frame");                                     
		 this.setVisible(true);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   
		 this.setBounds(0,0,1600,800); 
		 this.setTitle("BookPackage"); 
		   
		   
		   
		   
		   
	      c=new Container();
		  c=this.getContentPane();
		  c.setLayout(null);
		  c.setBackground(Color.WHITE);
	 
	      JLabel head1=new JLabel(" Available Packages ");
	    head1.setBounds(650,0,500,20);
	    head1.setForeground(Color.RED);
	    head1.setBackground(Color.GREEN);
	    head1.setFont(new Font("Tahoma",Font.BOLD,15));
	    c.add(head1);
	 
	    ImageIcon image1 = new ImageIcon("Resources/Economic.jpg");
        JLabel  label1 = new JLabel(image1);
        label1.setBounds(25, 50, image1.getIconWidth(), image1.getIconHeight());
        c.add(label1);
	 
	    
	    ImageIcon image12 = new ImageIcon("Resources/Business.jpg");
        JLabel  label12 = new JLabel(image12);
        label12.setBounds(450, 50, image12.getIconWidth(), image12.getIconHeight());
        c.add(label12);
	    
		ImageIcon image123 = new ImageIcon("Resources/First.jpg");
        JLabel  label123 = new JLabel(image123);
        label123.setBounds(1000, 50, image12.getIconWidth(), image12.getIconHeight());
        c.add(label123);
		//----------------------------------------Book Package start--------------------------------------
		JLabel head13=new JLabel(" Book Packages ");
	    head13.setBounds(650,400,500,20);
	    head13.setForeground(Color.GREEN);
	    head13.setBackground(Color.GREEN);
	    head13.setFont(new Font("Tahoma",Font.BOLD,15));
	    c.add(head13);
		  
		JLabel head13e=new JLabel("Select Package:");
	    head13e.setBounds(20,450,500,20);
	    head13e.setForeground(Color.BLACK);
	    head13e.setBackground(Color.GREEN);
	    head13e.setFont(new Font("Tahoma",Font.BOLD,15));
	    c.add(head13e);
		
		//------------------------------------Radio Button--------------------
		rr33 =new JRadioButton("Economic class");
		rr33.setBounds(150,450,120,25);
		c.add(rr33);
		
		rr44 =new JRadioButton("Business class");
		rr44.setBounds(300,450,120,25);
		c.add(rr44);
		
		rr55 =new JRadioButton("First class");
		rr55.setBounds(450,450,150,25);
		c.add(rr55);
		//------------------------Groping radio Button-----------------------
	    bq3=new ButtonGroup();
		bq3.add(rr33);
		bq3.add(rr44);
		bq3.add(rr55);
		
		//---------------------------add person------------------
		
		JLabel head13e3=new JLabel("Num of Person:");
	    head13e3.setBounds(20,500,500,20);
	    head13e3.setForeground(Color.BLACK);
	    head13e3.setFont(new Font("Tahoma",Font.BOLD,15));
	    c.add(head13e3);
		
		f1 =new JTextField();
			   f1.setBackground(Color.WHITE);
			   f1.setBounds(150,500,60,25);
			   c.add(f1);
		
		
		//-------------------------add day---------------------------
		                                          
		JLabel head13e3w=new JLabel("Num of DAY  :");
	    head13e3w.setBounds(20,550,500,20);
	    head13e3w.setForeground(Color.BLACK);
	    head13e3w.setFont(new Font("Tahoma",Font.BOLD,15));
	    c.add(head13e3w);
		
		f12 =new JTextField();
			   f12.setBackground(Color.WHITE);
			   f12.setBounds(150,550,60,25);
			   c.add(f12);
			   
		//--------------------creating button---------------------------------	   
			   
			  Ok =new JButton("OK");
			  Ok.setBounds(200,600,70,25);
			  Ok.setBackground(Color.YELLOW);
			  c.add(Ok);
			   
			   
			    Book_Now =new JButton("Book Now");
			  Book_Now.setBounds(600,700,100,60);
			  Book_Now.setBackground(Color.YELLOW);
			  c.add(Book_Now);
			   
			   
			   
			    //       --------------------Adding actionListener-----
			   
			   Book_Now.addActionListener(this); //this hobe not c
			   Ok.addActionListener(this); 
	  
	 }
	 
	     public void actionPerformed(ActionEvent ed){
		 
		 
		 if(Book_Now==ed.getSource())
		 {
			 JOptionPane.showMessageDialog(null,"Successfully Booked");
		 }
		 
		 
		 //--------------------------------main one--------------------------------
		else if(Ok == ed.getSource()) {
        int numOfPerson;
        int numOfDays;
        int baseCostPerDay;

        if (rr33.isSelected()) {
            baseCostPerDay = 8000;
        } else if (rr44.isSelected()) {
            baseCostPerDay = 15000;
        } else if (rr55.isSelected()) {
            baseCostPerDay = 25000;
        } else {
            JOptionPane.showMessageDialog(null, "Please select a package");
            return;
        }

        try {
            numOfPerson = Integer.parseInt(f1.getText());
            numOfDays = Integer.parseInt(f12.getText());
            int totalCost = numOfPerson * numOfDays * baseCostPerDay;

            JLabel costLabel = new JLabel("Total Cost: " + totalCost);
            costLabel.setBounds(20, 650, 200, 20);
            costLabel.setForeground(Color.RED);
            costLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
            c.add(costLabel);                                                        //  c.revalidate();  c.repaint(); recommend kora hoyche  error er jonno   
            c.revalidate();//container er sathe regular addhote thakbe jotobar notun click hobe dutai
            c.repaint();//eta holo repaint kore er ager ta new korar reques kore
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid number of persons or days");
        }
    }
		 
		 
		 
		 
		 
		 }
	  
	 /* public static void main(String[] args) {
		  BookPackage frame142=new  BookPackage();                                      
		 frame142.setVisible(true);
		 frame142.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   
		 frame142.setBounds(0,0,1600,800); 
		 frame142.setTitle("BookPackage"); 
        }
		*/
  }