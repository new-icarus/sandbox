import java.util.Scanner;

public class IMC {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe sua altura em metros: ");
    double altura = sc.nextDouble();

    System.out.println("Informe seu peso em Kg: ");
    double peso = sc.nextDouble();

    double imc = peso / Math.pow(altura, 2);
  }
}
