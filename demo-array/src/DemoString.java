import java.util.Arrays;

public class DemoString {
  public static void main(String[] args) {
    
    //isEmpty()

    String s1 = "hello";
    System.out.println(s1.isEmpty()); // false
    System.out.println(s1.isBlank()); // false

    String s2 = "";
    System.out.println(s2.isEmpty()); // true
    System.out.println(s2.isBlank()); // true

    String s3 = " ";
    System.out.println(s3.isEmpty()); // false
    System.out.println(s3.isBlank()); // true

    System.out.println("abc".compareTo("abc"));

    String result = "";
    char[] characters1 = "abc".toCharArray();
    for (int i = 0; i < characters1.length; i++) {
      result += (char) (characters1[i] + 2);
    }
    System.out.println(result);

    String jenny = "Jenny";
    int idx = -1;
    for (int i = 0; i < jenny.length(); i++) {
      if (jenny.charAt(i) == 'n') {
        idx = i;
      }
    }
    System.out.println(idx);

    int[] arr = new int[] {1,2,3};
    int[] arr1 = new int[] {4,5,6};

    arr1 = arr;
    arr = new int[] {4,5,6};
    System.out.println(Arrays.toString(arr1));






  }
}
