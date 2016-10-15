public class SwitchExamples {
  public static void main(String... args) {
    switch(args[0]) {
      case "truc": System.out.println("truc");
          break;
      case "machin": System.out.println("machin");
      default :
        System.out.println("machin truc");
    }
  }
}
