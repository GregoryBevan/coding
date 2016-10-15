class Overloaded {
  void method(short i) {
    System.out.println("short");
  }
  void method(int i) {
    System.out.println("int");
  }
/*  void method(Object i) {
    System.out.println("object");
  }
  void method(String i) {
    System.out.println("string");
  }*/

  public static void main(String... args) {
    Overloaded overloaded = new Overloaded();
    overloaded.method((byte) 9);
    overloaded.method(9);
    overloaded.method(Integer.valueOf(9));
    //overloaded.method("9");
    //overloaded.method(true);
  }
}
