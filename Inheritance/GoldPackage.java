package Inheritance;
import Interface.Billing;

public class GoldPackage extends IpPackages implements Billing   {  //implements Billing -just for fun,already ipackage e ase
    private double discount;
    private String additionalPerks;
    private int days;
    public GoldPackage(String packagename, int price, double discount, String additionalPerks) {
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
	
	  //   Override( Interface)
	 public int addDays(int days) {
        this.days =this.days+ days;
        return this.days;
    }

                              //   Override(Interface)
    public double totalAmountToPay() {
        return price * days;
    }
	
	

    //                                            MethodOverride
    public void show() {
		System.out.println("\n");
        super.show();
        System.out.println("Discount: " + discount + "%");
        System.out.println("Additional Perks: " + additionalPerks);
		System.out.println("After Discount Price: " + (totalAmountToPay()*(discount/100.0)));
    }
}