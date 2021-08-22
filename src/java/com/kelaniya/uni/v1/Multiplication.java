package com.kelaniya.uni.v1;

import java.io.IOException;

public class Multiplication {
    NumbersReader read = new NumbersReader();

    public Multiplication() throws IOException {
    }

    public int Multiplication() throws IOException {
        return read.numbers.get(0) * read.numbers.get(1);
    }
}
