package softserve.academy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkWithTwoEnvelopesTest {
    private Envelope envelope1 = new Envelope();
    private Envelope envelope2 = new Envelope();

    private static String[][] data() {
        return new String[][]{
                {"-1", "2", "3", "4", "5"},
                {"0", "1", "2", "2", "1"},
                {"1", "3", "4", "1", "2"}
        };
    }

    @ParameterizedTest
    @MethodSource("data")
    void compareTo(String expectedStr, String size1Env1, String size2Env1, String size1Env2, String size2Env2) {
        setSidesToEnvelope1(size1Env1, size2Env1);
        setSidesToEnvelope2(size1Env2, size2Env2);
        int expected = Integer.valueOf(expectedStr);
        int actual = envelope1.compareTo(envelope2);

        assertEquals(expected, actual);
    }

    private void setSidesToEnvelope1(String size1, String size2) {
        envelope1.setSide1(size1);
        envelope1.setSide2(size2);
    }

    private void setSidesToEnvelope2(String size1, String size2) {
        envelope2.setSide1(size1);
        envelope2.setSide2(size2);
    }

}
