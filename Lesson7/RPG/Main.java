public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    h.name = "あああああ";
    h.hp = 2000;
    System.out.println("勇者" + h.name + "を生み出しました！");

    Matango m1 = new Matango();
    m1.hp = 9000;
    m1.suffix = 'A';
    Matango m2 = new Matango();
    m2.hp = 3;
    m2.suffix = 'B';

    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}