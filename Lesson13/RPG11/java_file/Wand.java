public class Wand {
  private String name;
  private double power;

  public Wand(String name, double power) {
    this.name = name;
    this.power = power;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name.length() <= 3) {
      throw new IllegalArgumentException("名前が短すぎます。4文字以上で設定してください。");
    } else {
      this.name = name;
    }
  }

  public double getPower() {
    return this.power;
  }

  public void setPower(int power) {
    if (power < 0.5 || power > 100.0) {
      throw new IllegalArgumentException("杖の魔力は、0.5以上100未満を設定してください。");
    } else {
      this.power = power;
    }
  }
}