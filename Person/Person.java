/*
* Person.java
* Simon Dionne-Couture
*
* This class creates Person Objects and counts when a new Person is created.
*/

//Class Person
public class Person {
  // Instance Variables
  String first, last;
  String fullName;
  // Class variable
  static int numOfPeople = 0;

  //2 Parameters Constructor
  public Person(String first, String last){
    setFirst(first);
    setLast(last);
    Person.numOfPeople++;
  }

  //Parameterless Constructor
  public Person(){
    first = "John";
    last = "Doe";
    setFirst(first);
    setLast(last);
    Person.numOfPeople++;
  }

  //Class Method using Class Variable
  public static int getNumOfPeople() {
    return Person.numOfPeople;
  }

  //Instance Method setFirst, setLast and printFullName()
  public void setFirst(String first){
    this.first = first;
  }
  public void setLast(String last){
    this.last = last;
  }
  public void printFullName() {
    System.out.println(this.first + " " + this.last);
  }
}
