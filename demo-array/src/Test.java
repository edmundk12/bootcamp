public class Test {
  public static void main(String[] args) {
    String s = "hello";
    String n = "";
    int k = 3;
    for (int i = 0; i < s.length(); i++) {
      n += s.charAt((i + k) % s.length());
        }
        System.out.println(n);
  }

}

