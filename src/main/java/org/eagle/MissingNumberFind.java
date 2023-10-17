package org.eagle;

import java.util.Arrays;

public class MissingNumberFind {
    int missingFinder(int missingNumber){
        int[] actualNumbers = new int[100];
        int expectedSum=0;
        for (int i = 1; i<=100; i++){
            if (i!=missingNumber) actualNumbers[i-1]=i;
            expectedSum+=i;
        }

        int actualSum = Arrays.stream(actualNumbers).sum();
        int missingNum = expectedSum - actualSum;

        return missingNum;

    }
}
