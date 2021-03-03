package tddbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class GridPointTest {

    @Test
    public void _x座標とy座標を与えて格子点を生成する() throws Exception {
        // Setup
    	// GridPoint
        Sample sut = new Sample();
        // Exercise
        String actual = sut.say();
        // Verify
        assertEquals("Hello TDD BootCamp!", actual);
    }

}
