import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    // System.out.println("Please input a number: ");

    // int input = s.nextInt();

    double currentBalance = 300.0;

    System.out.println("Choose an option: 1) Deposit 2) Withdraw 3) Check Balance");
    int input = s.nextInt();
    if(input == 1) {
      System.out.println("Please input the deposit amount.");
      input = s.nextInt();
      System.out.println("Balace after deposit: " + (currentBalance + input));
    } else if(input == 2) {
      System.out.println("Please input withdrawal amount:");
      input = s.nextInt();
      System.out.println("Balance after withdrawal: " + (currentBalance - input));
    } else if(input == 3) {
      System.out.println("Current balance is: " + currentBalance);
    }

  }
}
