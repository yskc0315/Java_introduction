public class Hero {
  String name = "あああ";
  int hp = 1000;

  public Hero(){
    System.out.println("Heroのコンストラクタが動作");
  }

  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた！");
  }

  public final void slip(){
    System.out.println(this.name + "は転んだ！");
    this.hp -= 5;
    System.out.println("5のダメージ");
  }

  public void run(){
    System.out.println(this.name + "は逃げ出した！");
  }
}