public class ForExample {
  public static void main(String... args) {
    int x = 0;
    for(int y=0, z=4; x < 5 && y < 10; x++, y++) {
      System.out.print(y + " ");
    }
    System.out.print(x);
  }
}
