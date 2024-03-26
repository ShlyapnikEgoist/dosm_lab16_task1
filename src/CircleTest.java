import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void test_isPointBelongs() {
        var centerPoint = new Point(0.0, 0.0);
        var radius = 10.0;
        var circle = new Circle(centerPoint, radius);
        Assertions.assertEquals(false, circle.isPointBelongs(centerPoint));
        Assertions.assertEquals(true, circle.isPointBelongs(new Point(0.0, radius)));
        Assertions.assertEquals(false, circle.isPointBelongs(new Point(0.0, radius - 1)));
        Assertions.assertEquals(false, circle.isPointBelongs(new Point(0.0, radius + 1)));
    }
}
