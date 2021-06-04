public class Hero {
  // アクセス修飾子(private)により、他クラスからはhpフィールドにアクセスできない
  private int hp;
  String name;
  Sword sword;

  public void bye() {
    System.out.println("勇者は別れを告げた");
  }

  public void attack(Mantango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("お化けキノコ" + m.suffix + "に5ポイントのダメージを与えた！");
  }

  // アクセス修飾子を外すことにより、package privateを指定していることになる
  // ＝同じパッケージに属するクラスからの呼び出しのみ可能になる
  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }

  // アクセス修飾子(private)により、他クラスからdieメソッドは呼び出せなくなる
  private void die() {
    System.out.println(this.name + "は、死んでしまった！");
    System.out.println("～GAME OVER～");
  }

  // フィールド値を取り出すだけのメソッド(getterメソッド)
  public String getName() {
    return this.name;
  }

  // フィールドに値を代入するだけのメソッド(setterメソッド)
  public void setName(String name) {
    this.name = name;
  }

}