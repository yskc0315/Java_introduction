public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  public Wizard(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  public void heal(Hero h) {
    int basePoint = 10;
    int recovPoint = (int) (basePoint * this.getWand().getPower());
    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    if (hp < 0) {
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }

  public int getMp() {
    return this.mp;
  }

  public void setMp(int mp) {
    if (mp < 0) {
      throw new IllegalArgumentException("MPは0以上を設定してください。");
    } else {
      this.mp = mp;
    }
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

  public Wand getWand() {
    return this.wand;
  }

  public void setWand(Wand wand) {
    if (wand == null) {
      throw new IllegalArgumentException("杖を装備してください。");
    } else {
      this.wand = wand;
    }
  }

}