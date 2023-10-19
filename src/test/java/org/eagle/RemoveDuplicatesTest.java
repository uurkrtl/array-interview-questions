package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RemoveDuplicatesTest {
    @Test
    void given_IntArray_whenRemoveDuplicate_thenReturnNonRepeating(){
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> actual = removeDuplicates.remover(IntStream.of(1,1,2,2,2,3,4,4,5).toArray());
        List<Integer> actualFalse = removeDuplicates.remover(IntStream.of(1,1,2,2,2,6,3,4,4,5).toArray());
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(expected,actualFalse);
    }
}
