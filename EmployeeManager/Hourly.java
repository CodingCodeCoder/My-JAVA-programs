/*
  Hourly.java
  Simon Dionne-Couture

  This programs creates a hourly paid employee.

  calculates the earning for an hourly paid employee.

*/
public class Hourly extends Employee{
  //Instance Variables
  int hourlyPay;
  int hoursWorkedThisWeek;
  double overtimeModifier = 0.5;

  //Constructor
  public Hourly (){}

  //Methods
  public void load(int hourlyPay, int hoursWorkedThisWeek){
    this.hourlyPay = hourlyPay;
    this.hoursWorkedThisWeek = hoursWorkedThisWeek;
  } //end of load()

  public double getEarnings(){
    if (this.hoursWorkedThisWeek > 40){
      int extraHours = this.hoursWorkedThisWeek - 40;
      return this.hourlyPay * this.hoursWorkedThisWeek + (extraHours * overtimeModifier * this.hourlyPay);
    } else if(this.hoursWorkedThisWeek <= 40)
      return this.hourlyPay * this.hoursWorkedThisWeek;
      return 0;
  } //end of getEarnings()
  //END Methods

} // end of class
