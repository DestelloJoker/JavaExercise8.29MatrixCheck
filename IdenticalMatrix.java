/*Program Name:IdenticalMatrix.java
 * Authors: Austin P
 * Date last Updated: 8/22/2024
 * Purpose: This program is meant to check if two 3x3 matrices are identical or not.
 */

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;
public class IdenticalMatrix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    final int ArrSize = 3;

    int[][] matrix1 = new int[ArrSize][ArrSize];
    int[][] matrix2 = new int[ArrSize][ArrSize];

    // Prompts the user to enter a 3x3 array
    System.out.println("Enter a 3x3 array: \n Example: \n 1 2 3 \n 4 5 6 \n 7 8 9\n");
    for (int x = 0; x < ArrSize; x++) {
      for (int y = 0; y < ArrSize; y++) {
        matrix1[x][y] = input.nextInt();
      }
    }

    // Prompts the user to enter the second 3x3 array
    System.out.println("Enter a second 3x3 array: \n Example: \n 1 2 3 \n 4 5 6 \n 7 8 9\n");
    for (int x = 0; x < ArrSize; x++) {
      for (int y = 0; y < ArrSize; y++) {
        matrix2[x][y] = input.nextInt();
      }
    }

    // Check if the matrices are identical
    boolean identicalMatrix = equalMatrix(matrix1, matrix2);

    // Display the result
    if (identicalMatrix) {
      System.out.println("The two matrices are identical.");
    } else {
      System.out.println("The two matrices are not identical.");
    }

    input.close();
  }

  // Method to check if two matrices are identical
  public static boolean equalMatrix(int[][] matrix1, int[][] matrix2) {
    // Check if matrices are different lengths
    if (matrix1.length != matrix2.length) {
      return false;
    }

    // Check both matrices for differences
    for (int x = 0; x < matrix1.length; x++) {
      if (matrix1[x].length != matrix2[x].length) {
        return false;
      }
      for (int y = 0; y < matrix1[x].length; y++) {
        if (matrix1[x][y] != matrix2[x][y]) {
          return false;
        }
      }
    }
    // Return true if the matrices are identical
    return true;
  }

}
