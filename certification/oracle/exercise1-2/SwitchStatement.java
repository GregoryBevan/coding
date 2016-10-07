public class SwitchStatement {
  public static void main(String... args) {
    switch(args[0]) {
      case "Hello": System.out.println("Hello world");
      break;
      case "Stop": System.out.println("Stop switch");
      break;
      default:
       System.out.println("This is the default case");
    }
  }
}
