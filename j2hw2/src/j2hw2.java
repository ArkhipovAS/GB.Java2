//import java.util.Arrays;

public class j2hw2 {

    private static final int SIZE = 4;
    private static String [][] array = new String[][] {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"5", "6", "7", "8"},
            {"1", "2", "3", "4"}};

    public static void main(String[] args) {

        try {
            int resultsum = calcArraySum(array);
            System.out.println("The sum of all elements of the array is: " + resultsum);
        } catch (MyArraySizeException e){
            System.out.println("Wrong size array" + e.toString());
        } catch (MyDataArrayException e){
            System.out.println("Wrong data array" + e.toString());
        }

    }

    private static int calcArraySum(String [][] array) throws MyArraySizeException, MyDataArrayException {
        int result = 0;
        try {
            if (array.length != SIZE)
                throw new MyArraySizeException("Wrong size array " + array.length);

            for (int i = 0; i < array.length; i++) {
                if (array[i].length != SIZE)
                    throw new MyArraySizeException("Wrong size array: "+ array.length);

                for (int i1 = 0; i1 < array[i].length; i1++) {
                    try {
                        result += Integer.parseInt(array[i][i1]);
                    }
                    catch (NumberFormatException e) {
                        //System.out.println(e.toString());
                        throw new MyDataArrayException("Wrong data value: " + array[i][i1], i, i1, e);
                    }
                }

            }
        }
        catch (MyArrayException e){
            System.out.println(e.toString());
        }
        return result;
    }


}
