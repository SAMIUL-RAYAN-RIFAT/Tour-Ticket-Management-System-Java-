//one to many Association  +    Nullpointer exception----------------------------------------
package Association;
    public class multiCustomerInfo{    //Customers
		
		private CustomerInfo[] e; //----------------------Example:one to many Association------------------------------------
		private int count;    //by default 0
		private final int size; //--------------------------------final keyword----------------
        		
		            
		
		public multiCustomerInfo( int size){
			
			this.size=size;
			this.e=new CustomerInfo[size];
			

		}
		
		public void addMultiCustomerInfo(CustomerInfo e1)  //e1,e2 customarer obj ja start file a create korbo
		
		{
			if(count<e.length)
			{
				this.e[count]=e1;
				count++;
			}
			
		}
		
		public void removeMultiCustomerInfo(CustomerInfo a1)
	{
		
		for(int i=0; i<e.length; i++)    //o,zero theke arrylist size projonto loop chalalam
		{
			if(e[i] == a1)                //jodo object a1 re sathe match pawa jai then ota null 
			{
				e[i] = null;
				
				break;
			}
		}
		
		
	
	}
		
		public void showDetails()
	{   
		
		System.out.println("Tourist Information");
		
		System.out.println();
		for(int i=0;i<count;i++)
		{       try{                                             //-------------------nullpointerexception---------------------
			       e[i].showDetails();
		         }catch (NullPointerException e) {
					  System.out.println("Null pointer exception occurred at index " + i+"\n");
				 }
			
			
		}
		
	}
		
		
		
	}