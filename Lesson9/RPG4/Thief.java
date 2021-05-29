public class Thief {
  String name;
  int hp;
  int mp;

  // コンストラクタ①
  public Thief(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  // コンストラクタ②
  public Thief(String name, int hp) {
    this(name, hp, 5);
  }

  // コンストラクタ③
  public Thief(String name) {
    this(name, 40);
  }
}