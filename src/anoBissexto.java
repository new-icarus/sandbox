import java.util.Scanner;

public class anoBissexto {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um ano: ");
    int ano = sc.nextInt();

    if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)){
      System.out.println("Ano bissexto!");
    } else {
      System.out.println("Ano não é bissexto.");
    }
  }
}
