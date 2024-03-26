import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Math.sqrt;

public class PointTest {
    @Test
    public void test_getDistanceBetween() {
        // Проверка корректности вычисления дистанции между двумя точками
        Assertions.assertEquals(1.0, new Point(1.0, 0.0).getDistanceBetween(new Point(0.0, 0.0)));
        Assertions.assertEquals(1.0, new Point(0.0, 1.0).getDistanceBetween(new Point(0.0, 0.0)));
        Assertions.assertEquals(sqrt(2), new Point(1.0, 1.0).getDistanceBetween(new Point(0.0, 0.0)));
        Assertions.assertEquals(5.0, new Point(3.0, 4.0).getDistanceBetween(new Point(0.0, 0.0)));
        Assertions.assertEquals(5.0, new Point(4.0, 6.0).getDistanceBetween(new Point(1.0, 2.0)));
    }
}
