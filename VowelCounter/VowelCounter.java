/*
  VowelCounter.java
  Simon Dionne-Couture

  This program keeps the count for uppercase and lowercase vowels and
  it prints a summary at the end.
*/
import java.util.*;


public class VowelCounter {
  String[][] vowelList = {{"a", "e", "i", "o", "u"},{"A", "E", "I", "O", "U"}};
  int[][] vowelCount = new int[2][5];
  String text;

/*
Constructor initialize array with 0 in each cells
*/
  public VowelCounter() {
    this.vowelCount = vowelCount;
  }

/*
  processLine ─ This method receives a line of text as a parameter and uses
  it to update the vowel counts appropriately.
*/
  public void processLine (String text){
    for (int i=0; i < text.length() ;i++ ) {
      for (int j=0; j < 2; j++) {
        for(int k=0; k < 5; k++){
          if (text.charAt(i) == vowelList[j][k].charAt(0) ){
            this.vowelCount[j][k]++;
          }
        }
      }
    }
  }
/*
  printSummary ─ This method prints a summary of the counts for all vowels
  entered.
*/
  public void printSummary (){
    for(int k=0; k < 5; k++){
      System.out.println(
      vowelList[1][k] + ": " + this.vowelCount[0][k] + " lowercase, " +
      this.vowelCount[1][k] + " uppercase, " + (this.vowelCount[0][k] +
      this.vowelCount[1][k]) + " total.");
    }
  }
}
