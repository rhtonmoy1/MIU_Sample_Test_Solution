// Write a function that takes an array of integers as an argument and returns a value based on the sums 
// of the even and odd numbers in the array. 
// Let X = the sum of the odd numbers in the array and let 
// Y = the sum of the even numbers. 
// The function should return X – Y
// The signature of the function is:
// int f(int[ ] a)

public class Q2OddEven {

  static int f(int[] a) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != 0) {
        x += a[i];
      } else {
        y += a[i];
      }
    }
    return x - y;
  }

  public static void main(String[] args) {
    int[] a1 = { 1 };
    int[] a2 = { 1, 2 };
    int[] a3 = { 1, 2, 3 };
    int[] a4 = { 1, 2, 3, 4 };
    int[] a5 = { 3, 3, 4, 4 };
    int[] a6 = { 3, 2, 3, 4 };
    int[] a7 = { 4, 1, 2, 3 };
    int[] a8 = { 1, 1 };
    int[] a9 = {};
    System.out.println(f(a1));
    System.out.println(f(a2));
    System.out.println(f(a3));
    System.out.println(f(a4));
    System.out.println(f(a5));
    System.out.println(f(a6));
    System.out.println(f(a7));
    System.out.println(f(a8));
    System.out.println(f(a9));
  }
}
