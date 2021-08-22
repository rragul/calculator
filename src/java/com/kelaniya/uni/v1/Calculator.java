package com.kelaniya.uni.v1;

import java.io.IOException;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter operator(sum, sub, mul): ");
        UserInput input = new UserInput();

        int result;
        Summation sum = new Summation();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();

        if(input.operator.equals("sum")) {
            result = sum.Summation();
            System.out.println(result);
        }else if(input.operator.equals("sub")){
            result = sub.Subtraction();
            System.out.println(result);
        }else if(input.operator.equals("mul")){
            result = mul.Multiplication();
            System.out.println(result);
        }else{
            System.out.println("Wrong Input!");
        }

    }
}
