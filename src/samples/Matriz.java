package samples;

public class Matriz {
  public static int getSize() {
    System.out.println("Enter the dimension of the square matrices: ");
    return Main.scanner.nextInt();
  }

  public static int[][] createMatrix(int matrixSize) {
    int[][] numbers = new int[matrixSize][matrixSize];
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        numbers[i][j] = (int) (Math.random() * 100 + 1);
      }
    }

    return numbers;
  }

  public static int[][] multiplyMatrices(int[][] oneMatrix, int[][] secondMatrix) {
    int[][] multipliedMatrix = new int[oneMatrix.length][oneMatrix.length];
    for (int i = 0; i < multipliedMatrix.length; i++) {
      for (int j = 0; j < multipliedMatrix.length; j++) {
        multipliedMatrix[i][j] = oneMatrix[i][j] * secondMatrix[i][j];
      }
    }
    return multipliedMatrix;
  }

  public static int[][] transposeMatrix(int[][] matrix) {
    int[][] transposedMatrix = new int[matrix.length][matrix.length];
    showMatrix(matrix);
    for (int i = 0; i < transposedMatrix.length; i++) {
      for (int j = 0; j < transposedMatrix.length; j++) {
        transposedMatrix[i][j] = matrix[j][i];
      }
    }
    showMatrix(transposedMatrix);
    return transposedMatrix;
  }

  public static void showMatrix(int[][] matrix) {
    System.out.println("The multiplied matrix is:\n");
    for (int[] ints : matrix) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print("|" + ints[j] + "\t");
      }
      System.out.println("|");
    }
  }
}
