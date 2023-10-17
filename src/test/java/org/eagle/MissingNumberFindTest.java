package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberFindTest {
    @Test
    void givenMissingNumberInArray_whenMissingNumberFind_thenMissingNumberInArray(){
        MissingNumberFind missingNumberFind = new MissingNumberFind();
        int expected = 25;
        int actual = missingNumberFind.missingFinder(25);
        Assertions.assertEquals(expected,actual);
    }
}
