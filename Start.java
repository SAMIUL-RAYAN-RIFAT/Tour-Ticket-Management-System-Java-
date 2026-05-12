import Association.*;
import Inheritance.*;
import Abstract.Abs_Gender;
import Interface.Billing;
import Interface.In_Registation;
import GUI.*;
import javax.swing.*;
public class Start extends JFrame{
 public static void main(String[] args) {
	                                 //Abstruction(obj referance)
	 Abs_Gender abg;
	 abg=new Address("Obj Referance","Abstruction");
	 abg.showDetails();
	 
	                            //Association  
	 Address address=new Address("Male","Dhaka Kuril");
	 Address address1=new Address("Female","Mirpur");
	 address.showDetails();
	 address1.showDetails();
	 
	 CustomerInfo customerInfo =new CustomerInfo(045213,"SR Rifat","01608200386",address);      //one to one association
	 CustomerInfo customerInfo1 =new CustomerInfo(32312,"KING COBRA","01345545566",address1);
	 customerInfo.showDetails();
	 customerInfo1.showDetails();
	 
	 multiCustomerInfo mci=new multiCustomerInfo(10);                    //Final attribute used +one to many association used
	 mci.addMultiCustomerInfo(customerInfo);                             //nullpoint exception(run time) used
	 mci.addMultiCustomerInfo(customerInfo1); 
	 mci.showDetails();
	 
    mci.removeMultiCustomerInfo(customerInfo1);
	mci.showDetails();
	
	                             //Inheritance
	
	IpPackages ip1=new IpPackages("Economic Package",8000);
	ip1.addDays(4);     //4=day                                                    //    interface
	ip1.show(); 
	
	SilverPackage sp1=new SilverPackage("Business Package",15000,5,"Free meal");//5=discount
	sp1.addDays(5); 
	sp1.show();
	
	IpPackages gp1=new GoldPackage("GoldClass",25000,10,"Free meal+PersonalTourGuider");  //polymorpic behavior of object/(object referance)
	gp1.addDays(5); 
	gp1.show();
	
	                      //Registation login (Inheritance+Interface)
	
	In_Registation ir;
	ir=new Registration();
	ir.addName("SR Rifat"); 	//interface
	Registration rg=new Registration();//name showing null,where pasword showing correctly(obj referancing can run the code,but will not show perfect output)
	rg.addPassword("password12");
	rg.show(); //show call korte parbo na karon eta interface a cilo na,tai obj referancing somvob na
	
	login lg=new login("SAMIUL","pass$#");
	lg.show();
	    //---------------------------------------Calling Swing(GUI)-------------------------------------------------------
	/*Login frame1=new  Login();                                      
		 frame1.setVisible(true);
		 frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   
		 frame1.setBounds(100,50,600,700); 
		frame1.setTitle("Login"); */
	
 }
}