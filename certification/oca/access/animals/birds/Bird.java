package animals.birds;

import animals.Animals;

public class Bird extends Animals {

  public Bird() {
    species = "bird";
  }

  @Override
  public void printSpecies() {
    System.out.println("birdSpecies " + species);
  }
}
