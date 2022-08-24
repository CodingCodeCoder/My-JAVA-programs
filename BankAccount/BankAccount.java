/*
  BankAccount.java
  Simon Dionne-Couture

  This program creates bank account using subclass Checking and Savings
  to calculate balance, withdraw and deposit an X amount.
*/
public abstract class BankAccount{
  //instance Variables
  double balance;
  static double amount;
  //Constructor
  public BankAccount(){}

  //Methods deposit, withdraw and abstract display
  public void deposit( double amount){
    this.balance = this.balance + amount;
  }

  public void withdraw (double amount){ //substract amount from balance
    this.balance = this.balance - amount;
    if (this.balance < 0) {
      this.balance = 0;
    }
  }
  public abstract void display(); //abstract method
}
