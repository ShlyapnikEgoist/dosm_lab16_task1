import java.util.Objects;

public class Circle {
    // Окружность - https://en.wikipedia.org/wiki/Circle
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isPointBelongs(Point point) {
        // Определение принадлежности точки данной окружности
        return center.getDistanceBetween(point) == radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // Несмотря на использование наследования, математически это разные объекты
        // и, возможно, нет смысла в наследовании, кроме как убрать дублирование кода
        if (!(this.getClass().equals(o.getClass()))) return false;
        Circle circle = (Circle) o;
        return Double.compare(getRadius(), circle.getRadius()) == 0 && Objects.equals(getCenter(), circle.getCenter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCenter(), getRadius());
    }
}
