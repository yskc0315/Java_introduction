public class PoisonMatango extends Matango {
  int poisonCount = 5;

  public PoisonMatango(char s) {
    super(s);
  }

  public void attack(Hero h) {
    super.attack(h);
    if (poisonCount > 0) {
      System.out.println("さらに毒の胞子をばらまいた！");
      int poisonDamage = h.MAX_HP * 1 / 5;
      System.out.println(poisonDamage + "ポイントのダメージ！");
      h.hp -= poisonDamage;
      poisonCount -= 1;
    }
  }
}