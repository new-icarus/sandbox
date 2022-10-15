import java.math.BigDecimal;
import java.util.Objects;
import java.util.Scanner;

public class SistemaDescontos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o valor da compra? ");
    double valor = sc.nextDouble();

    System.out.println("Qual a forma de pagamento? CREDITO, DEBITO, CHQUE, BOLETO, DINHEIRO");
    String formaPagamento = sc.next();

    switch (formaPagamento) {
      case ("CREDITO"), ("DEBITO") -> valor = valor - (valor * 0.03);
      case ("CHEQUE") -> valor = valor - (valor * 0.06);
      case ("BOLETO") -> valor = valor - (valor * 0.09);
      case ("DINHEIRO"), ("PIX") -> valor = valor - (valor * 0.12);
      default -> System.out.println("Forma de pagamento inválida.");
    }

    System.out.println("Valor total: R$" + valor);
  }
}
