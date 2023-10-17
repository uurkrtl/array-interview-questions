package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class MultipleDuplicatesNumberFindTest {
    @Test
    void givenIntArray_whenDuplicateNumbers_thenReturnuplicateNumbers(){
        MultipleDuplicatesNumberFind multipleDuplicatesNumberFind = new MultipleDuplicatesNumberFind();
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(1,3,5));
        HashSet<Integer> actual = multipleDuplicatesNumberFind.duplicateFinder(IntStream.of(1,3,5,7,3,1,3,5).toArray());
        Assertions.assertEquals(expected,actual);
    }
}
