package ru.job4j.condtition;

public class SqArea {

    @SuppressWarnings("checkstyle:LocalVariableName")
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6, 2);
        double result3 = SqArea.square(8, 2);
        double result4 = SqArea.square(5, 3);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result3);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result4);
    }
}
