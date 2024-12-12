public class Game {
  Player p;
  Dice d;

  Game() {
    p = new Player();
    d = new Dice();
  }

  void start() {
    p.turn(d);
    System.out.println("さいころの目は"+d.me); // 振ったさいころの目が表示される
    judge();  
  }

  
  void judge() {
    if (d.me == 6) {
      System.out.println("当たり");
    } else {
      System.out.println("はずれ");
    }
  }
  


}
