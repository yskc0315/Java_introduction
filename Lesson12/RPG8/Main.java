public class Main {
  public static void main(String[] args) {
    Wizard w = new Wizard();
    Mantango m = new Mantango(20);
    w.name = "あ";
    w.attack(m);
    w.fireball(m);

    Slime s = new Slime();
    Monster mn = new Slime();
    s.run();
    mn.run();
  }
}