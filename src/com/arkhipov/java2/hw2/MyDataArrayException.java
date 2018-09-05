package com.arkhipov.java2.hw2;

public class MyDataArrayException extends MyArrayException {
    private int i;
    private int i1;
    private final String wrong_value_array;

    public MyDataArrayException(String wrong_value_array, int i, int i1, NumberFormatException e) {
        super(wrong_value_array, e);
        this.i = i;
        this.i1 = i1;
        this.wrong_value_array = wrong_value_array;
    }

    @Override
    public String toString() {
        return "Wrong data array at " +
                "row=" + i1 +
                ", coloumn=" + i +
                ": " + wrong_value_array;
    }
}
