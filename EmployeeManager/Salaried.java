/*
  Salaried.java
  Simon Dionne-Couture

  This programs creates a Salaried paid employee
  and calculates the earning.
*/
public class Salaried extends Employee{
  //Instance Variables
  private int weeklySalary;

  //Constructor
  public Salaried(){ }
  //end Constructor

  //Methods
  public void load(int weeklySalary){
    //Prompts the user for instance-variable values and loads the entries.
    this.weeklySalary = weeklySalary;
  }//end load()

  public int getWeeklySalary(){
    return this.weeklySalary;
  } //end getWeeklySalary()

  public double getEarnings(){
    return this.weeklySalary;
  }//end getEarnings()
  //end Methods
}
