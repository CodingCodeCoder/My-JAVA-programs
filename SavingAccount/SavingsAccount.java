/*
  SavingsAccount.java
  Simon Dionne-Couture

  This programs creates a Saving account
*/
public class SavingsAccount{
  //Class Variables
  private static double annualInterestRate;
  private double balance;
  //Instance Variables

  private final int ACCOUNT_NUMBER;

  //Constructors
  public SavingsAccount(int accountNumber, double balance){
    this.ACCOUNT_NUMBER = accountNumber;
    this.balance = balance;
  }
  //Methods
  public double getBalance(){
    return this.balance;
  }

  public int getAccountNumber(){
    return this.ACCOUNT_NUMBER;
  }
  //adds 1 month of interest to this.balance
  public void addMonthlyInterest(){
    this.balance = (this.balance * annualInterestRate / 12) + this.balance;
  }
  //Class Method
  public static void setAnnualInterestRate(double InterestRate){
    //must read on class method
    annualInterestRate = InterestRate;
  }
  public static double getAnnualInterestRate(){
    return annualInterestRate;
  }

  public static void print(){
    //String[] printOneYear = new String[13]; //13 to include 1 line for initial balance
    printHeader();
    /*
    System.out.println(saver1.getBalance() + saver2.getBalance())
*/
  }
  public static void printHeader(){
    //prints this
    System.out.printf("'%s%1s#%3s%1s%1s%3s%1s%3s%1s%3s'","Account",
    "Balance", "Account", "#" ,"Balance\n","-----","---------","-------",
    "---------","-------");
    ;
    /*Monthly balances for one year with 0.05 annual interest:

Month Account #   Balance Account #   Balance
----- ---------   ------- ---------   -------
    0     10002   2000.00     10003   3000.00
    1     10002   2008.33     10003   3012.50
    2     10002   2016.70     10003   3025.05
    3     10002   2025.10     10003   3037.66
    4     10002   2033.54     10003   3050.31
    5     10002   2042.02     10003   3063.02
    6     10002   2050.52     10003   3075.79
    7     10002   2059.07     10003   3088.60
    8     10002   2067.65     10003   3101.47
    9     10002   2076.26     10003   3114.39
   10     10002   2084.91     10003   3127.37
   11     10002   2093.60     10003   3140.40
   12     10002   2102.32     10003   3153.49*/
  }
}
