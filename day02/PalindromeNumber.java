import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENter a number: ");
    int n = sc.nextInt();
    int reversedNumber = 0;
    int num = n;
    while(n>0){
      int rem = n%10;
      reversedNumber = ( reversedNumber *10) + rem;
      n = n/10;
    }
    if(num == reversedNumber){
      System.out.println("Plaindrome");
    }else {
      System.out.println("not Plaindrome");
    }
  }
}
