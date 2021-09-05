package com.kelaniya.uni.v4.operation;

public class OperationFactory {

    public Operation getInstance(String operator) {

        Operation operation = null;

        if(operator.equals("add")){
            operation = new AddOperation();
        } else if(operator.equals("sub")){
            operation = new SubOperation();
        } else {
            operation = new MulOperation();
        }
        return operation;
    }
}
