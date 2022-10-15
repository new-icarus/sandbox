import java.util.Scanner;

public class SequenciaNumerica {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o valor inicial:");
    int valInicial = sc.nextInt();

    System.out.println("Informe o valor final:");
    int valFinal = sc.nextInt();

    int inicial = valInicial;

    System.out.println("Resultado:");
    while (inicial <= valFinal){
      System.out.println(inicial);
      inicial++;
    }
  }
}
