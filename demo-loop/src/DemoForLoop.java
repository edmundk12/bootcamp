public class DemoForLoop {
  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) {
          System.out.println(10 - i);
        }
    }

    // Example 5

    String str = "abcdefghijk";
    String str2 = "";
    for (int i = 0; i < str.length(); i++) {
    if(i % 2 == 0)
      str2 += str.charAt(i);
    }
    System.out.println(str2);

    // Example 6
    String s2 = "bbaeaaacceef";
    byte count = 0;
    char target = 'e';
    for (int i = 0; i < s2.length(); i++) {
      if(s2.charAt(i) == target) {
        count++;
      }
    }
    System.out.println(count);

    // Example 7

    byte count1 = 0;
    for (int i = 1; i < 101; i++) {
      if ( i % 3 == 0 || i % 4 == 0) {
        count1++;
      }
    }
    System.out.println(count1);

    // Example 8

    byte odd = 0;
    byte even = 0;
    for (int i = 1; i < 51; i++) {
      if (i % 2 == 1) {
        odd++;
      } else;
      even++;
      }
      System.out.println(odd - even);

      // Example 9
      String s3 = "abcdxyzijk";
      byte count2 = 0;
      for ( int i = 0; i < s3.length(); i++) {
        if (s3.charAt(i) != 'j') {
          count2++;
        } 
      } 
      if (count2 > 0) {
        System.out.println(count2);
      } else {
        System.out.println("-1");
      }

      // Example 10

      String s4 = "hello";
      char targetEndWith = 'o';
      System.out.println(s4.charAt(s4.length() - 1) == targetEndWith);

      // String Operators
      //endsWith() //startsWith() // contains() // substring() // indexOf() //


      // Example 11

      String s6 = "abcdefghik";
      String subString = "def";
      for ( int i = 0; i < s6.length(); i++) {
        // if(subString.substring(i, ))
      }

      // Example 12

      String s7 = "ijkdef";
      boolean found = false;
      for (int i = 0; i < s7.charAt(i); i++) {
        if (s7.charAt(i) == 'k') {
          found = true;
          break;
        }
      }

      // Example 13

      for (int i = 5; i > 0; i--) {
        for (int j = 0; j < i ; j++) {
          System.out.print("*");
          }System.out.println("");
        }
      // Alternative, (int i,j = 0)
      // for (in i = 0; i<5; i++)
      // for ( int j = 0; j < 5 - i; j++)

        // Example 14

        for ( int i = 0; i < 50; i++) {
          if (i % 2 == 0)
          continue;
        }

        // Challenge

        String searchMe =  "psenifeipepfeoofpefmkfn";
        int num = 0;
        for (int i = 0; i < searchMe.length(); i++) {
          if (searchMe.charAt(i) == 'p') {
            num++;
          }
        }
        System.out.println(num++);


        String jewels = "aA";
        String stones = "aAAbbbb";
        int count33 = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length();j++) {
                if(stones.charAt(j) == jewels.charAt(i)) {
                    count33++;
                    System.out.println("i= " + i + "j= " + j + "count= " + count33);
                }
              }
            }
         System.out.println(count33);
            

      } 

    }
  

