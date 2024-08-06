public class DemoPrimitive {
  public static void main(String[] args) {
    
// short s2 = -32769; // out of range
s2 = -32768; // OK
s2 = 32767; // OK
// s2 = 32768; // out of range

    int i1 = 21797;
    long L4 = i1;

    System.out.println(s2);
  }
}
