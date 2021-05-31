public abstract class Person {
  String name;
  int hp;

  public Person(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }

  public abstract void attack(Mantango m);
}