import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Значения первой точки: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		Point3D point1 = new Point3D(x, y, z);

		System.out.println("Значения второй точки: ");
		x = in.nextDouble();
		y = in.nextDouble();
		z = in.nextDouble();
		Point3D point2 = new Point3D(x, y, z);

		System.out.println("Значения третьей точки: ");
		x = in.nextDouble();
		y = in.nextDouble();
		z = in.nextDouble();
		Point3D point3 = new Point3D(x, y, z);

		if (point1.equals(point2) || point2.equals(point3) || point3.equals(point1)) {
			System.out.println("Одна или несколько точек равны между собой, посчитать площадь невозможно.");
		} else {
			System.out.println("Площадь треугольника равна: " + computeArea(point1, point2, point3));
		}
	}

	public static double computeArea(Point3D p1, Point3D p2, Point3D p3) {
		double a = p1.distanceTo(p2), b = p2.distanceTo(p3), c = p3.distanceTo(p1);
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return Math.round(result * 100.0) / 100.0; // Округление до 2 знаков после запятой
	}
}