import java.util.Scanner;

public class largest {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int n1 = sc.nextInt();
    System.out.println("Enter Second number: ");
    int n2 = sc.nextInt();
    System.out.println("Enter third number: ");
    int n3 = sc.nextInt();
    int max = n1;
    if(n2 > max){
      max = n2;
    }
    if(n3 > max){
      max = n3;
    }
    System.out.println("maximum of three numbers = " + max);
  }

}
