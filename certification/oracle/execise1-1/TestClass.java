import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
// import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TestClass {
  public static void main(String[] args) throws IOException{
    Files.createDirectories(Paths.get("logs"));

    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");

    LocalDateTime now = LocalDateTime.now();

    String date = now.format(df);

    String logFileName = "logs\\testlog-" + date + ".txt";

    FileHandler myFileHandler = new FileHandler(logFileName);
    myFileHandler.setFormatter(new SimpleFormatter());
    Logger ocajLogger = Logger.getLogger("OCAJ Logger");
    ocajLogger.setLevel(Level.ALL);
    ocajLogger.addHandler(myFileHandler);
    ocajLogger.info("\nThis is a logger information massage. ");
    myFileHandler.close();
  }
}
