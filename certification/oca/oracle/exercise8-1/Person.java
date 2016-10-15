public class Person implements Describable {
  private String description;

  public Person(String firstName, String lastName) {
    this.description = "A person that is named " + firstName  + " "  +lastName;
  }

  public String getDescription() {
    return this.description;
  }
}
