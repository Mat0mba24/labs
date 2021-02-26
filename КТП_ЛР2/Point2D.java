public class Point2D {
	private double x; // Координата по оси X
	private double y; // Координата по оси Y

	// Конструктор по умолчанию
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}

	// Конструктор с передачей значений координат
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Возвращает координату точки оси X
	public double getX() {
		return this.x;
	}

	// Возвращает координату точки оси Y
	public double getY() {
		return this.y;
	}

	// Установка нового значения координаты оси X
	public void setX(double x) {
		this.x = x;
	}

	// Установка нового значения координаты оси X
	public void setY(double y) {
		this.y = y;
	}
}