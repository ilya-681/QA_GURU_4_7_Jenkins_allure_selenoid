import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class simpleTests {
    @Test
    void successTest() {
        assertEquals(true, true);
    }

    @Test
    void negativeTest() {
        assertEquals(true, false);
    }

    @Test
    @DisplayName("Positive hamcrest test")
    void successHamcrestTest() {
        assertThat(true, is(true));
    }

    @Test
    @DisplayName("Negative hamcrest test")
    void negativeHamcrestTest() {
        assertThat(true, is(false));
    }
}
