package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class DuplicateNumberFindTest {
    @Test
    void givenIntArray_whenDuplicateFinder_thenDuplicateNumberInArray(){
        DuplicateNumberFind duplicateNumberFind = new DuplicateNumberFind();
        Assertions.assertEquals(3,duplicateNumberFind.duplicateFinder(IntStream.of(1,3,2,4,6,3,5).toArray()));
        Assertions.assertEquals(5,duplicateNumberFind.duplicateFinder(IntStream.of(1,5,2,4,6,3,5).toArray()));
    }
}
