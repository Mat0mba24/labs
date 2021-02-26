public class Point3D extends Point2D {
	private double z; // Координата по оси Z

	// Конструктор по умолчанию
	public Point3D() {
		super();
		this.z = 0;
	}

	// Конструктор с передачей значений координат
	public Point3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	// Возвращает координату точки оси Z
	public double getZ() {
		return this.z;
	}

	// Установка нового значения координаты оси Z
	public void setZ(double z) {
		this.z = z;
	}

	// Метод сравнения двух объектов класса точки (текущая точка с указанной)
	public boolean equals(Point3D point) {
		return (this.getX() == point.getX() && this.getY() == point.getY() && this.z == point.getZ());
	}

	// Метод вычисления расстояния между двумя точками
	public double distanceTo(Point3D point) {
		double result = Math.sqrt((this.getX() - point.getX()) * (this.getX() - point.getX())
				+ (this.getY() - point.getY()) * (this.getY() - point.getY())
				+ (this.z - point.getZ()) * (this.z - point.getZ()));
		return Math.round(result * 100.0) / 100.0; // Округление до 2 знаков после запятой
	}
}