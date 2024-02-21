package samples;

public class Menu {
  private static final String TITLE = "Menu options: ";
  private Menu() {
  }

  public static void showOptions() {
    System.out.println(TITLE +
            "\n1. Vector exercises " +
            "\n2. Matrix exercises " +
            "\n3. Exit");
  }

  public static void showOptionsVector() {
    System.out.println(TITLE +
            "\n1. Add pairs " +
            "\n2. Validate whether a number is odd or even " +
            "\n3. Validate if the sum of numbers is even or odd " +
            "\n4. Back to");
  }

  public static void showOptionsMatrix() {
    System.out.println(TITLE+
            "\n1. Multiplying square random matrices " +
            "\n2. Display random square random matrices algebraically " +
            "\n3. Back to");
  }

  public static int getOption() {
    return Main.scanner.nextInt();
  }

  public static void selectOptions() {
    showOptions();
    int option = getOption();
    switch (option) {
      case 1:
        selectOptionVector();
        selectOptions();
        break;
      case 2:
        selectOptionMatrix();
        selectOptions();
        break;
      case 3:
        break;
      default:
        selectOptions();
    }
  }

  public static void selectOptionVector(){
    showOptionsVector();
    int option = getOption();
    switch (option) {
      case 1:
        Vector.addPairs(Vector.createVector());
        selectOptionVector();
        break;
      case 2:
        Vector.validateNumber(Vector.createVector());
        selectOptionVector();
        break;
      case 3:
        Vector.validateSum(Vector.createVector());
        selectOptionVector();
        break;
      case 4:
        selectOptions();
        break;
      default:
        selectOptionVector();
    }
  }

  public static void selectOptionMatrix(){
    showOptionsMatrix();
    int option = getOption();
    int[][] oneMatrix;
    int[][] secondMatrix;
    switch (option) {
      case 1:
        oneMatrix = Matriz.createMatrix(Matriz.getSize());
        secondMatrix = Matriz.createMatrix(Matriz.getSize());
        Matriz.showMatrix(Matriz.multiplyMatrices(oneMatrix, secondMatrix));
        selectOptionMatrix();
        break;
      case 2:
        oneMatrix = Matriz.createMatrix(Matriz.getSize());
        secondMatrix = Matriz.createMatrix(Matriz.getSize());
        Matriz.showMatrix(Matriz.multiplyMatrices(oneMatrix, Matriz.transposeMatrix(secondMatrix)));
        selectOptionMatrix();
        break;
      case 3:
        selectOptions();
        break;
      default:
        selectOptionMatrix();
    }
  }
}
