public class Geme {
  Player p;
  Dice d;

  Geme() {
    p = new Player();
    d = new Dice();
  }

  void start() {
    p.turn(d);
    System.out.println(d.me);  // 振ったさいころの目が表示される
  }

  void judge() {

  }
}
