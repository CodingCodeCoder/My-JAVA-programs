/*
  Checking.java
  Simon Dionne-Couture

  this creates a Checking account and writeACheck
*/
public class Checking extends BankAccount{
  //no instance Variables

  //Constructor
  public Checking(double amount){
    this.balance = amount;
    if (amount < 0){
      this.balance = 0;
    }
  }

  //Methods writeACheck, display
  public void writeACheck (double amount) {
    this.balance = this.balance - amount - 1;//-1$ for service fees
  }

  @Override
  public void display(){
    //print type of account: Checking and the balance in standard currency format
    System.out.println(String.format("Checking account balance = $%.2f", this.balance));
  }
}
