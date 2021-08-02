package com.kelaniya.uni;

import java.io.IOException;

public class Summation {
    NumbersReader read = new NumbersReader();

    public Summation() throws IOException {
    }

    public int Summation() throws IOException {
            return read.numbers.get(0) + read.numbers.get(1);
    }
}
