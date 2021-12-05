import java.util.Arrays;
import static java.lang.Integer.valueOf;

class Les2 {
    public static void main(String[] args) {
        Les2 main = new Les2();
        String[][] myArray = {{"2", "4", "2", "5"}, {"2", "3", "1", "3"}, {"1", "1", "2", "5"}, {"1", "5", "1", "6"}};
        String[][] myArray2 = {{"1", "3", "e", "5"}, {"2", "4", "5", "r"}, {"1", "w", "3", "5", "5"}, {"1", "w", "1", "6"}};
        String[][] myArray3 = {{"1", "3", "e", "5"}, {"2", "4", "5", "r"}, {"1", "w", "3", "5"}, {"1", "w", "1", "6"}, {"1", "w", "1", "6"}};

        try {
            main.arrExceptionSize(myArray);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            main.arrExceptionSize(myArray2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            main.arrExceptionSize(myArray3);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Сумма " + arrExceptionData(myArray));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Сумма " + arrExceptionData(myArray2));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    static public void arrExceptionSize(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Количество строк задано неверно");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов в " + (i+1) +
                    "-й строке", i));
        }
        System.out.println(Arrays.deepToString(arr));
    }

    static public int arrExceptionData(String[][] arr) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += valueOf(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В ячейке [" + (i+1) + "][" + (j+1) + "] текущего массива находится не целое число.", i, j, arr[i][j]));
                }
            }
        }
        return sum;

    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException  extends NumberFormatException {
    public MyArrayDataException (String message) {
        super(message);
    }
}
