
import java.util.*;
/*
int newarr[] = new int[n + 1];
  for (i = 0; i < n; i++)
            newarr[i] = arr[i];
*/
// <>

public class Voucher extends VoucherDriver{

static int voucherNum;
int checkNumber;
double amount;
String purchaseDate, paymentDate, debitAccount, vendor;
int maxNumberOfVouchers;
int firstVoucher;
int firstCheck;
/*
  initialize
*/
  public static void initialize (int firstVoucher, int firstCheck, int maxNumberOfVouchers){

    Voucher[] vouchers = new Voucher[maxNumberOfVouchers];
    //System.out.println(vouchers[0].firstVoucher);

    //vouchers[maxNumberOfVouchers-1].setFirstVoucher(firstVoucher);
    //vouchers[0].firstCheck = firstCheck;
    //vouchers[0].maxNumberOfVouchers = maxNumberOfVouchers;
    //System.out.println(this.firstVoucher);
  }

  public Voucher(){
    //the constructor searches for the first null in vouchers[]
    this.firstVoucher = firstVoucher;
    this.firstCheck = firstCheck;
    this.maxNumberOfVouchers = maxNumberOfVouchers;

    maxNumberOfVouchers++;
  }

  public String getPurchaseDate(){
    return purchaseDate;
  }

  public void setPurchaseDate(String purchaseDate){
    this.purchaseDate = purchaseDate;
    //vouchers[maxNumberOfVouchers].purchaseDate = purchaseDate;
  }
  public void setFirstVoucher(int firstVoucher){
      this.firstVoucher = firstVoucher;
  }

  public int getFirstVoucher(){
    return firstVoucher;
  }




  public int nextVoucherNumber(){
    return voucherNum++;
  }
  public int nextCheckNumber(){
    return checkNumber++;
  }
  public void issueCheck(){
    /*if(amount > 0.0 && vendor != null){} else { }*/

  }
  public void find(){

  }
  public void printData(){
    System.out.println(this);
    System.out.println("END");
  }
}
