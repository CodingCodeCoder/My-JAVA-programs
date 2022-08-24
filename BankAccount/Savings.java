/*
  Savings.java
  Simon Dionne-Couture

  Create a savings account and addInterest
*/
public class Savings extends BankAccount{
  double intRate; //interest Rate


  //Constructor
  public Savings (double amount, double intRate) {
    this.intRate = intRate;
    this.balance = amount;
  }
  public void addInterest () {
    //calculate the interest by multiplying the intRate by the curBalance add int to balance.
    this.balance = (intRate * this.balance) + this.balance;
  }

  @Override
  public void display(){
    System.out.println(String.format("Savings account balance = $%.2f", this.balance));
  }
}
