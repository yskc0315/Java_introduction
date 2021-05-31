public class Main {
  public static void main(String[] args) {
    Dancer d = new Dancer("いいい", 450);
    Mantango m = new Mantango(10);
    System.out.println(d.name + "を生み出した！");

    d.dance();
    d.attack(m);
  }
}