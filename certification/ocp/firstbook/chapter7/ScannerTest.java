import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerTest {

  public static void main(String... args) {
    System.out.print("Type an integer to continue the program: ");
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.printf("You type in %d", scanner.nextInt());
    } catch(InputMismatchException e) {
      System.err.println("You must enter an integer"); 
    }

  }
}
