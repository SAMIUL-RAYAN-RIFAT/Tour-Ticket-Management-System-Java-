//package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
 public class  Register extends JFrame {
	 
	     private Container cc;
		 private JLabel ll1,ll2,ll3;
		 private JTextField ff1;
		 private JPasswordField pp1;
		 private ImageIcon iimg; 
		 private JButton OOK,rregister;
		 private File file1;
	     private FileWriter filewr2;
		
		  public Register(){
			  cc=new Container();
			  cc=this.getContentPane();
			  cc.setLayout(null);
			  cc.setBackground(Color.WHITE);
			  
			             //user name + textfield
			  ll1=new JLabel();
			  ll1.setText("Put User Name ");
			  ll1.setBounds(50,60,120,30);
			  ll1.setForeground(Color.RED);
			  cc.add(ll1);
			  
			   ff1 =new JTextField("please provide atleast 3 cahracter");
			   ff1.setBackground(Color.WHITE);
			   ff1.setBounds(180,60,200,30);
			   cc.add(ff1);
			   
			           //password + password field
			  ll2=new JLabel();
			  ll2.setText("Put the Password");
			  ll2.setBounds(50,100,120,40);
			  ll2.setForeground(Color.RED);
			  cc.add(ll2);
			  
			   pp1 =new JPasswordField();
			   pp1.setBackground(Color.WHITE);
			   pp1.setBounds(180,100,200,30);
			   pp1.setEchoChar('!');
			   cc.add(pp1);
			           //image add
			   iimg=new ImageIcon(getClass().getResource("Resources/SignUp.jpg"));           
		       ll3=new JLabel(iimg);                                               
		       ll3.setBounds(100,200,500,400); 
			   cc.add(ll3);
			   
			  
			             //Jbutton(ok)
			  OOK =new JButton("Cancel");
			  OOK.setBounds(290,150,80,30);
			  OOK.setBackground(Color.ORANGE);
			  cc.add(OOK);
			  
			   rregister =new JButton("Register");
			 rregister.setBounds(180,150,100,30);
			  rregister.setBackground(Color.ORANGE);
			  cc.add(rregister);
			          
					  //calling action Listener
			  AAListener aa1=new AAListener();
			  OOK.addActionListener(aa1);
			  rregister.addActionListener(aa1);
		  }
		  
		  
		  
	                //creating a new class for action listener
	public  class AAListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
		 if(e.getSource()==OOK)
		 {JOptionPane.showMessageDialog(null,"cancel clicked");
           dispose();	 }
	     else if(e.getSource()==rregister)
		 {
			     //file write
			 
			   try{
			   file1=new File("rifat.txt");
	           file1.createNewFile();    
               filewr2 = new FileWriter("rifat.txt",true);                         
			 
			   filewr2.write(ff1.getText()+"\n");//"\t"+pp1.getText()+
			   filewr2.close();			   
			   }                              
			  catch(IOException ef){System.out.println("Exception found");}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 JOptionPane.showMessageDialog(null,"Registation Complete","Hurray !",JOptionPane.WARNING_MESSAGE);
			 
			 Login frame4=new  Login();                                      
		     frame4.setVisible(true);
		     frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   
		     frame4.setBounds(100,50,800,700); 
			 dispose();
		 }
		}
		
	}
	 
	 
	 
	 
	 
	 
	 
	/* public static void main(String[] args)
	 {
		  Register frame2=new Register();                                      
		 frame2.setVisible(true);
		 frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   
		 frame2.setBounds(100,50,800,700); 
		 frame2.setTitle(" Register");                            
		                             
		  
	 }
 */
 }