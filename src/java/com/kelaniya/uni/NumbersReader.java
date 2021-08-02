package com.kelaniya.uni;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersReader {
    Path filePath = Paths.get("src/numbers.txt");
    Scanner scanner = new Scanner(filePath);

    List<Integer> numbers = new ArrayList<Integer>();

    public NumbersReader() throws IOException {
        while (scanner.hasNext()) {
            if(scanner.hasNext()){
                numbers.add(scanner.nextInt());
            }else{
                scanner.next();
            }
        }
    }
}
