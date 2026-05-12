//button ulta palta jaga asle frame ekbar (class file delete)constractor/mainfunction/previous class e dia run kore dekbo
//package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;       //for scanner class                 //jokeen ei class e main abr costructore fame value bosano hoy tokon overlap hoy
import java.io.*;
 public class Login extends JFrame {
	      
	     private Container c;
		 private JLabel l1,l2,l3;
		 public JTextField f1;
		 public JPasswordField p1;
		 private ImageIcon img; 
		 private JButton OK,register;
		 private File file;
		// private FileReader  fr;
		
		  public Login(){
			 super("Login");
			  c=new Container();
			  c=this.getContentPane();
			  c.setLayout(null);
			  c.setBackground(Color.WHITE);
			  
			             //user name + textfield
			  l1=new JLabel();
			  l1.setText("User Name ");
			  l1.setBounds(80,60,80,30);
			  l1.setForeground(Color.RED);
			  c.add(l1);
			  
			   f1 =new JTextField();
			   f1.setBackground(Color.WHITE);
			   f1.setBounds(180,60,200,30);
			   c.add(f1);
			   
			           //password + password field
			  l2=new JLabel();
			  l2.setText(" Password ");
			  l2.setBounds(80,100,80,40);
			  l2.setForeground(Color.RED);
			  c.add(l2);
			  
			   p1 =new JPasswordField();
			   p1.setBackground(Color.WHITE);
			   p1.setBounds(180,100,200,30);
			  // p1.setEchoChar('!');
			   c.add(p1);
			           //image add
			   img=new ImageIcon(getClass().getResource("Resources/Login.jpg"));           
		       l3=new JLabel(img);                                               
		       l3.setBounds(50,200,500,400); 
			   c.add(l3);
			   
			  
			             //Jbutton(ok)
			  OK =new JButton("Confirm");
			  OK.setBounds(290,150,80,30);
			  OK.setBackground(Color.WHITE);
			  c.add(OK);
			  
			   register =new JButton("Sign Up");
			  register.setBounds(180,150,100,30);
			  register.setBackground(Color.ORANGE);
			  c.add(register);
			          
					  //calling action Listener
			  AListener a1=new AListener();
			  OK.addActionListener(a1);
			  register.addActionListener(a1);
			  
		    
		  }
		  
		  
		  
	                //creating a new class for action listener
	public  class AListener implements ActionListener{
		public void actionPerformed(ActionEvent el){                  //Actioneven er a capital letter
		 if(el.getSource()==OK)
		 {    //   -----------------------------FILE READING---------------------------------------------------
			 boolean bool2=false;
			 	String name=f1.getText().toString();
		     // String pass1=p1.getText().toString();
		
			   try{
			 
			 
			 file=new File("rifat.txt");
			 FileReader fr=new FileReader("rifat.txt");
			
			 BufferedReader br=new BufferedReader(fr);
			 String line;
			 while((line=br.readLine())!=null){
				   if(line.equals(name))  //+"\t"+pass1+"\n"
				   {					   
					  bool2=true;
			         break;
					 
					 
			 }}
			 fr.close();
		 }
			 catch(Exception echga)
			 {System.out.println("exception");}
			 
			 
			 
			      if(bool2==true)
			         { JOptionPane.showMessageDialog(null,"Login successful");
				  Dashboard dd3= new Dashboard();
					dd3.setBounds(0,0,1600,1000);
	               dd3.setVisible(true);
	                dd3.setBackground(Color.WHITE);
	                dd3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
				    //dispose();
				 }
			 
			      else{JOptionPane.showMessageDialog(null,"WORNG PASSWORD");}







		 }
		
	     else if(el.getSource()==register)
		 {                                                       //register  window calling
			 Register frame3=new Register();                                      
		    frame3.setVisible(true);
		    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			frame3.setBounds(130,60,800,700); 
		    frame3.setTitle(" Register");       
			 dispose();   //to turn of current window
		 }
		}
		
	}
 
	 
	 
	 
	 /**/
	 
	 
	 public static void main(String[] args)
	 {
		 Login frame1=new  Login();                                      
		 frame1.setVisible(true);
		 frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   
		 frame1.setBounds(100,50,600,700); 
		 frame1.setTitle("Login");                            
		                             
		  
	 }
 }