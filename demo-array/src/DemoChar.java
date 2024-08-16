public class DemoChar {
  public static void main(String[] args) {
    char c = 'A';
    int x = c;
    System.out.println(x);

float f3 = 'c';
System.out.println(f3);

    // Overflow
    double d10 = 10.25;
    int x1 = (int) d10;
    System.out.println(x1); // 10.25 --> 10
    d10 = 10.99;
    x1 = (int) d10;
    System.out.println(x1); // 10.99 --> 10

  }
  
}
