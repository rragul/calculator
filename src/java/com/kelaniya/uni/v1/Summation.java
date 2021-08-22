package com.kelaniya.uni.v1;

import java.io.IOException;

public class Summation {
    NumbersReader read = new NumbersReader();

    public Summation() throws IOException {
    }

    public double Summation() throws IOException {
            return read.numbers.get(0) + read.numbers.get(1);
    }
}
