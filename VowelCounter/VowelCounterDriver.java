/*
  VowelCounterDriver.java
  Simon Dionne-Couture

  This is the Driver Class for VowelCounter Class
  It basically loops to scan user input until text = "" then count.printSummary
*/
import java.util.*;

public class VowelCounterDriver {

  public static void main(String[] args){
    /*main – Repeatedly prompt the user to enter a line of text or press enter by
    itself to quit. Note that the stdIn.nextLine() method returns the empty
    string ("") if the user presses enter by itself. For each entered line of
    text, call the processLine method. When the user chooses to quit, call
    printSummary.*/

    VowelCounter count = new VowelCounter();
    String text;

    Scanner stdIn = new Scanner(System.in);

    do {
       System.out.println("Enter phrase:");
       text = stdIn.nextLine();
       count.processLine(text);
    } while ( text != "");
    count.printSummary();

  } //end of main
}
