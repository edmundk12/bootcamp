public class DemoStaticMethod {
  public static String outputString(String a) {
    String result = "";
    char[] characters1 = a.toCharArray();
    for (int i = 0; i < characters1.length; i++) {
      result += (char) (characters1[i] + 2);
  }
  return result;
}

public static double calculateCircleArea(double radius) {
  return Math.pow(radius, 2)*Math.PI;
}
  public static void main(String[] args) {

  System.out.println(calculateCircleArea(5));



    
    

  }
}
