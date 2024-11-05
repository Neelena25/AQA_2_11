public class Factorial {
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Не можете вычислить факториал отрицательного числа.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

