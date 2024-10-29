import Practice_Project_10.Animal;
import Practice_Project_10.Bowl;
import Practice_Project_10.Cat;
import Practice_Project_10.Dog;
import Practice_Project_10_2.Circle;
import Practice_Project_10_2.Rectangle;
import Practice_Project_10_2.Shape;
import Practice_Project_10_2.Triangle;

import java.sql.SQLOutput;

public class Main
{
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
    if (array.length != 4 || array[0].length != 4) {
        throw new MyArraySizeException("Размер массива должен быть 4x4.");
    }

    int sum = 0;

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            try {
                sum += Integer.parseInt(array[i][j]);
            } catch (NumberFormatException e) {
                throw new MyArrayDataException(
                        "Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
            }
        }
    }

    return sum;
}

    public static void main(String[] args)
    {
            String[][] validArray = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };

            String[][] invalidSizeArray = {
                    {"1", "2", "3"},
                    {"4", "5", "6"}
            };

            String[][] invalidDataArray = {
                    {"1", "2", "three", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };

            try {
                System.out.println("Сумма элементов массива: " + sumArray(validArray));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }

            try {
                System.out.println("Сумма элементов массива: " + sumArray(invalidSizeArray));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }

            try {
                System.out.println("Сумма элементов массива: " + sumArray(invalidDataArray));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}
