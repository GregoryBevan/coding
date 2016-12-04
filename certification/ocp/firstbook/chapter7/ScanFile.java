import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScanFile {

  public static void main(String... args) {
    try(Scanner scanner = new Scanner(new File("scanned-file.txt"))) {
      System.out.printf("The number in the file is: %d", scanner.nextInt());
    } catch(FileNotFoundException fnfe) {
      System.err.println("The file doesn't exist");
    }
  }
}
