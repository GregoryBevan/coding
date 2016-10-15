public class Simulator {
  public static void main(String... args) {
    System.out.println("Creating a maple tree and tulipe...");
    MapleTree mapleTree = new MapleTree();
    Tulipe tulipe = new Tulipe();
    Rose rose = new Rose();

    System.out.println("Entering a loop to simulate 3 years");
    for(int i = 0; i < 3; i++) {
      mapleTree.doSpring();
      tulipe.doSpring();
      rose.doSpring();
      mapleTree.doSummer();
      tulipe.doSummer();
      rose.doSummer();
      mapleTree.doFall();
      tulipe.doFall();
      rose.doFall();
      mapleTree.doWinter();
      tulipe.doWinter();
      rose.doWinter();
    }
  }
}
