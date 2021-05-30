public class Hero {
  String name = "あああ";
  int hp = 20;
  final int MAX_HP = 20;

  public void run() {
    if (this.hp <= 6) {
      System.out.println(this.name + "は逃げ出した…");
    }
  }
}