public class Main {
  public static void main(String[] args) {
    // 12-2
    X obj = new A();
    // obj.b();, obj.c();の呼び出しは不可 →Xインタフェース上に存在しないため
    obj.a();

    // 12-2
    Y y1 = new A();
    Y y2 = new B();
    y1.a();
    y2.a();

    // 12-3
    Y[] y = new Y[2];
    y[0] = new A();
    y[1] = new B();

    for (Y yy : y) {
      yy.b();
    }

  }
}