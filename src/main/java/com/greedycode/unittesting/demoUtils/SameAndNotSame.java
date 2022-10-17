package com.greedycode.unittesting.demoUtils;

public class SameAndNotSame {

    String name = "feezan";
    String duplicateName = name;

    public String getName(){
        return this.name;
    }

    public String getDuplicateName(){
        return this.duplicateName;
    }
}
