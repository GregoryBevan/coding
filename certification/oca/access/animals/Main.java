package animals;

import animals.birds.Bird;

public class Main {
  public static void main(String... args) {
    Animals animals = new Animals();
    animals.printSpecies();
    Animals bird = new Bird();
    bird.printSpecies();
  }
}
