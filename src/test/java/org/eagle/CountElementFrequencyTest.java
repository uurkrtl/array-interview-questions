package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountElementFrequencyTest {
    @Test
    void testCountElement(){
        CountElementFrequency countElementFrequency = new CountElementFrequency();
        HashMap<Integer,Integer> expected = new HashMap<>(){{put(1,2);put(2,2);put(3,3);put(4,2);put(5,1);}};
        HashMap<Integer,Integer> actual = countElementFrequency.countElement(Arrays.asList(1, 2, 3, 2, 1, 3, 3, 4, 5, 4));
        Assertions.assertEquals(expected,actual);
    }
}
