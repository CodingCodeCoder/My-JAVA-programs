/*
  PartyDriver.java
  Simon Dionne-Couture

  Driver class for Party.java
*/
public class PartyDriver {
  public static void main(String[] args){
    Party party = new Party(3, "David Beckham");
    party.addGuest("Roberto Baggio");// should proceed
    party.addGuest("Zinedine Zidane");//should proceed
    party.addGuest("Roberto Baggio");//Error already there
    party.addGuest("Johan Cruyff");//should proceed
    party.addGuest("Diego Maradona");//error full
    party.printParty();
  }
} //end of main
