//pollymorphism(method Overriding) + inheritance
package Inheritance;

public class SilverPackage extends IpPackages{
	 
	 private double discount;
	 private String additionalPerks;
     private int days;
    public SilverPackage(String packagename, int price, double discount,String additionalPerks) {
        super(packagename, price);
        this.discount = discount;
        this.additionalPerks = additionalPerks;
    }
	


    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
	
	 public void setAdditionalPerks(String additionalPerks) {
        this.additionalPerks = additionalPerks;
    }

    public String getAdditionalPerks() {
        return additionalPerks;
    }
	       //---------------plomorphism overridding---------
	 public int addDays(int days) {
        this.days =this.days+ days;
        return this.days;
    }
	  //---------------plomorphism overridding---------
    public double totalAmountToPay() {
        return this.price * days;  //ippackage a amr price public korte hoyche becz ei prize ami direct use korci, private price nij class bade
    }                               //use kora jai na
    // -------------------------------------Pholimorphism(method Overriding)------------------------------------
    public void show() {
		System.out.println("\n");
        super.show();
        System.out.println("Discount: " + discount + "%");
		System.out.println("Service: " + additionalPerks );
		System.out.println("After Discount Price: " + (totalAmountToPay()*(discount/100.00)));
		
    }
}