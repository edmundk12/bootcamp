import java.util.Arrays;

public class JavaQuest14 {
  // Given an integer x, return true if x is a palindrome (迴文), and false
  // otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or
  // from right to left

  // Case 1: 13431
  // true

  // Case 2: -123
  // false

  // Case 3: 1
  // true

  // Case 4: 22
  // true

  // Case 5: 1231
  // false

  // Do not change anything in main method
  public static void main(String[] args) {
    boolean res1 = palindrome(13431); // true
    boolean res2 = palindrome(-121); // false
    boolean res3 = palindrome(1); // true
    boolean res4 = palindrome(22); // true
    boolean res5 = palindrome(1231); // false

    System.out.println(res1);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);

  }

  // Code a method here to return true if the integer is palindrome, otherwise
  // false
  public static boolean palindrome(int num) {
    int a = num;
    int count = 0;

    while (a > 0) {
      a = a / 10;
      count++;
    }
    int[] numArr = new int[count];

    a = num;
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = a % 10;
      a = a / 10;
    }
    String s = "";
    for (int i : numArr) {
      s += i;
    }
    return String.valueOf(num).equals(s);
  }
}
