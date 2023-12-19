// Write a function to return an array containing all elements common to two given arrays
// containing distinct positive integers. You should not use any inbuilt methods.
// You are allowed to use any number of arrays.
// The signature of the function is:
// int[] f(int[] first, int[] second)

import java.util.Arrays;

public class Q5MargeCommon {

  static int[] f(int[] first, int[] second) {
    if (first == null || second == null) return null;
    int n1 = first.length;
    int n2 = second.length;
    if (n1 == 0 || n2 == 0) return new int[0];
    int min = (n1 < n2 ? n1 : n2);
    int[] a, b;
    if (min == n1) {
      a = first;
      b = second;
    } else {
      a = second;
      b = first;
    }
    int[] common = new int[min];
    int k = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          common[k] = a[i];
          k++;
        }
      }
    }
    int[] ans = new int[k];
    for (int x = 0; x < ans.length; x++) {
      ans[x] = common[x];
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] a1 = { 1, 8, 3, 2 };
    int[] a2 = { 4, 2, 6, 1 };
    int[] result1 = f(a1, a2);
    System.out.println(Arrays.toString(result1));

    int[] b1 = { 1, 8, 3, 2, 6 };
    int[] b2 = { 2, 6, 1 };
    int[] result2 = f(b1, b2);
    System.out.println(Arrays.toString(result2));

    int[] c1 = { 1, 3, 7, 9 };
    int[] c2 = { 7, 1, 9, 3 };
    int[] result3 = f(c1, c2);
    System.out.println(Arrays.toString(result3));

    int[] d1 = { 1, 2 };
    int[] d2 = { 3, 4 };
    int[] result4 = f(d1, d2);
    System.out.println(Arrays.toString(result4));

    int[] e1 = {};
    int[] e2 = { 1, 2, 3 };
    int[] result5 = f(e1, e2);
    System.out.println(Arrays.toString(result5));

    int[] f1 = { 1, 2 };
    int[] f2 = {};
    int[] result6 = f(f1, f2);
    System.out.println(Arrays.toString(result6));

    int[] g1 = { 1, 2 };
    int[] g2 = null;
    int[] result7 = f(g1, g2);
    System.out.println(Arrays.toString(result7));

    int[] h1 = null;
    int[] h2 = {};
    int[] result8 = f(h1, h2);
    System.out.println(Arrays.toString(result8));

    int[] i1 = null;
    int[] i2 = null;
    int[] result9 = f(i1, i2);
    System.out.println(Arrays.toString(result9));
  }
}
