public class Main {
  public static void main(String[] args) {
    Sword s = new Sword();
    s.name = "普通の剣";
    s.damage = 9999;
    Hero h = new Hero();
    h.name = "あああ";
    h.hp = 10;
    // Heroクラスのswordフィールドに生成済みの剣インスタンス(の番地)を代入
    h.sword = s;
    Hero h2 = new Hero();
    h2.name = "あああ2";
    h2.hp = 40;
    Wizard w = new Wizard();
    w.name = "いいい";
    w.hp = 30000;
    System.out.println("現在の武器は" + h.sword.name);

    h.attack();
    w.heal(h);
    w.heal(h2);
  }
}