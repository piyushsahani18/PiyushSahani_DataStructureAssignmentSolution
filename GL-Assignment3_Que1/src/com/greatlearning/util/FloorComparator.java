package com.greatlearning.util;

import java.util.Comparator;

public class FloorComparator implements Comparator<Integer> {

	
	// priority queue condition to store the order of floor in descending order.
    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
        
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
