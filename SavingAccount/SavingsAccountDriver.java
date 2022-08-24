/*
  SavingsAccountDriver.java
  Simon Dionne-Couture

  This programs is the driver class for SavingsAccount.java
*/
//imports
import java.util.*;

public class SavingsAccountDriver{
  public static void main (String[] args){

    //Initialisation and declaration of saver1 and saver2
    SavingsAccount saver1 = new SavingsAccount(10002, 2000);
    SavingsAccount saver2 = new SavingsAccount(10003, 3000);
    //we set a common interest rate to 5% commonly written 0.05
    SavingsAccount.setAnnualInterestRate(0.05);

    for (int i = 0; i < /*???*/ ) {
      System.out.printf("%d, %i, %.2f, %d, %.2f", i , saver1.getAccountNumber(),
      saver1.getBalance(), saver2.getAccountNumber(), saver2.getBalance());

      saver1.addInterest();
      saver2.addInterest();
    }
    printHeader();

  }
}
