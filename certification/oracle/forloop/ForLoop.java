public class ForLoop {

  public static void main(String... args) {
    String machin = "truc";
    for(int i = 0; i < 5; i++, machin=machin.concat("" +i)) {
      System.out.println("Bonjour " + machin + " fois");
    }
  }
}
