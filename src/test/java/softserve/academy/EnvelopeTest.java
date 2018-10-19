package softserve.academy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class EnvelopeTest {
    private Envelope envelope;

    @BeforeEach
    void initEnvelope() {
        envelope = new Envelope();
    }

    @Test
    void testSetSide1ThrowsNumberFormatException() {
        assertThrows(NumberFormatException.class, () -> envelope.setSide1(Constants.NOT_NUMBER_ARG));
    }

    @ParameterizedTest
    @CsvSource({Constants.NEGATIVE_NUMBER_ARG, Constants.ZERO_ARG})
    void testSetSide1ThrowsIllegalArgumentException(String arg) {
        assertThrows(IllegalArgumentException.class, () -> envelope.setSide1(arg));
    }

    @Test
    void setSide2ThrowsNumberFormatException() {
        assertThrows(NumberFormatException.class, () -> envelope.setSide2(Constants.NOT_NUMBER_ARG));
    }

    @ParameterizedTest
    @CsvSource({Constants.NEGATIVE_NUMBER_ARG, Constants.ZERO_ARG})
    void setSide2ThrowsIllegalArgumentException(String arg) {
        assertThrows(IllegalArgumentException.class, () -> envelope.setSide2(arg));
    }


}