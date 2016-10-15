package com.ocajexam.tutorial;

import com.ocajexam.tutorial.planets.*;

public class GreetingUniverse {
  public static void main(String... args) {
    System.out.println("Greetings, Universe!");
    Earth e = new Earth();
    Mars m = new Mars();
    Venus v = new Venus();
  }
}
