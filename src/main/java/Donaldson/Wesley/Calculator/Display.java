package Donaldson.Wesley.Calculator;

import java.util.*;
/**
 * Created by wesleydonaldson on 9/12/16.
 */
public class Display {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        int mode;
        int choice;

        System.out.println("Display Menu. Chose option below");
        System.out.println("1. Binary");
        System.out.println("2. Octal");
        System.out.println("3. Decimal");
        System.out.println("4. Hexadecimal");

        mode = scan.nextInt();


        if (mode == 1) {

            System.out.println("--Binary Menu--");
            System.out.println("0, 1, 10, 11, 100, 101, 1000, 1001, etc...");
            System.out.println("Push 0 to go back");
            choice = scan.nextInt();
                if(choice == 0) {

                    System.out.println("Display Menu. Chose option below");
                    System.out.println("1. Binary");
                    System.out.println("2. Octal");
                    System.out.println("3. Decimal");
                    System.out.println("4. Hexadecimal");

                } else {

                    System.out.println("Invalid option");

                }
        } else if (mode == 2) {

            System.out.println("--Octal Menu--");
            System.out.println("Ocatal number system: 0-7");
        }


    }
}




