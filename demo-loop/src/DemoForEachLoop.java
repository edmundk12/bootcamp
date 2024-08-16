public class DemoForEachLoop {
  public static void main(String[] args) {
    
    // For-loop

    int[] arr = new int[] {2, 9, 10, -3};
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.println(arr[i]);
    // }

    // For-each loop

    for (int i : arr) {
      System.out.println(i);
    }

    String[] fruit = new String[] {"apple", "orange", "lemon"};
    for (String i : fruit) {
      if (i.charAt(0) == 'a') {
        continue;
      }
      System.out.println(i);
    }

    int[] dd = new int[] {1,3,5};
    String s = "";
    for (int i : dd) {
      s += i;
    }
    System.out.println(s);
    System.out.println(s.valueOf());
  }
}
