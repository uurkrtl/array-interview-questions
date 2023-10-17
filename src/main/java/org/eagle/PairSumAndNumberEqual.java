package org.eagle;

import java.util.HashMap;
import java.util.List;

public class PairSumAndNumberEqual {
    HashMap<Integer,Integer> pairFind(int[] numbers, int number){
        HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();
        for(int i = 0;i<numbers.length;i++){
            for (int j = 0; j<numbers.length;j++){
                if (i == j) continue;
                if (numbers[i]+numbers[j]==number)pairs.put(numbers[i],numbers[j]);
            }
        }
        return pairs;
    }
}
