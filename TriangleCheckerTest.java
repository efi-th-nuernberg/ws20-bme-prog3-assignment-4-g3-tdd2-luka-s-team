import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testNormalTriangle() {

      // Arrange
      float a = 2;
      float b = 3;
      float c = 4;
        
      assertEquals(TriangleChecker.TriangleType.NORMAL, TriangleChecker.checkTriangle(a, b, c));
    }

    @Test
    public void testEquilateralTriangle() {

      // Arrange
      float a = 2;
      float b = 2;
      float c = 2;
        
      assertEquals(TriangleChecker.TriangleType.EQUILATERAL, TriangleChecker.checkTriangle(a, b, c));
    }
        
    @Test
    public void testNoneTriangle() {
              
      assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(-1, 1, 1));
      assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, -1, 1));
      assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, 1, -1));
      assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(5, 1, 1));
      assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, 5, 1));
      assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(1, 1, 5));
    }

    @Test
    public void testIscoscelesTriangle() {

      // Arrange
      float a = 1;
      float b = 2;
      float c = 1; 

      assertEquals(TriangleChecker.TriangleType.ISOSCELES, TriangleChecker.checkTriangle(1, 2, 1));
    }
}
