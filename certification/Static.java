public class Static {

  public static String var = "test";

  public static void main(String... args) {
    Static stat = new Static();
    System.out.println(stat.var);
    stat = null;
    System.out.println(stat.var);
  }
}
