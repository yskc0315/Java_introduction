public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    // ↓静的フィールド
    // 静的フィールドmoneyに100を代入
    Hero.money = 100;
    // 100が出力される
    System.out.println(Hero.money);
    // 100が出力される
    System.out.println(h1.money);
    // moneyに300を代入
    h1.money = 300;
    // 300が出力される
    System.out.println(h2.money);
    // ↑静的フィールド

    // ↓静的メソッド(クラスから直接呼び出している)
    Hero.setRandomMoney();
    System.out.println(Hero.money);
    Hero h3 = new Hero();
    System.out.println(h3.money);
    // ↑静的メソッド
  }
}