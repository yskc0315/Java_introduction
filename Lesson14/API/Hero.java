public class Hero {
  String name;
  int hp;

  // ObjectクラスのtoString()メソッドをオーバーライドする
  public String toString() {
    return "名前：" + this.name + "/HP：" + this.hp;
  }

  // Objectクラスのequals()メソッドをオーバーライドする
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o instanceof Hero) {
      Hero h = (Hero) o;
      if (this.name.equals(h.name)) {
        return true;
      }
    }
    return false;
  }
}