public class Main {
  public static void main(String[] args) {

    double r = 0;

    for (int i = 1; i <= 50; i++) {
      double d = (1 / i);
      r += d;
      if (r > 8.0) {
        System.out.println(i);
      }
    }

  }
}