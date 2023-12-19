// An array with an odd number of elements is said to be centered if all elements (except the middle one) 
// are strictly greater than the value of the middle element. Note that only arrays with an odd number 
// of elements have a middle element. Write a function that accepts an integer array and returns 1 if it is a centered array, 
// otherwise it returns 0.

class Q1Center {

  static int center(int[] arr) {
    int l = arr.length;
    int mid = arr.length / 2;
    if (arr == null || l % 2 == 0) {
      return 0;
    }
    for (int i = 0; i < l; i++) {
      if (i != mid && arr[i] <= arr[mid]) {
        return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    int[] a1 = { 1, 2, 3, 4, 5 };
    int[] a2 = { 3, 2, 1, 4, 5 };
    int[] a3 = { 3, 2, 1, 4, 1 };
    int[] a4 = { 1, 2, 3, 4 };
    int[] a5 = {};
    int[] a6 = { 10 };
    int ans1 = center(a1);
    System.out.println(ans1);
    int ans2 = center(a2);
    System.out.println(ans2);
    int ans3 = center(a3);
    System.out.println(ans3);
    int ans4 = center(a4);
    System.out.println(ans4);
    int ans5 = center(a5);
    System.out.println(ans5);
    int ans6 = center(a6);
    System.out.println(ans6);
  }
}
