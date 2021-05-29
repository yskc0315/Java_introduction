public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid() {
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大まで回復した！");
  }

  public int pray(int sec) {
    System.out.println(this.name + "は、" + sec + "秒天に祈った！");
    int add_recovery = new java.util.Random().nextInt(3);
    int mp_recovery = sec + add_recovery;
    if (this.mp + mp_recovery <= this.MAX_MP) {
      System.out.println("MPが" + mp_recovery + "回復した！");
      return mp_recovery;
    } else {
      System.out.println("MPが" + (this.MAX_MP - this.mp) + "回復した！");
      return (this.MAX_MP - this.mp);
    }
  }
  // // 模範解答
  // public int pray(int sec) {
  //   System.out.println(this.name + "は、" + sec + "秒間天に祈った！");
  //   // 論理上の回復量を乱数を用いて決定する
  //   int recover = new Random().nextInt(3) + sec;
  //   // 実際の回復量を計算する
  //   int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

  //   this.mp += recoverActual;
  //   System.out.println("MPが" + recoverActual + "回復した！");
  //   return recoverActual;
  // }
}