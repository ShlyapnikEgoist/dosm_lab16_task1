public class Main {
    public static void main(String[] args) {
        var centerPoint = new Point(0.0, 0.0);
        var circleRadius = 10.0;
        var diskRadius = circleRadius + 10.0;

        var circle = new Circle(centerPoint, circleRadius);
        var disk = new Disk(centerPoint, diskRadius);
        System.out.println("Окружность: " + circle);
        System.out.println("Круг: " + disk);

        System.out.println("Принадлежит ли точка " + centerPoint + " окружности: " + circle.isPointBelongs(centerPoint));
        System.out.println("Принадлежит ли точка " + centerPoint + " кругу: " + disk.isPointBelongs(centerPoint));


        var point = new Point(0.0, 0.0);
        point.setY(circleRadius);
        System.out.println("Смещение точки: " + point);

        System.out.println("Принадлежит ли точка " + point + " окружности: " + circle.isPointBelongs(point));
        System.out.println("Принадлежит ли точка " + point + " кругу: " + disk.isPointBelongs(point));

        point.setY(diskRadius);
        System.out.println("Смещение точки: " + point);

        System.out.println("Принадлежит ли точка " + point + " окружности: " + circle.isPointBelongs(point));
        System.out.println("Принадлежит ли точка " + point + " кругу: " + disk.isPointBelongs(point));

        System.out.println("Смена центра окружности на точку: " + point);
        circle.setCenter(point);
        System.out.println("Окружность: " + circle);

        System.out.println("Смена центра круга на точку: " + point);
        disk.setCenter(point);
        System.out.println("Круг: " + disk);

        var newRadius = 100.0;
        System.out.println("Смена радиуса окружности на: " + newRadius);
        circle.setRadius(newRadius);
        System.out.println("Окружность: " + circle);

        System.out.println("Смена радиуса круга на: " + newRadius);
        disk.setRadius(newRadius);
        System.out.println("Круг: " + disk);

    }
}