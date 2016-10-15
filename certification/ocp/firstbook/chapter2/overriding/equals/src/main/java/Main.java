public class Main {

	public static void main(String... args) {
		Point3D point1 = new Point3D(10, 20, 12);
		Point3D point2 = new Point3D(10, 20, 12);

		System.out.println("show " + point1.equals(point2));
		System.out.println("show " + point1.equals(point1));

	}
}
