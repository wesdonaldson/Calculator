package Donaldson.Wesley.Calculator;

/**
 * Created by wesleydonaldson on 9/11/16.
 */
public class Calculations {

    double add(double a, double b) {

        return a+b;
    }

    double subtract(double a, double b) {

        return a-b;
    }

    double multiply(double a, double b) {

        return a*b;
    }

    double divide(double a, double b) {

        return a/b;
    }

    double pow(double a, double b) {

        double answer = a;

        for (int i = 2; i <= b; i++) {
            answer *= a;
        }

        return answer;
    }

    double sqrt(double a) {

        return Math.sqrt(a);
    }


}
