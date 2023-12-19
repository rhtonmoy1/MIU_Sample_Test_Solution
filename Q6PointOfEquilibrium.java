// Consider an array A with n of positive integers. An integer idx is called a POE 
// (point of equilibrium) of A, if A[0] + A[1] + … + A[idx – 1] is equal to A[idx + 1] + A[idx + 2] + … + A[n – 1]. 
// Write a function to return POE of an array, if it exists and -1 otherwise. 
// The signature of the function is:
// int f(int[] a)

public class Q6PointOfEquilibrium {

  static int f(int[] a) {
    for (int idx = 0; idx < a.length; idx++) {
      int sumLeft = 0;
      int sumRight = 0;

      // Calculate sum of elements to the left of idx
      for (int i = 0; i < idx; i++) {
        sumLeft += a[i];
      }

      // Calculate sum of elements to the right of idx
      for (int i = idx + 1; i < a.length; i++) {
        sumRight += a[i];
      }

      // Check if it's a Point of Equilibrium
      if (sumLeft == sumRight) {
        return idx;
      }
    }

    // No Point of Equilibrium found
    return -1;
  }

  public static void main(String[] args) {
    int[] a1 = { 1, 8, 3, 7, 10, 2 };
    int[] a2 = { 1, 5, 3, 1, 1, 1, 1, 1, 1 };
    int[] a3 = { 2, 1, 1, 1, 2, 1, 7 };
    int[] a4 = { 1, 2, 3 };
    int[] a5 = { 3, 4, 5, 10 };
    int[] a6 = { 1, 2, 10, 3, 4 };

    System.out.println(f(a1));
    System.out.println(f(a2));
    System.out.println(f(a3));
    System.out.println(f(a4));
    System.out.println(f(a5));
    System.out.println(f(a6));
  }
}
