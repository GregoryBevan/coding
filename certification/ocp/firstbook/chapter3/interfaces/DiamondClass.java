public class DiamondClass implements Interface1, Interface2 {

  public void print() {
    Interface1.super.print();
  }

  public static void main(String... args) {
    DiamondClass diamondClass = new DiamondClass();
    diamondClass.print();
  }

}
