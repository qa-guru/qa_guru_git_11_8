package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    @Test
    void assertTrueTest() {
        assertTrue(3 > 1);
    }

    @Test
    void assertFalseTest() {
        assertFalse(3 < 2);
    }

    @Test
    void assertFailTest() {
        fail();
    }
}
