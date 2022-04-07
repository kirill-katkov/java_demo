package guru.qa;

public class FirstApp {

    static char symbol;
    static boolean flag;
    static byte aByte;
    static short aShort;
    static int aInt;
    static Integer boxed;
    static long aLong;
    static float aFloat;
    static double aDouble;
    static String aString = "Hello";
    char[] array;
    boolean flagYes;

    // Имя переменной присваивается в конструкторе.
    public FirstApp() {
        symbol = 'm'; // Character
        flag = true;  // Boolean
        aByte = 123; //128 to 127
        aShort = 15; // -32,768 to 32,767
        aInt = 200000;  //2,147,483,648 to 2,147,483,647
        boxed = 1;
        aLong = 123L; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        aFloat = 1.2F; // Floating point number 6 to 7 decimal digits
        aDouble = 123.2D;
        array = new char[]{'A', 'B', 'C'};
        flagYes = true;
    }

    public static void main(String[] args) {
        FirstApp create = new FirstApp();
        System.out.println(aString);
        setBoolean(true);
        multioperation(56, 54.4F, 124.44D);
    }

    private static String getNameType(Object myType) {
        return myType.getClass().getSimpleName();
    }

    public static void setBoolean(Boolean mainBoolean) {
        if (mainBoolean) {
            System.out.println("Ниже будут показаны типы данных в Java");
            System.out.println("aByte type is " + getNameType(aByte) + " " + "meaning:" + aByte);
            System.out.println("aInt type is " + getNameType(aInt) + " " + "meaning:" + aInt);
            System.out.println("aLong type is " + getNameType(aLong) + " " + "meaning:" + aLong);
            System.out.println("aFloat type is " + getNameType(aFloat) + " " + "meaning:" + aFloat);
            System.out.println("aDouble type is " + getNameType(aDouble) + " " + "meaning:" + aDouble);

            System.out.println("Отображение максимального и минимального значения Integer");
            System.out.println("Max value = " + getMaxIntNumber());
            System.out.println("Min value = " + getMinIntNumber());
            mathematical(10, 5);
        }
    }

    public static void mathematical(int a, int b) {
        System.out.println("Работа с типом данных int");
        System.out.println("Сложение " + a + " и " + b + " = " + summa(a, b));
        System.out.println("Вычетание " + a + " из " + b + " = " + subtraction(a, b));
        System.out.println("Умножение " + a + " на " + b + " = " + multiplication(a, b));
        System.out.println("Деление " + a + " на " + b + " = " + division(a, b));
    }

    public static void multioperation(int a, float b, double c) {
        System.out.println("Работа с разными типами данных");
        System.out.println("Сложение  " + a + " и " + b + " = " + summa(a, b));
        System.out.println("Вычитяние " + b + " из " + c + " = " + subtraction(b, c));
        System.out.println("Умножение " + b + " на " + c + " = " + multiplication(b, c));
        System.out.println("Деление " + c + " на " + b + " = " + division((int) c, b));
        Byte newByte = 123;
        int newInt = newByte + newByte;
        System.out.println("Byte+Byte=" + newInt);
        printArray();
    }

    public static void printArray() {
        int[] array = new int[]{100, 305, 334};
        System.out.print("Print Array elements:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static int getMaxIntNumber() {
        return Integer.MAX_VALUE;
    }

    static int getMinIntNumber() {
        return Integer.MIN_VALUE;
    }

    static int summa(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }

    static double summa(double a, double b) {
        return a + b;
    }

    static double subtraction(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double division(double a, int b) {
        return a / b;
    }


    static float summa(float a, float b) {
        return a + b;
    }

    static float subtraction(float a, float b) {
        return a - b;
    }

    static float multiplication(float a, float b) {
        return a * b;
    }

    static float division(float a, float b) {
        return a / b;
    }

}
