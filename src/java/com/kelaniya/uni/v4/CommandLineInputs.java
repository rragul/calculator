package com.kelaniya.uni.v4;

public class CommandLineInputs {

    private final String[] args;

    //Constructors of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() {
        //make sure  to validate the arguments before using
        if (args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return "";
        }

        //is add, sub, mul
        String operator = args[0];

        if( !(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide add, sub or mul as the operator");
            return "";
        }

        return operator;
    }
}
