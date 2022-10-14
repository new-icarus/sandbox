import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Bhaskara {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o coeficiente a: ");
    BigDecimal a = BigDecimal.valueOf(sc.nextDouble());

    System.out.println("Digite o coeficiente a: ");
    BigDecimal b = BigDecimal.valueOf(sc.nextDouble());

    System.out.println("Digite o coeficiente a: ");
    BigDecimal c = BigDecimal.valueOf(sc.nextDouble());


    BigDecimal b2 = b.pow(2);
    BigDecimal ac4 = BigDecimal.valueOf(4.0).multiply(a).multiply(c);
    BigDecimal delta = b2.subtract(ac4);

    MathContext mc = new MathContext(3);

    int comparison = delta.compareTo(BigDecimal.ZERO);
    BigDecimal bMenos = b.multiply(new BigDecimal(-1));
    BigDecimal doisA = new BigDecimal(2).multiply(a);

    if (comparison == 0){
      System.out.println("Só existe uma raiz de x, que é: " + bMenos.divide(doisA));
      return;
    }

  }
}
