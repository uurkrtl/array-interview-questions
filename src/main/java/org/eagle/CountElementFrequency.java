package org.eagle;

import java.util.HashMap;
import java.util.List;

public class CountElementFrequency {
    HashMap<Integer, Integer> countElement(List<Integer>numbers){
        HashMap<Integer,Integer> count = new HashMap<>();
        numbers.sort((number1,number2)->number1.compareTo(number2));
        int keyNumber=numbers.get(0);
        int valueNumber=0;
        for (int i : numbers){
            if (i==keyNumber){
                valueNumber++;
                count.put(keyNumber,valueNumber);
            }else {
                count.put(keyNumber,valueNumber);
                keyNumber=i;
                valueNumber=1;
                count.put(keyNumber,valueNumber);
            }
        }
        return count;
    }
}
