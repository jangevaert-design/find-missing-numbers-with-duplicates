public class FindMissingNumbersWithDuplicates {
/*
Find missing numbers in an int[] with duplicates.

  input: {1, 1, 2, 3, 5, 7, 9, 9, 9};
  output: 4, 6, 8;
 */

  //This solution works for the given array but does not with a different array? Why??
  public static void main(String[] args) {
    int[] input = {1, 1, 2, 4, 5, 7, 9, 9, 9};

    //create a new int array. By default, this will be filled with zeros.
    int max = 0;


    for (int i = 0; i < input.length; i++) {
      max = Math.max(i, i + 1);
    }
    int[] register = new int[max + 1];
    for (int i : input) {
      register[i] = 1;
    }
    System.out.println("missing numbers in a given array: ");
    for (int i = 0; i < register.length; i++) {
      if (register[i] == 0 && i != 0) {
        System.out.println(i);
      }

    }
  }
}
