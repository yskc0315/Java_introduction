public class Main {
  public static void main(String[] args) {
    // 下記コメントの処理は、5つのインスタンスを生成し、変数に代入
    // その後、各々のhpフィールドに＋50している
    // しかし、記述が煩雑かつ、ミス発生の可能性が高い
    // Hero h1 = new Hero();
    // Hero h2 = new Hero();
    // Thief t1 = new Thief();
    // Wizard w1 = new Wizard();
    // Wizard w2 = new Wizard();

    // h1.hp += 50;
    // h2.hp += 50;
    // t1.hp += 50;
    // w1.hp += 50;
    // w2.hp += 50;

    Character[] c = new Character[5];
    c[0] = new Hero("あ", 30);
    c[1] = new Hero("い", 50);
    c[2] = new Thief("う", 39);
    c[3] = new Wizard("え", 20);
    c[4] = new Wizard("お", 23);
    for (Character ch : c) {
      ch.hp += 50;
    }

    Monster[] monsters = new Monster[3];
    monsters[0] = new Slime("スライム", 9999);
    monsters[1] = new Goblin("ゴブリン", 9999);
    monsters[2] = new DeathBat("こうもり", 9999);
    for (Monster m : monsters) {
      m.run();
    }

  }
}