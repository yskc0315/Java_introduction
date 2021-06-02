public abstract class Character {
  String name;
  int hp;

  public Character(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  public void attack(Monster m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("3ポイントのダメージを与えた！");
    m.hp -= 5;
  }

  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
}