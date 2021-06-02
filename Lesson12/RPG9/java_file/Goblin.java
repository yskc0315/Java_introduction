public class Goblin extends Monster {
  public Goblin(String name, int hp) {
    super(name, hp);
  }

  public void run() {
    System.out.println("ゴブリンは、腕を振って逃げ出した！");
    System.out.println("ダメでした…");
  }
}