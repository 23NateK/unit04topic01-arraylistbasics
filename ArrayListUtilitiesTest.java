import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    @Test
    public void testGetListMax() {
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(1, 5, 4, 9, 2, 1));
        expectedOutput = 9;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testwithoutLongWords() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;
        input = new ArrayList<>(Arrays.asList("fart","poopies","stinky","farty"));
        expectedOutput = new ArrayList<>(Arrays.asList("fart","farty"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testremoveLongWords() {
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;
        input = new ArrayList<>(Arrays.asList("fart","poopies","stinky","farty"));
        expectedOutput = new ArrayList<>(Arrays.asList("fart","farty"));
        ArrayListUtilities.removeLongWords(input);
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testreversed() {
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;
        input = new ArrayList<>(Arrays.asList(2.3,1.1,2.4,5.1));
        expectedOutput = new ArrayList<>(Arrays.asList(5.1,2.4,1.1,2.3));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    public void testreverseInPlace() {
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;
        input = new ArrayList<>(Arrays.asList(2.3,1.1,2.4,5.1,2.2));
        expectedOutput = new ArrayList<>(Arrays.asList(2.2,5.1,2.4,1.1,2.3));
        ArrayListUtilities.reverseInPlace(input);
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);
    }
}
