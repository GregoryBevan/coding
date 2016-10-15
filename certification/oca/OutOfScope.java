public class OutOfScope {

  public void eat(final boolean hungry) {
    if(hungry) {
      {int bitesOfCheese = 1;
      System.out.println(bitesOfCheese);
      }
    }
  }
}
