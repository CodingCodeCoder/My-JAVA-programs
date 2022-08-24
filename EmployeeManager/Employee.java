/*
  Employee.java
  Simon Dionne-Couture

  This programs creates an Employee with name, socialSecNum,
  birthdayWeek, birthdayMonth.
  Also calculates the bonus and the toString remodel method.
*/
public abstract class Employee{
  //Instance Variables
  private String name, socialSecNum;
  private int birthdayMonth, birthdayWeek;
  private final int bonus = 100;
  //End Instance Variables

  //Constructor
  public Employee(){};
  //End Constructor
  //Methods
  public void load(String name, String socialSecNum, int birthdayMonth, int birthdayWeek){
    this.name = name;
    this.socialSecNum = socialSecNum;
    this.birthdayMonth = birthdayMonth;
    this.birthdayWeek = birthdayWeek;
  }

  //getters
  public String getName(){return this.name;}
  public String getSocialSecNum(){return this.socialSecNum;}
  public int getBonus(){
    if (this.birthdayMonth == 10 && this.birthdayWeek == 2){
      return bonus;
    } else
      return 0;
  }

  //toString method remodel for a specific format.
  public String toString(String name, String socialSecNum, double payCheck){
    return String.format("\nEmployee: %s\nSocial security number: %s\nPaycheck: $%.2f\n", name, socialSecNum, payCheck);
  }

  //abstract method
  public abstract double getEarnings();
  //END METHODS
}
