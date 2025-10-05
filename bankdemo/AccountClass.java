package bankdemo;
public class AccountClass {
	private double accno;
	private String name;
	private double accbal;	
	AccountClass( double AccN, String name,double AccB){
		this.accno = AccN;
		this.name = name;
		this.accbal = AccB;
	}
	public void deposit(double amount) throws ArithmeticException {
		if(amount<0) {
			throw new  ArithmeticException("you cannot deposit negative amount. Again enter the amount  ");
		}else {
			System.out.println("Deposited amount:"+amount);
			accbal += amount;
		}
	}
	public void withdraw(double amount) throws InsufficientBalanceException, ArithmeticException {
		if(amount < 0) {
			throw new  ArithmeticException("you cannot Withdraw negative amount. Again enter the amount  ");
		}
		if(amount > accbal ) {
			throw new InsufficientBalanceException();
		}
		accbal -= amount;
		System.out.println("Withdrawed Amount:"+amount);
	}
	public void displayAccountDetails() {
		System.out.println("Account Number:"+this.accno);
		System.out.println("Account holder name:"+this.name);
		System.out.println("Account Balance:"+this.accbal);
	}	
}