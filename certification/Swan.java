public class Swan {
  int numberEggs;

  public static void main(String[] args) {
    Swan mother = new Swan();
    System.out.println(mother.numberEggs);
    mother.numberEggs = 1;
    System.out.println(mother.numberEggs);
  }
}
