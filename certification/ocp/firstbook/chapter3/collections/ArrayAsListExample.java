import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

  public static void main(String... args) {
    String[] myStringArray = {"bonjour", "salut", "bye","ciao"};
    List<String> myStringList = Arrays.asList(myStringArray);
    System.out.println(myStringArray + " || " + myStringList);
    //myStringList.add("coucou");
    myStringList.set(0, "hello");
    System.out.println(myStringArray + " || " + myStringList);
  }


}
