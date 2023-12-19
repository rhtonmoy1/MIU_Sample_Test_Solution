// Write a function that accepts a character array, a zero-based start position and a length.
// It should return a character array containing containing lengthcharacters
// starting with the startcharacter of the input array.
// The function should do error checking on the start position and the length
// and return null if the either value is not legal.
// The function signature is:
// char[ ] f(char[ ] a, int start, int len)

import java.util.Arrays;

class Q3CharIndexArray {

  static char[] f(char[] a, int start, int len) {
    if (start < 0 || len < 0 || start + len > a.length) {
      return null;
    }
    char[] ans = new char[len];
    for (int i = start, j = 0; j < len; i++, j++) {
      ans[j] = a[i];
    }
    return ans;
  }

  public static void main(String[] args) {
    char[] a1 = { 'a', 'b', 'c' };
    char[] a2 = {};
    System.out.println(Arrays.toString(f(a1, 0, 4)));
    System.out.println(Arrays.toString(f(a1, 0, 3)));
    System.out.println(Arrays.toString(f(a1, 0, 2)));
    System.out.println(Arrays.toString(f(a1, 0, 1)));
    System.out.println(Arrays.toString(f(a1, 1, 3)));
    System.out.println(Arrays.toString(f(a1, 1, 2)));
    System.out.println(Arrays.toString(f(a1, 1, 1)));
    System.out.println(Arrays.toString(f(a1, 2, 2)));
    System.out.println(Arrays.toString(f(a1, 2, 1)));
    System.out.println(Arrays.toString(f(a1, 3, 1)));
    System.out.println(Arrays.toString(f(a1, 1, 0)));
    System.out.println(Arrays.toString(f(a1, -1, 2)));
    System.out.println(Arrays.toString(f(a1, -1, -2)));
    System.out.println(Arrays.toString(f(a2, 0, 1)));
  }
}
