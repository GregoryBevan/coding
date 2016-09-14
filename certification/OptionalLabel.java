public class OptionalLabel {
  public static void main(String... args) {
    int[][] myComplexArray = {{5,2,1,3},{3,4,5,1},{9,5,6,3}};
    OUTER_LOOP: for(int[] mysimpleArray: myComplexArray) {
      INNER_LOOP: for(int i=0; i <mysimpleArray.length; i++) {
        System.out.print(mysimpleArray[i] + "\t");
      }
      System.out.println();
    }
  }
}
