public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    int idx = 0;


    // if not found, print "Not Found."
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        idx = i;
      }
    }
      System.out.println("The index of the last character of " + target + " is " + idx);

      int num = 12321;
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
      System.out.println(s);
      System.out.println(String.valueOf(numArr));
  }
}