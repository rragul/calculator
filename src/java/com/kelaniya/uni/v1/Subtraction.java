package com.kelaniya.uni.v1;

import java.io.IOException;

public class Subtraction {
    NumbersReader read = new NumbersReader();

    public Subtraction() throws IOException {
    }

    public int Subtraction() throws IOException {
        return read.numbers.get(0) - read.numbers.get(1);
    }
}
