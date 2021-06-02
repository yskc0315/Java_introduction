public abstract class Monster {
  String name;
  int hp;

  public Monster(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  public void run() {
    System.out.println(this.name + "は逃げ出した！");
    System.out.println("だめでした…");
  }
}