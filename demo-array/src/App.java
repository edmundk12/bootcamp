import java.util.Arrays;

public class App {
  public static void main(String[] args) {

    double[] arr = new double[5];
    arr[0] = 2.0;
    arr[1] = 5.0;
    arr[2] = 6.0;
    arr[3] = 4.1;
    arr[4] = 2.0;

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    // Example 1
    int[] arr3 =  new int[3];
    arr3[0] = 3;
    arr3[1] = 6;
    arr3[2] = -4;
    int max = arr3[0];
    int min = arr3[1];

    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
      } else if (arr3[i] < min) {
        min = arr3[i];
      }
    }
    System.out.println("max = " + max + " min = " + min);

    // Example 2

    String[] strings = new String[3];
    strings[0] = "abcd";
    strings[1] = "hello";
    strings[2] = "12309000";
    String strmax = "";

    for (int i = 0; i < strings.length; i++) {
      if (strings[i].length() > strmax.length()) {
        strmax = strings[i];
        } 
    } System.out.println(strmax);

    // Example 3
    double[] prices = new double[4];
    prices[0] = 10.3;
    prices[1] = 7.7;
    prices[2] = 1.5;
    prices[3] = 2.3;
    int[] quantities = new int[4];
    quantities[0] = 10;
    quantities[1] = 2;
    quantities[2] = 5;
    quantities[3] = 5;

    double totalAmount = 0.0;

    for (int i = 0; i < prices.length; i++) {
      totalAmount += prices[i] * quantities[i] ;
    }
    System.out.println(totalAmount);

    // Example 4
    int[] scores = new int[5];
    scores[0] = 79;
    scores[1] = 70;
    scores[2] = 50;
    scores[3] = 100;
    scores[4] = 90;;
    double average = 0;

    for (int i = 0; i < scores.length; i++) {
    average +=  (double) scores[i] / scores.length;
    }
    
    System.out.println(average);

    // Example 5

    int[] arr2 = new int[] {100, -20, 40, 33, 90, 44, 66};
    int[] answers = new int[arr2.length];
    int idx = 0;

    for (int i = 0; i < arr2.length; i++) {
      if (arr2[i] > 40 && arr2[i] % 3 == 0) {
        answers[idx++] = arr2[i];
      }
    }
    System.out.println(Arrays.toString(answers));
    
    // Example 6

    char[] arr4 = new char[4];
    arr4[0] = 'h';
    arr4[1] = 'a';
    arr4[2] = 't';
    arr4[3] = 'f';
    char[] arr5 = new char[arr4.length];

    for (int i = 0; i < arr4.length; i++) {
      arr5[i] = arr4[arr4.length - 1 - i];
    }
    System.out.println(Arrays.toString(arr5));

    // Example 7

    char[] arr6 = new char[] {'9', '4', '3', '2', '1', '0',};
    // char backup;
    char backup = arr6[0];
    for (int i = 0; i < arr6.length; i++) {
      if (i != arr6.length - 1) {
      arr6[i] = arr6[i+1];
      } else {
        arr6[i] = backup;
      }
    }     System.out.println(Arrays.toString(arr6));
    
    // Example 8

    int[] arr7 = new int[] {100, -100, -4, 5, -2, 200, 9};
    int backup1 = arr7[0];


    for (int i = 0; i < arr7.length - 1; i++) {
      if (arr7[i] > arr7[i+1]) {
        backup1 = arr7[i];
        arr7[i] = arr7[i + 1];
        arr7[i + 1] = backup1;
      }
    } System.out.println(Arrays.toString(arr7));

    // Example 9

    int[] arr8 = new int[] {100, -100, -4, 5, -2, 200, 9};
    int sum = 0;
    for (int i = 0; i < arr8.length; i++) {
      sum += arr8[i];
    } 
    System.out.println(sum);

    // Example 10

    long[] arr9 = new long[] {10, 3, -4, 9, 100, 70};
    long backup2 = arr9[0];

    for (int i = 0; i < arr9.length - 1; i++) {
      for (int j = 0; j < arr9.length - i - 1; j++) {
      if (arr9[j] > arr9[j + 1]) {
        backup2 = arr9[j];
        arr9[j] = arr9[j + 1];
        arr9[j + 1] = backup2;
      }
    } System.out.println(Arrays.toString(arr9));
      } 

    // 2D Array
    int[][] arr10 = new int[2][3]; // 2 rows 3 columns
    arr10[1][1] = 100;
    arr10[1][2] = -99;
    arr10[0][1] = 1;
    System.out.println("arr10" + Arrays.deepToString(arr10));

    // for loop --> access 2D array

    for (int i = 0; i < arr10.length; i++) {
      for (int j = 0; j < arr10[0].length; j++) {
        System.out.println("[" + i + "][" + j + "]=" + arr10[i][j]);
      }
    }

    // Example 11

    int[] arr11 = new int[] {9, 4, 2, 2, 3, 9, 3};
    int count = 0;
    for (int i = 0; i < arr11.length; i++) {
      if (arr11[i] == 2) {
        count++;
      }
    }
    System.out.println(count);

    // Example 12

    int[] arr12 = new int[] {9, 4, 2, 2, 0, 3, 9, 9, 3};

    int[] counts = new int[0];
    for (int i = 0; i < arr12.length; i++) {
      counts[arr12[i]]++;
    }
    int max1 = 0;
    int target = -1;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > max1) {
        max1 = counts[i];
        target = i;
      }
    }
    System.out.println(("Max = " + target));



    // for (int i = 0; i < arr12.length; i++) {
    //   if (arr12[i] > max1) {
    //   max1 = arr12[i];
    //   }
    // }
    // for (int i = 0; i < arr12.length; i++) {
    //   if (arr12[i] == max1) {
    //     count1++;
    //   }
    // }
    // System.out.println("Max value is " + max1 + ". And the count is " + count1);

    }
  }


