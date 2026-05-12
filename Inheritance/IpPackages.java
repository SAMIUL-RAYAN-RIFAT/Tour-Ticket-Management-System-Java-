package Inheritance;
import Interface.Billing;

public class IpPackages implements Billing {
	
	private String packagename;
	public int price;
	 private int days;
	
	 public IpPackages(String packagename, int price) {
        this.packagename = packagename;
        this.price = price;
		
    }
     

	 public void setPackageName(String packagename) {
        this.packagename = packagename;
    }
	
	
    public String getPackageName() {
        return packagename;
    }

     public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
	                    //   Override( Interface)
	 public int addDays(int days) {
        this.days =this.days+ days;
        return this.days;
    }

                              //   Override(Interface)
    public double totalAmountToPay() {
        return price * days;
    }

    	public void show() {
        System.out.println("Package Name: " + packagename);
        System.out.println("Price: " + price);
        System.out.println("TotalAmountToPay: " + totalAmountToPay());
		
    }
   
}

	
	
	
	
