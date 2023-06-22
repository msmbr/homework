package org.example.libraries;

import java.util.List;

public class MathLibrary {
    public double getAverage(List<Integer> lst) {
        return lst.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }
}
