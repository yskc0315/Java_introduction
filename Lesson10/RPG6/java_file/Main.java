public class Main {
  public static void main(String[] args) {
    PoisonMatango pm = new PoisonMatango('A');
    Hero h = new Hero();

    System.out.println("きのこ" + pm.suffix + "があらわれた！");
    pm.attack(h);
    System.out.println(h.name + "⇒hp：" + h.hp);
    h.run();
  }
}