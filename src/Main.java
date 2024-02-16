import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    sumarParejas(obtenerNumero());
  }

  public static int[] obtenerNumero() {
    int[] numeros = new int[3];
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Ingrese el número " + (i + 1) + ":");
      numeros[i] = scanner.nextInt();
    }

    return numeros;
  }

  public static int sumarParejas(int[] vector) {
    int c1 = vector[0] + vector[1];
    int c2 = vector[1] + vector[2];
    int c3 = vector[0] + vector[2];

    if (c1 == vector[2]) {
      System.out.println("Las sumas son iguales. \nResultado: " + vector[0] + " + " + vector[1] + " = " + c1);
    } else if (c2 == vector[2]) {
      System.out.println("Las sumas son iguales. \nResultado: " + vector[1] + " + " + vector[2] + " = " + c1);
    } else if (c3 == vector[2]) {
      System.out.println("Las sumas son iguales. \nResultado: " + vector[0] + " + " + vector[2] + " = " + c1);
    } else {
      System.out.println("Las sumas son desiguales.");
    }
    return 0;
  }
}