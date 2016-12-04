import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String... args) {
      String pangram = "the quick brown fox jumps over the lazy dog";
      char[] letters = pangram.toCharArray();
      System.out.println("letters : " + Arrays.toString(letters));
      Set<Character> treeSet = new TreeSet<>();
      for(char c : letters) {
        treeSet.add(c);
      }
      System.out.println("treeSet : " + treeSet);
    }

}
