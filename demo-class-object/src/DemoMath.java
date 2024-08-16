import java.math.BigDecimal;

public class DemoMath {
  public static void main(String[] args) {
    
    // Max / Min
    int[] arr = new int[] {-3, 6, -1, 100, 4};
    int min = Integer.MAX_VALUE;
    for (int i : arr) {
      min = Math.min(i, min);
      }
    System.out.println(min);

    // Absolute value
    int sum = 0;
    for (int i : arr) {
      sum += i < 0 ? i * -1 : i;
    }
    System.out.println(sum);

    BigDecimal bd1 = new BigDecimal("0.2");
    BigDecimal bd2 = new BigDecimal("0.1");
    double result = bd1.multiply(bd2).doubleValue();
    System.out.println(result);
    }
  }

