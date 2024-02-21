package samples;

public class Vector {
  public static int[] createVector() {
    int[] numbers = new int[3];
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Enter the number " + (i + 1) + ":");
      numbers[i] = Main.scanner.nextInt();
    }

    return numbers;
  }


  public static int addPairs(int[] vector) {
    int c1 = vector[0] + vector[1];
    int c2 = vector[1] + vector[2];
    int c3 = vector[0] + vector[2];

    if (c1 == vector[2]) {
      System.out.println("The sums are equal. \nResult: " + vector[0] + " + " + vector[1] + " = " + c1);
    } else if (c2 == vector[2]) {
      System.out.println("The sums are equal. \nResult: " + vector[1] + " + " + vector[2] + " = " + c1);
    } else if (c3 == vector[2]) {
      System.out.println("The sums are equal. \nResult: " + vector[0] + " + " + vector[2] + " = " + c1);
    } else {
      System.out.println("The sums are unequal.");
    }
    return 0;
  }

  public static void validateNumber(int[] vector) {
    if(vector[0] % 2 == 0) {
      System.out.println("The number " + vector[0] + " is par");
    } else {
      System.out.println("The number " + vector[0] + " es odd");
    }
  }

  public static void validateSum(int[] vector) {
    if(vector[0] + vector[1] + vector[2] % 2 == 0) {
      System.out.println("The number " + vector[0] + " is par");
    } else {
      System.out.println("The number " + vector[0] + " es odd");
    }
  }
}
