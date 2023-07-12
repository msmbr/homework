package org.example.strategy;

public class Context {
    private AreaStrategy areaStrategy;

    public Context() {
    }

    public Context(AreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    public AreaStrategy getAreaStrategy() {
        return areaStrategy;
    }

    public double getArea(double height, double width) {
        return areaStrategy.calculateArea(height, width);
    }

    public void setAreaStrategy(AreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }
}
