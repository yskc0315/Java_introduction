public class Main {
  public static void main(String[] args) {
    // ↓ピラミッド
    System.out.println("ピラミッドを出力します");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5 - (i + 1); j++) {
        System.out.print("　");
      }
      for (int k = 0; k < (i + 2) * 2 - 3; k++) {
        System.out.print("＊");
      }
      System.out.println("");
    }

    // ↓逆ピラミッド
    System.out.println("逆ピラミッドを出力します");
    for (int l = 0; l < 5; l++) {
      for (int m = 0; m < l; m++) {
        System.out.print("　");
      }
      for (int n = 0; n < -2 * l + 9; n++) {
        System.out.print("＊");
      }
      System.out.println("");
    }
  }
}