package Donaldson.Wesley.Calculator;

import java.util.*;
/**
 * Created by wesleydonaldson on 9/12/16.
 */
public class Display {




        String answer;
        Calculations calc = new Calculations();
        private String currentDisplay;
        private int displayIntegerNumber;
        private Scanner input = new Scanner(System.in);
        private int mode;


    public void changeMode() {

        System.out.println("Display Menu. Chose option below");
        System.out.println("1. Binary");
        System.out.println("2. Octal");
        System.out.println("3. Hexadecimal");
        typeChoice();
    }


    public void typeChoice() {

        int choice = input.nextInt();
        if (choice < 1 || choice > 4) {
            while (choice < 1 || choice > 4) {

                System.out.println("Invalid input");
                choice = input.nextInt();

            }
            mode = choice;
        } else {
            outPut(choice);
            mode = choice;
        }

    }


    public String outPut(int choice) {

        System.out.println("Chose number");
        int num = input.nextInt();

        switch (choice) {

            case 1:


                answer = calc.toBinaryString(num);
                System.out.println(answer + " Binary conversion");


                break;

            case 2:

                answer = calc.toOctalString(num);
                System.out.println(answer + " Octal conversion");

                break;

            case 3:

                answer = calc.toHexaDecimalString(num);
                System.out.println(answer + " Hexadecimal conversion");

                break;

            default:

                System.out.println("Not valid");

        }

        return answer;
    }
}










