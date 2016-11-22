import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;

public class ZipFileExample {

  public static void main(String... args) {
    final String fileName = "ZipFileExample.java";
    try(FileInputStream inputStream = new FileInputStream(fileName);
    ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream("MyZip.zip"))) {
      byte[] buffer = new byte[1024];
      zipFile.putNextEntry(new ZipEntry(fileName));
      int lengthRead = 0;
      while((lengthRead = inputStream.read(buffer)) > 0)  {
        zipFile.write(buffer, 0, lengthRead);
      }
    } catch(IOException e) {
      System.err.println("An ioexception occurred");
    }
  }

}
