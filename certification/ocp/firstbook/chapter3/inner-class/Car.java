public class Car {

   public class Wheels {
     int number = 4;
     String brand;

     public Wheels(String brand) {
       this.brand = brand;
     }

     public void partOf() {
       System.out.println("This wheels are part of " + Car.this.brand + " car");
     }

   }

   Wheels wheels;

   String brand = "Renault";

   public Car() {
     this.wheels = this.new Wheels("Bridgestone");
   }

   public void drive() {
     System.out.println("This car runs with " + wheels.number + " " + wheels.brand + " wheels");
   }

}
