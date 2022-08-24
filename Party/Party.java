/*
  Party.java
  Simon Dionne-Couture

  This program builds a guest list for a Party host
*/
import java.util.*;
public class Party {
  String guest;
  String hostName;
  List <String> guestList = new ArrayList<String>();
	final int maxNumOfGuest;
  int numOfGuest;
/**********************************************************
  Party constructor setting maxNumOfGuest, guestList and hostName
*/
  public Party(int maxNumOfGuest, String hostName){
    this.numOfGuest = 0;
    this.maxNumOfGuest = maxNumOfGuest;
    this.guestList = guestList;
    this.hostName = hostName;
  }

/**********************************************************
  isOnList() Method checks if (guestList.size() == 0) return false else checks
  in the list if name is already on it and return a boolean to addGuest.
*/
  public boolean isOnList (String guest){
    if (this.numOfGuest == 0)//list at 0 means you can add name
      return false;
    else {
      //goes thru this.guestList to check if name match return true
      for( int i = 0; i < this.numOfGuest; i++){
        if (this.guestList.get(i).equals(guest)){
          return true;}         //found a name return true
      }
      // list.size() != 0 && loop didn't find name on the list so returns false.
      return false;
    }
  }
/**********************************************************
  addGuest get a boolean from isOnList() checks for the size and if everythings
  is good then .add(guestName) or displays an appropriate error message.
*/
  public void addGuest (String guest) {
    if ( !isOnList(guest) && this.numOfGuest < this.maxNumOfGuest){
      this.guestList.add(guest);
      this.numOfGuest++;
    }
    else if ( this.numOfGuest == this.maxNumOfGuest)
      System.out.println( //error message PARTY FULL
      guest + " cannot come to the party. The guest list is full."
      );
    else                  //error message GUEST isOnList
      System.out.println(guest + " is already on the guest list.");
  }
/**********************************************************
  print the hostName and the guestList.
*/
  public void printParty(){
    System.out.println("Guest list for " + this.hostName + "'s party:");
    for (String list : this.guestList )
      System.out.println(list);
  }
}
