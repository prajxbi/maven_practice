package org.apache.maven.archtypes.maven_archetype_quickstart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testTriangleArea() {
        double base = 20;
        double height = 10;

        double area = 0.5 * base * height;

        assertEquals(100.0, area, 0.001);
    }
}