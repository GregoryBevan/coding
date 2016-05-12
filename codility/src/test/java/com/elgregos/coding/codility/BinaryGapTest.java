package com.elgregos.coding.codility;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BinaryGapTest {

    @Test
    public void testSolution() {
        final BinaryGap binaryGap = new BinaryGap();
        assertEquals(0, binaryGap.solution(1));
        assertEquals(2, binaryGap.solution(9));
        assertEquals(1, binaryGap.solution(10));
        assertEquals(2, binaryGap.solution(100));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(0, binaryGap.solution(Integer.MAX_VALUE));
    }

}
