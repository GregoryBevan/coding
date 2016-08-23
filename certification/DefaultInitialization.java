public class DefaultInitialization {
  int i;
  short s;
  long l;
  float f;
  double d;
  byte by;
  boolean bo;
  char c;

  public static void main(String... args) {
    DefaultInitialization defaultInitialization = new DefaultInitialization();

    System.out.println("int default value " + defaultInitialization.i);
    System.out.println("short default value " + defaultInitialization.s);
    System.out.println("long default value " + defaultInitialization.l);
    System.out.println("float default value " + defaultInitialization.f);
    System.out.println("double default value " + defaultInitialization.d);
    System.out.println("byte default value " + defaultInitialization.by);
    System.out.println("boolean default value " + defaultInitialization.bo);
    System.out.println("char default value " + defaultInitialization.c);

  }
}
