public class Main {
  public static void main(String[] args) {
    Hero h = new Hero("ああああ", 4000);
    Wizard w = new Wizard("いいいい", 5000, 300);
    Wand wn = new Wand("普通の杖", 30);
    w.setWand(wn);

    w.heal(h);
  }
}