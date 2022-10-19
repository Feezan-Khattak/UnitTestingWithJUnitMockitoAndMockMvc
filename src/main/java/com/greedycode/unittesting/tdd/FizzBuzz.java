package com.greedycode.unittesting.tdd;

import java.io.InputStream;

public class FizzBuzz {

//    public String solveFor(int number){
//        String returnStr = "";
//        if(number%3 == 0 && number%5 == 0){
//            returnStr = "FizzBuzz";
//        }
//        else if(number%3 == 0){
//            returnStr = "Fizz";
//        }else if(number%5 == 0){
//            returnStr = "Buzz";
//        }else{
//            returnStr = String.valueOf(number);
//        }
//        return returnStr;
//    }


    // Refactoring the code with some new login without touching the test cases.
    public String solveFor(int number){
        return number%3==0 && number%5==0 ? "FizzBuzz" :
                (
                        number%3==0 ? "Fizz" :
                        (
                                number%5==0 ? "Buzz" :
                                String.valueOf(number)
                        )
                );
    }
}
