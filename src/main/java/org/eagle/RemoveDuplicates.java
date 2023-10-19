package org.eagle;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    List<Integer> remover (int[] numbers){
        List<Integer> removednumbers =new ArrayList<>();
        for (int number : numbers){
            if (!removednumbers.stream().anyMatch(x->x==number)) removednumbers.add(number);
        }
        return removednumbers;
    }
}
