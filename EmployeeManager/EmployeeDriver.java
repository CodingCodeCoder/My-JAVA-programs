
import java.util.*;

public class EmployeeDriver{
  public static void main(String[] args){
    String name = "";
    String summary = "";
    String socialSecNum;
    Salaried salaried = new Salaried();
    Hourly hourly = new Hourly();
    SalariedPlusCommission salariedPlusCommission = new SalariedPlusCommission();

    Scanner userInput = new Scanner(System.in);
    System.out.println("Number of Employee: ");
    int numberOfEmployee = userInput.nextInt();
    //for loop to menu
    for (int i= 0; i < numberOfEmployee; i++ ) {
      System.out.printf("PROFILE FOR EMPLOYEE #%d:\n type Hourly(1), Salaried(2), Salaried plus Commission(3)\nEnter 1, 2, or 3",i + 1);

      int menu = userInput.nextInt();

      System.out.println("Name:");
      do {
        name = userInput.nextLine();
      } while (name == "");
      System.out.println("Social security Number:");
      socialSecNum = userInput.nextLine();
      System.out.println("Birthday month(1-12):");
      int birthdayMonth = userInput.nextInt();
      System.out.println("Birthday week(1-4):");
      int birthdayWeek = userInput.nextInt();

      switch (menu) {
        case 1:
          System.out.println("Hourly pay:");
          int hourlyPay = userInput.nextInt();
          System.out.println("Hours worked this week:");
          int hoursWorkedThisWeek = userInput.nextInt();
          hourly = new Hourly();
          hourly.load(name, socialSecNum, birthdayMonth, birthdayWeek);
          hourly.load(hourlyPay, hoursWorkedThisWeek);
          summary =  summary + hourly.toString(name, socialSecNum, hourly.getEarnings()+hourly.getBonus());
          break;
        case 2:
          System.out.println("Salary:");
          int weeklySalary = userInput.nextInt();
          salaried = new Salaried();
          salaried.load(name, socialSecNum, birthdayMonth, birthdayWeek);
          salaried.load(weeklySalary);
          summary =  summary + salaried.toString(name, socialSecNum, salaried.getEarnings()+salaried.getBonus());
          break;
        case 3:
          System.out.println("Salary");
          int salary = userInput.nextInt();
          System.out.println("Sales for this past week");
          int sales = userInput.nextInt();
          System.out.println("Sales commission rate (fraction paid to employee)");
          double commissionRate = userInput.nextDouble();
          salariedPlusCommission = new SalariedPlusCommission();
          salariedPlusCommission.load(name, socialSecNum, birthdayMonth, birthdayWeek);
          salariedPlusCommission.load(salary);
          salariedPlusCommission.load(sales, commissionRate);
          summary =  summary + salariedPlusCommission.toString(name, socialSecNum, salariedPlusCommission.getEarnings()+salariedPlusCommission.getBonus());
          break;
      } //end of switch

    } // end of for loop
    System.out.println(summary);
  } // end of main
}//end
