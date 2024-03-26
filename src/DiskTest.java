import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiskTest {
    @Test
    public void test_isPointBelongs() {
        var centerPoint = new Point(0.0, 0.0);
        var radius = 10.0;
        var disk = new Disk(centerPoint, radius);
        Assertions.assertEquals(true, disk.isPointBelongs(centerPoint));
        Assertions.assertEquals(true, disk.isPointBelongs(new Point(0.0, radius)));
        Assertions.assertEquals(true, disk.isPointBelongs(new Point(0.0, radius - 1)));
        Assertions.assertEquals(false, disk.isPointBelongs(new Point(0.0, radius + 1)));
    }
}
