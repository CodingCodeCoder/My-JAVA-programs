/*
  VoucherDriver.java
  Simon Dionne-Couture

  This is the driver class for Voucher.java
*/

import java.util.*;

public class VoucherDriver {
  public static void main(String[] args) {

    //Instances Variables
    Scanner stdin = new Scanner(System.in);
    int menu;
    int maxNumberOfVouchers = 1;
    final int firstVoucher = 1001;
    final int firstCheck = 2001;
    double price;
    String purchaseDate = "";
    String paymentDate = "";
    String account, vendor;


    Voucher.initialize(firstVoucher, firstCheck, maxNumberOfVouchers);

    // <>
    do {
      //Menu Title

      System.out.println("XYZ COMPANY Voucher Manager\n" +
      "\nActivities available:" +
      "\n  1. Create Voucher\n  2. Print Voucher Register\n  3. Issue checks" +
      "\nEnter number of choice (or zero to quit):");
      menu = stdin.nextInt();

      if (menu < 0 || menu > 3){
        System.out.println("Invalid choice. Try again.");
      } else if (menu < 3 || menu >= 0) {
        switch (menu) {
          case 1:
            //System.out.println(Voucher.getFirstVoucher());
            //System.out.println("Enter purchase date (dd/mm/yyyy): ");
            vouchers[0].setPurchaseDate(stdin.next());
            /*System.out.println("Enter amount: $");
            price = stdin.nextDouble();
            System.out.println("Enter name of account to debit: ");
            account = stdin.next();
            System.out.println("Enter name of vendor: ");
            vendor = stdin.next();*/

            break;
          case 2:
            //vouchers.find();
            //System.out.println("Voucher: "+ voucherNum +"Purchase date: " + purchaseDate + "\n");
            break;
          case 3:
            System.out.println("Enter number of voucher to pay: ");
            //System.out.println(vouchers[stdin.nextInt()]);
            break;
          case 0:
            //vouchers[0].printData();
            break;
        }
      }

    } while (menu != 0);

  }
}
