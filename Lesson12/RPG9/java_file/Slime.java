public class Slime extends Monster {
  public Slime(String name, int hp) {
    super(name, hp);
  }

  public void run() {
    System.out.println("スライムは、うねうね逃げ出した！");
    System.out.println("ダメでした…");
  }
}