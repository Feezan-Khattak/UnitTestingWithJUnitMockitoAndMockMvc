package com.greedycode.unittesting.demoUtils;

import java.util.List;

public class AssertsForArrayIterableAndLines {

    private final int[]  numbers = {1, 3, 5};
    private final List<String> names =  List.of("Feezan", "khattak");

    public int[] getNumbers(){
        return this.numbers;
    }

    public List<String> getNames(){
        return this.names;
    }
}
