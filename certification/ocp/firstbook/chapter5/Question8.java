//import java.util.function.ObjIntConsumer;
import java.util.function.ToIntBiFunction;

public class Question8 {

  public static void main(String... args) {
    //ObjIntConsumer<String> charAt = (str, i) -> str.charAt(i);
    //charAt.accept("java", 2);
    ToIntBiFunction<String, Integer> charAt = (str, i) -> str.charAt(i);
    System.out.println((char)charAt.applyAsInt("java", 2));
  }

}
