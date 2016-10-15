import java.util.Arrays;

public class TestNumber {

  public double sum(Number[] nums) {
    return Arrays.stream(nums).mapToDouble(Number::doubleValue).sum();
  }

  public static void main(String... args) {
    Number[] nums = new Number[4];
    nums[0] = new Byte((byte) 10);
    nums[1] = new Integer(10);
    nums[2] = new Float(10.0f);
    nums[3] = new Double(10.0);
    System.out.println("The sum is: " + new TestNumber().sum(nums));
  }
}
