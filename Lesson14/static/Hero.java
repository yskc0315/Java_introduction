public class Hero {
  String name;
  int hp;
  // 静的フィールドを宣言
  static int money;

  // 静的メソッド
  public static void setRandomMoney() {
    Hero.money = (int) (Math.random() * 1000);
  }
}