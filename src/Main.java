public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        CheckRange(5, 1);
        CheckNumber (3);
        CheckNumberBoolean (7);
        TaskEight(3, "хей");
        TaskNine (2024);
        TaskTen();
        TaskEleven();
        TaskTwelve();
        TaskThirteen();
        CreateFilledArray(3, 6);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value >= 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else if (value >= 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 100;
        int b = 30;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean CheckRange (int a, int b) {
        if (a + b >=10 && a + b <=20){
            return true;
        }
        else {
            return false;
        }
    }

    public static void CheckNumber (int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean CheckNumberBoolean (int d) {
        if (d >= 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void TaskEight(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }

    public static boolean TaskNine(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void TaskTen () {
        int [] array = new int [] {0, 1, 1, 0, 1, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }

    public static void TaskEleven () {
        int [] array = new int [100];

        for (int i = 1; i <= array.length; i++) {
            array[i - i] = i;
        }
    }

    public static void TaskTwelve() {
        int [] array = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
    }

    public static void TaskThirteen() {
        int n = 5;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }
    }

    public static int[] CreateFilledArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}