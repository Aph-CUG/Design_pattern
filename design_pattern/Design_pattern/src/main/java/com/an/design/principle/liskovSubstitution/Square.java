package com.an.design.principle.liskovSubstitution;

public class Square implements Quadrangle{
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return 0;
    }

    @Override
    public long getLength() {
        return 0;
    }
}
