public class Main {
  public static void main(String[] args) {
    Empty e = new Empty();
    String s = e.toString();
    System.out.println(s);

    Object o1 = new Empty();
    Object o2 = new Hero();
    Object o3 = "こんにちは";

    Hero h = new Hero();
    h.name = "あああ";
    h.hp = 100;
    System.out.println(h.toString());

    Hero h1 = new Hero();
    h1.name = "いいい";
    h1.hp = 200;
    Hero h2 = new Hero();
    h2.name = "いいい";
    h2.hp = 200;
    if (h1.equals(h2) == true) {
      System.out.println("同じ内容です");
    } else {
      System.out.println("違う内容です");
    }
  }

  public void printAnythings(Object o) {
    // 何型でも良いので、引数を一つ受け取り画面に表示
    System.out.println(o.toString());
  }
}