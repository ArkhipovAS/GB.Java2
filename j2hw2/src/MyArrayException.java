public class MyArrayException extends Exception{

    public MyArrayException(String wrong_size_array) {
        super(wrong_size_array);
    }

    public MyArrayException(String wrong_value_array, NumberFormatException e) {
        super(wrong_value_array, e);
    }
}
