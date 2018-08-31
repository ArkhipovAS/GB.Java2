public class MyArraySizeException extends MyArrayException {

    private int length;

    public MyArraySizeException(String wrong_size_array ) {
        super(wrong_size_array);
    }

    public MyArraySizeException(String wrong_size_array, int length) {
        super(wrong_size_array);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Wrong size array at " +
                "row = " + length;
    }
}
