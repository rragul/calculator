package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs{

    private final String[] args;

    //Constructors of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() throws InvalidOperationException {
        //make sure  to validate the arguments before using
        if (args.length == 0){
            throw new InvalidOperationException("Please provide the operation as an argument");
        }

        //is add, sub, mul
        String operator = args[0];
        if( !(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            throw new InvalidOperationException("Please provide add, sub or mul as the operator");
        }

        return operator;
    }
}
