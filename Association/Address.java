package Association;

import Abstract.Abs_Gender;
                                          //Abstruction done here
public class Address extends Abs_Gender{
	
	private String address;
	
	  public Address(String gender, String address) {
        super(gender);
        this.address = address;
    }

    // Getters and setters
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
	
	 public String toString() {         //eta toString(builtin method) howa must becus ekane override korci
        return "Gender: " + gender + "Address: " + address;  //for accociation we reterened value as string
    }
	
	public void showDetails()//---------------------------Abstraction(method overriding) 
	{   
		System.out.println("Customer gender  : " + gender);
		System.out.println(" Customer Address  : " + address);
		
	}
}