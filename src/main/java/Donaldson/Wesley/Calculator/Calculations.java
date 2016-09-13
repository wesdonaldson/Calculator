package Donaldson.Wesley.Calculator;

/**
 * Created by wesleydonaldson on 9/11/16.
 */
public class Calculations {



    public static double add(double a, double b) {

        return a+b;
    }

    public static double subtract(double a, double b) {

        return a-b;
    }

    public static double multiply(double a, double b) {

        return a*b;
    }

    public static double divide(double a, double b) {

        return a/b;
    }

    public static double pow(double a, double b) {

        double answer = a;

        for (int i = 2; i <= b; i++) {
            answer *= a;
        }

        return answer;
    }

    public static double sqrt(double a) {

        return Math.sqrt(a);
    }

    public static double squareRoot(double a) {

        return a * a;
    }

    public static String toBinaryString(int i) {


        return Integer.toBinaryString(i);
    }

    public static String toOctalString(int i) {

        return Integer.toOctalString(i);
    }

    public static String toHexaDecimalString(int i) {

        return Integer.toHexString(i);
    }





}
