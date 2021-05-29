public class Main {
  public static void main(String[] args) {
    Cleric c = new Cleric();
    c.name = "いいいいい";
    System.out.println("聖者" + c.name + "が誕生した！");

    c.selfAid();
    c.pray(1);
  }
}