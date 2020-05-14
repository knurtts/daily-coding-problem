import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstMissingPositiveTest {

    @Test
    void firstMissingTest() {
        int[] inputArray = {8, 6, -1, 1};
        int expectedOutput = 2;
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();

        Assertions.assertEquals(expectedOutput, firstMissingPositive.firstMissingPositive(inputArray));
    }
}
