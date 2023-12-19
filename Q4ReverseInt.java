// Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.
// The signature of the function is:
// int f(int n)

public class Q4ReverseInt {

  static int f(int n) {
    int isPositive = 1;
    if (n == 0) {
      return 0;
    }
    if (n < 0) {
      isPositive = -1;
      n = -n;
    }
    int reverse = 0;
    while (n != 0) {
      reverse = (reverse * 10) + (n % 10);
      n /= 10;
    }
    return isPositive * reverse;
  }

  public static void main(String[] args) {
    System.out.println(f(1234));
    System.out.println(f(12005));
    System.out.println(f(1));
    System.out.println(f(1000));
    System.out.println(f(0));
    System.out.println(f(-12345));
  }
}
