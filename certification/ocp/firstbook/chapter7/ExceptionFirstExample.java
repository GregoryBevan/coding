public class ExceptionFirstExample {

  public static void main(String... args) {
    if(args.length == 0) {
      throw new IllegalArgumentException("You must past at least one argument");
    }

    System.out.println("Program works correctly with args");
    for(String arg :args) {
      System.out.printf("%s%n", arg);
    }

  }
}
