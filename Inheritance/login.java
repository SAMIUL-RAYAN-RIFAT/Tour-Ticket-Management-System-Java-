package Inheritance;

public class login extends Registration{
	 
	  private String name;
    private String password;
	
	  public login(String name,String password){
		   this.name = name;
		   this.password = password;
	   }
                    
   /* //Override
    public String addName(String name) {
        this.name = name;
        return this.name;
    }

    //Override
    public String addPassword(String pass) {
        this.password = pass;
        return this.password;
    }*/
 //---------------------------------------------Override-----------------------
    public void show() {
		System.out.println("\n");
        System.out.println("Name: " +this.name);
        System.out.println("Password: " + this.password);
    }
}