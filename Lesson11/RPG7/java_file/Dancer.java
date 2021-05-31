public class Dancer extends Person {

  public Dancer(String name, int hp) {
    super(name, hp);
  }

  public void dance() {
    System.out.println(this.name + "は情熱的に踊った！");
  }

  public void attack(Mantango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に3ポイントのダメージ！");
    m.hp -= 3;
  }
}