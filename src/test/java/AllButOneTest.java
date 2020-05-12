import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AllButOneTest {

    @Test
    void allButOne() {

        int[] inArray = {1, 2, 3, 4, 5};
        int[] expected = {120, 60, 40, 30, 24};
        ProductOfAllButOne productOfAllButOne = new ProductOfAllButOne();

        Assertions.assertArrayEquals(expected, productOfAllButOne.allButOne(inArray));
    }

    @Test
    void noDivisionAllButOne () {

        int[] inArray = {1, 2, 3, 4, 5};
        int[] expected = {120, 60, 40, 30, 24};
        ProductOfAllButOne productOfAllButOne = new ProductOfAllButOne();

        Assertions.assertArrayEquals(expected, productOfAllButOne.noDivisionAllButOne(inArray));
    }
}
