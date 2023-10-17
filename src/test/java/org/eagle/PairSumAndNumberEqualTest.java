package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.stream.IntStream;

public class PairSumAndNumberEqualTest {
    @Test
    void givenIntArrayAndInt_whenPairEqualInt_thenReturnPairs(){
        PairSumAndNumberEqual pairSumAndNumberEqual = new PairSumAndNumberEqual();
        HashMap<Integer,Integer> expected = new HashMap<>(){{put(1,4);put(2,3);put(3,2);put(4,1);}};
        HashMap<Integer,Integer> actual = pairSumAndNumberEqual.pairFind(IntStream.of(1,2,3,4,5,6,7,8,9).toArray(),5);
        Assertions.assertEquals(expected, actual);
    }
}
