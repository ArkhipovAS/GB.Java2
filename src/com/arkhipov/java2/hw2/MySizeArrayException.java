package com.arkhipov.java2.hw2;

public class MySizeArrayException extends MyArrayException {

    private int length;

    public MySizeArrayException(String wrong__array ) {
        super(wrong__array);
    }

    public MySizeArrayException(String wrong__array, int length) {
        super(wrong__array);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Wrong  array at " +
                "row = " + length;
    }
}
