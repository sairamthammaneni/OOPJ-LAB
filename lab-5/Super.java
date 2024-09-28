//Java program to implement Super keyword
class BankAccount{
	static double balance;
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void deposit(double amt){
		balance=balance+amt;
	}
}
class checking extends BankAccount{
	void display(double amt){
		super.deposit(amt);
		System.out.println("An ammount of "+amt+" has been added");
		System.out.println("Avl Bal: "+super.balance);
	}
}
public class Super{
	public static void main(String[] args){
		BankAccount b=new BankAccount();
		b.setBalance(2000);
		b.deposit(300);
		checking c=new checking();
		c.display(200);
	}
}
