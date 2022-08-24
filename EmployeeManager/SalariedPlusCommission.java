/*
  SalariedPlusCommission.java
  Simon Dionne-Couture

  This programs creates a Salaried + Commission paid employee
  and calculates the earning.

*/
public class SalariedPlusCommission extends Salaried{
  //Instance Variables
  private int pastWeekSales;
  private double commissionRate;

  //Constructor
  public SalariedPlusCommission(){}

  //Methods
  public void load(int pastWeekSales, double commissionRate){
    this.pastWeekSales = pastWeekSales;
    this.commissionRate = commissionRate;
  }//end load()

  public double getEarnings(){
    if (this.getWeeklySalary() + (this.pastWeekSales * this.commissionRate) >1000 )
      return 1000;//max $1000 paycheck
    else
      return this.getWeeklySalary() + (this.pastWeekSales * this.commissionRate);
  }//end getEarnings()
  //End class
