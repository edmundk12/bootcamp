public class DemoWrapperClass {
  public static void main(String[] args) {
    int x = 10;

    // int -> integer
    // Integer i = 10;
    // Integer i2 = new Integer(10);

    Integer [] integers = new Integer[] {10, 8, 4, -3, 7};
    int count = 0;
    for (int i = 0; i < integers.length; i++) {
      if (integers[i].compareTo(new Integer(5)) > 0) {
        count++;
      }
    }
    System.out.println(count);

    Character[] characters = new Character[] {'c', 'g', '0', 'e', '9', '!'};
    count = 0;
    for (int i = 0; i < characters.length; i++) {
      if ((characters[i].compareTo(new Character('0')) <= 9) && (characters[i].compareTo(new Character('0')) >= 0)) {
        count++;
      }
    }
    System.out.println(count);


  }
}
