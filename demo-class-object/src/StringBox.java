public class StringBox {
  private char[] characters;

  public StringBox(String s) {
    this.characters = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
        this.characters[i] = s.charAt(i);
    }
  }

  public void setCharAt(int index, char x) {
    this.characters[index] = x;
  }

  public char charAt(int index) {
    return this.characters[index];
  }

  public int length() {
    return this.characters.length;
  }

  public int indexOf(char c) {
    for (int i : characters) {
      if (characters[i] == c) {
        return i;
      }
    }
    return -1;
  }

  public String replace(char oldChar, char newChar) {
    char[] arr = new char[this.characters.length];
    for (int i : arr) {
      if (characters[i] == oldChar) {
        characters[i] = newChar;
        // arr[i] = this.characters[i] == oldChar ? newChar : this.characters[i];
      } else {
        characters[i] = characters[i];
      }
    }
    return String.valueOf(arr);
  }

  public String subString(int begIdx, int endIdx) {
    char[] cc = new char[endIdx - begIdx];
    int count = 0;
    int idx = 0;
    while(count > endIdx - begIdx) {
      cc[idx] = this.characters[begIdx];
      count--;
    }
    return String.valueOf(cc);
  }

  public static void main(String[] args) {
    StringBox str = new StringBox("frffienffd");
    String friend = str.replace('f', 'd');
    System.out.println(str);
    System.out.println(str.replace('f', 'd'));
    System.out.println(str.substring(2, 4));
    str.setCharAt(1,'c'); 
    System.out.println(str);

  }
}
