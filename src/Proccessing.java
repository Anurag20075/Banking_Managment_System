import java.util.List;
import java.util.ArrayList;


public class Proccessing {
    
	private List<Getdata> account=new ArrayList<>();
	
	public void createaccount(String AccountName , String accountnumber,double intialbalance) {
		Getdata newacc=new Getdata( AccountName , accountnumber,intialbalance); 
		account.add(newacc);
		System.out.println("Account successfuly created " + AccountName);
	}

	public Getdata findaccount(String accountnumber) {
		for (Getdata accounts : account) {
			if (accounts.getaccountnumber().equals(accountnumber)) {
				return accounts;
			}
		}
		return null;
	}
	
	public void transferfund(String fromaccountnumber,String toaccountnumber,double amount) {
		Getdata fromaccount=  findaccount(fromaccountnumber);
		Getdata toaccount=  findaccount(toaccountnumber);{
			if(fromaccount != null &&  toaccount!=null) {
				fromaccount.withdraw(amount);
				toaccount.deposit(amount);
				
			  System.out.println("Transfer successful. Transferred " + amount + " from " + fromaccountnumber + " to " + toaccountnumber);
        } else {
            System.out.println("Insufficient balance for transfer.");
        		}
        System.out.println("One or both account numbers are invalid.");
			}
		}
	}
