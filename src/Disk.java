import java.util.Objects;

public class Disk extends Circle {
    // Круг - https://en.wikipedia.org/wiki/Disk_(mathematics)

    public Disk(Point center, double radius) {
        super(center, radius);
    }

    public boolean isPointBelongs(Point point) {
        // Определение принадлежности точки данному кругу
        return getCenter().getDistanceBetween(point) <= getRadius();
    }

    @Override
    public String toString() {
        return "Disk{" +
                "center=" + getCenter() +
                ", radius=" + getRadius() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // Несмотря на использование наследования, математически это разные объекты
        // и, возможно, нет смысла в наследовании, кроме как убрать дублирование кода
        if (!(this.getClass().equals(o.getClass()))) return false;
        Disk disk = (Disk) o;
        return Double.compare(getRadius(), disk.getRadius()) == 0 && Objects.equals(getCenter(), disk.getCenter());
    }
}
