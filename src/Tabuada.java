public class Tabuada {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++){
      for (int j = 1; j <= 10; j++){
        if (j == 1) {
          System.out.println("Tabuada do " + i);
          System.out.println(i + " x " + j + " = " + (i*j));
        }
        else {
          System.out.println(i + " x " + j + " = " + (i*j));
        }
      }
      System.out.println();
    }
  }
}
