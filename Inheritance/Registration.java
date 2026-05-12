package Inheritance;

import Interface.In_Registation;

 public class Registration implements In_Registation{
	 
	  private String name;
    private String password;

    //Override
    public String addName(String name) {
        this.name = name;
        return this.name;
    }

    //Override
    public String addPassword(String pass) {
        this.password = pass;
        return this.password;
    }

    public void show() {
		System.out.println("\n");
        System.out.println("Name: " +this.name);
        System.out.println("Password: " + this.password);
    }
}
	 
	 
	 
	 
	 
	 
	 
 