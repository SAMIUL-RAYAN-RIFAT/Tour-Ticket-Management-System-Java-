//-------------------------------------------------one to one Association ------------------------------------------------------------
package Association;

public class CustomerInfo{
	
	private int id;
	private String name;
	private String phnNumber;  //gender adress antaci address theke
	private Address address; //---------------------------------------------Association-(one to one) Example------------------------------------------------
	
	public CustomerInfo(int id, String name, String phnNumber, Address address) {
        this.id = id;
        this.name = name;
        this.phnNumber = phnNumber;
        this.address = address;
    }
	
	
	
	
	public void setid(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	

	public int getid()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getPhnNumber()
	{
		return phnNumber;
	}
	
	 public void setAddress(Address address) {
        this.address = address;
	 }
	
	public void showDetails()
	{   
		
		System.out.println("Tourist Information");
		System.out.println("Tourist ID:" +id);
		System.out.println("Tourist Name: " + name);
		System.out.println("Tourist Phone Number :" + phnNumber);
		System.out.println("Address:"+address);
		//address.showDetails();
	}
}
	
	
	
	
	