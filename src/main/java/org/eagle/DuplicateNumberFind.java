package org.eagle;

import java.util.Arrays;
import java.util.OptionalInt;

public class DuplicateNumberFind {
    int duplicateFinder(int[] duplicateArray){
        int firstNumber = Arrays.stream(duplicateArray).min().getAsInt();
        int lastNumber = Arrays.stream(duplicateArray).max().getAsInt();
        int expectedSum = (firstNumber+lastNumber)*(lastNumber-firstNumber+1)/2;
        int actualSum = Arrays.stream(duplicateArray).sum();
        return actualSum-expectedSum;
    }
}
