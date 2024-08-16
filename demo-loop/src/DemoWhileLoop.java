import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  public static void main(String[] args) {
    
    int count = 0;
    int sum = 0;
    while (count < 5) {
    sum += count;
    count++;
    }
    System.out.println(sum);

    // int value = new Random().nextInt(5) + 1;
    // System.out.println(value);

    // Scanner scanner = new Scanner(System.in);
    // int number = -1;
    // while(number != value) {
    //   System.out.println("Please input a number between 1 - 5: ");
    //   number = scanner.nextInt();
    // }
    // System.out.println("Nice");

    // Leetcode Example

    int code = 1234;
    int a = code;
    int arrLength = 0;
    int idx = 0;

    while (a > 0) {
      a = a / 10;
      arrLength++;
    }
    char[] codes = new char[arrLength];

    a = code;
    while (a > 0) {
      codes[idx] = (char) (a % 10 + '0');
      idx++;
      a = a / 10;
    }


    char backup = ' ';
    for (int i = 0; i < codes.length / 2;i ++) {
      backup = codes[i];
      codes[i] = codes[codes.length - i -1];
      codes[codes.length - i -1] = backup;
    }
    System.out.println(Arrays.toString(codes));
  }
}
