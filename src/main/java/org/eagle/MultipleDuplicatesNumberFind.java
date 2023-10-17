package org.eagle;

import java.util.*;

public class MultipleDuplicatesNumberFind {

    HashSet<Integer> duplicateFinder(int[] numbers){
        HashSet<Integer> dublicatedNumbers = new HashSet<>();
        for (int i = 0; i<numbers.length;i++){
            for (int j = 0; j<numbers.length;j++){
                if (i != j && numbers[i] == numbers[j]) dublicatedNumbers.add(numbers[i]);
            }
        }
        return dublicatedNumbers;
    }
}