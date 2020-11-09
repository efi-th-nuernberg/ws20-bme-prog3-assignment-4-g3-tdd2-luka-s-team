import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Assert
        
        //normal
        assertEquals(TriangleChecker.TriangleType.NORMAL, TriangleChecker.checkTriangle(a, b, c));
        //gleichseitig
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, TriangleChecker.checkTriangle(2, 2, 2));

        //kein Dreieck
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(-1, 1, 1));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, -1, 1));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, 1, -1));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(5, 1, 1));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, 5, 1));
          assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, 1, 5));

        //gleichschenkliges Dreieck
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, TriangleChecker.checkTriangle(1, 2, 1));
    }
}
