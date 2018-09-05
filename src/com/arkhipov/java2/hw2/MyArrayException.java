package com.arkhipov.java2.hw2;

public class MyArrayException extends Exception{

    public MyArrayException(String wrong__array) {
        super(wrong__array);
    }

    public MyArrayException(String wrong_value_array, NumberFormatException e) {
        super(wrong_value_array, e);
    }
}
