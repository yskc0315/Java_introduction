public class SuperHero extends Hero {
  boolean flying;

  public SuperHero() {
    super();
    System.out.println("SuperHeroのコンストラクタが動作");
  }

  public void fly() {
    flying = true;
    System.out.println("飛び上がった！");
  }

  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }

  public void attack(Matango m) {
    // 親インスタンス部分のattack()を呼び出し
    super.attack(m);
    // System.out.println(this.name + "の攻撃！");
    // m.hp -= 5;
    // System.out.println("5ポイントのダメージを与えた！");
    if (flying == true) {
      super.attack(m);
      // System.out.println(this.name + "の攻撃！");
      // m.hp -= 5;
      // System.out.println("5ポイントのダメージを与えた！");
    }
  }
}