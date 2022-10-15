import java.util.Scanner;

public class ListarNumeros {

  public static void main(String[] args) {
    int init, end;
    Scanner sc = new Scanner(System.in);

    if (args.length == 0){
      System.out.println("Informe o valor inicial: ");
      init = Integer.parseInt(sc.nextLine());

      System.out.println("Informe o valor Final: ");
      end = Integer.parseInt(sc.nextLine());
    } else if (args.length == 1) {
      init = Integer.parseInt(args[0]);

      System.out.println("Informe o valor Final: ");
      end = Integer.parseInt(sc.nextLine());
    } else if (args.length == 2){
      init = Integer.parseInt(args[0]);
      end = Integer.parseInt(args[1]);
    } else {
      System.out.println("Número de argumentos é invalido, esperado até 2 argumentos");
      return;
    }

    System.out.println("Resultado: [");
    while (init < end) {
      System.out.printf("%d, ", init);
      init ++;
    }
    System.out.printf("%d]", end);
  }
}
