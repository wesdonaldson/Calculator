package Donaldson.Wesley.Calculator;

import org.junit.Test;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;
/**
 * Created by wesleydonaldson on 9/12/16.
 */
public class Calculator {

    private TrigMethods trigMethod = new TrigMethods();
    private Display display = new Display();
    private boolean running = false;
    int firstNum;
    int secNum;
    double answer;
    public void runCalculator() {




        running = true;
        while (running) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose operator: ");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Change mode");
        System.out.println("6. Trig functions");
        System.out.println("7. Clear");

        int choice = scan.nextInt();





            switch (choice) {



                case 1:

                    numberChoice();

                    answer = Calculations.add(firstNum, secNum);
                    System.out.println("Total :" + "" + answer);
                    break;

                case 2:

                    numberChoice();

                    answer = Calculations.subtract(firstNum, secNum);
                    System.out.println("Total :" + "" + answer);
                    break;

                case 3:

                    numberChoice();

                    answer = Calculations.multiply(firstNum, secNum);
                    System.out.println("Total :" + "" + answer);
                    break;

                case 4:

                    numberChoice();

                    answer = Calculations.divide(firstNum, secNum);
                        if (firstNum == 0 || secNum == 0) {

                            System.out.println("Err");
                            running = false;
                        } else {
                            System.out.println("Total :" + "" + answer);
                        }
                    break;


                case 5:

                    display.changeMode();

                break;

                case 6:

                    trigMethod.trigFuncDegrees();

                    break;

                case 7:

                    running = false;
                    System.out.println("Clear");
                    break;

                default:

                    System.out.println("Invalid number");
                break;
            }

            System.out.println("Do you want to clear yes or no?");
            String clear = scan.next();

            if (clear.equalsIgnoreCase("yes")) {

                running = false;
            }




        }
    }

    public void numberChoice() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Chose number: ");
        firstNum = scan.nextInt();

        System.out.println("Chose second number: ");
        secNum = scan.nextInt();

    }
}

