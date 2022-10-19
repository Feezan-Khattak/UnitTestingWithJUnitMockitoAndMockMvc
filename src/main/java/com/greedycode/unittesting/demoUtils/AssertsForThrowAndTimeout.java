package com.greedycode.unittesting.demoUtils;

public class AssertsForThrowAndTimeout {

    public String checkNumber(int a) throws Exception {
        if(a<0){
            throw new Exception("Value must be greater than 0");
        }else{
            return "Value is greater than 0";
        }
    }

    public void checkTimeout() throws InterruptedException {
        System.out.println("I am going to sleep");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException er){
            System.out.println(er);
        }
    }
}
