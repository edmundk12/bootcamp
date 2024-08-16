public class Demolf {
  public static void main(String[] args) {

    // Example 4

    String day = "Saturday";


    boolean result1;
    boolean result2;

    if (day.equals("Saturday")) {
      result1 = false;
    } else {
      result1 = true;
    }
    if (day.equals("Sunday")) {
      result2 = false;
    } else {
      result2 = true;
    }

    if (result1 && result2) {
      System.out.println(day + " is a weekday");
    } else {
      System.out.println(day + " is a weekend");
    }

    // Example 5

    int num = 7;
    if (num % 2 == 1) {
      System.out.println(num + " is odd");
    } else {
      System.out.println(num + " is even");
    }

    // Example 6

    String str = "hello";
    if (str.length() != 0) {
      System.out.println(
          "The last character of str is " + str.charAt(str.length() - 1));
    } else {
      System.out.println("This is an empty string");
    }

    // Example 7

    String s = "abc";

    System.out.println(s.charAt(2) + "" + s.charAt(1) + "" + s.charAt(0));

    // Example 8

    int year = 1900;
    boolean leap1;
    boolean leap2;

    if (year % 4 == 0) {
      leap1 = true;
    } else
      leap1 = false;

    if (year % 100 != 0 || year % 400 == 0) {
      leap2 = true;
    } else
      leap2 = false;

    if (leap1 && leap2 == true) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not leap year");
    }

    // Example 9

    int age = 20;
    boolean isCitizen = false;


    if (age >= 18 && isCitizen == true) {
      System.out.println("Eligible to vote.");
    } else if (age < 18 && isCitizen == true) {
      System.out.println("Not eligible. Age < 18");
    } else if (age >= 18 && isCitizen == false) {
      System.out.println("Not eligible. Not a citizen.");
    } else {
      System.out.println("Not eligible. Age < 18 and not a citizen");
    }

    // Example 10

    double totalPurchase = 250.0;
    double discount;

    if (totalPurchase >= 500.0) {
      discount = totalPurchase * 0.8;
    } else if (totalPurchase >= 200.0 && totalPurchase < 500.0) {
      discount = totalPurchase * 0.9;
    } else {
      discount = 0;
    }
    double amountToPay = totalPurchase - discount;
    System.out.println("Discount amount=" + discount);
    System.out.println("Amount to Pay=" + amountToPay);


    // Example 11

    char c = 'a';
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      System.out.println(c + " is a vowel");
    } else {
      System.out.println(c + " is a constant");
    }

    // Example 12

    String password = "Admin@8887";

    if ((password.contains("#") || password.contains("!")
        || password.contains("@")
        || password.contains("$")) && password.length() >= 12) {
      System.out.println("It is a strong password");
    } else if ((password.contains("#") || password.contains("!")
    || password.contains("@")
    || password.contains("$") && password.length() < 12)) {
      System.out.println("It is a weak password. Length < 12");
    } else if (password.contains("#") || password.contains("!")
    || password.contains("@")
    || password.contains("$") == false && password.length() >= 12) {
      System.out.println("It is a weak password. No special characters");
    } else {
      System.out.println("It is a weak password. No special characters and length < 12.");
    }
  }
}
