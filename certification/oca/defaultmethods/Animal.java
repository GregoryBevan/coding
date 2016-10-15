public interface Animal {
  default void eat() {
    System.out.println("Eat anything");
  }
}
