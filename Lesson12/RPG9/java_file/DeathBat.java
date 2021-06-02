public class DeathBat extends Monster {
  public DeathBat(String name, int hp) {
    super(name, hp);
  }

  public void run() {
    System.out.println("こうもりは、羽ばたいて逃げ出した！");
    System.out.println("ダメでした…");
  }
}