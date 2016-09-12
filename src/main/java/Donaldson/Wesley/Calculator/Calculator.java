package Donaldson.Wesley.Calculator;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;
/**
 * Created by wesleydonaldson on 9/12/16.
 */
public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double firstNum;
        double secNum;
        double answer;
        int choice;
        int num1;
        int num2;
        Display display = new Display();

        System.out.println("Button 1 - Add");
        System.out.println("Button 2 - Subtract");
        System.out.println("Button 3 - Multiply");
        System.out.println("Button 4 - Divide");
        System.out.println("Chose a operator");
            choice = scan.nextInt();

        if (choice == 1) {

            System.out.println("You chose addition");
            System.out.println("Chose number: ");
            firstNum = scan.nextDouble();

            System.out.println("Chose second number: ");
            secNum = scan.nextDouble();

            answer = firstNum + secNum;
            System.out.println(firstNum + "+" + secNum + "=" + answer);

        }else if (choice == 2) {

            System.out.println("You chose subtraction");
            System.out.print("Chose number: ");
            firstNum = scan.nextDouble();

            System.out.println("Chose number: ");
            secNum = scan.nextDouble();

            answer = firstNum - secNum;
            System.out.println(firstNum + "-" + secNum + " =" + answer);
        } else if (choice == 3) {

            System.out.println("You chose multiply");
            System.out.println("Chose number: ");
            firstNum = scan.nextDouble();

            System.out.println("Chose second number: ");
            secNum = scan.nextDouble();

            answer = firstNum * secNum;
            System.out.println(firstNum + "*" + secNum + "=" + answer);
        } else if (choice == 4){

            System.out.println("You chose division");
            System.out.println("Chose a number: ");
            firstNum = scan.nextDouble();

            System.out.println("Chose a second number: ");
            secNum = scan.nextDouble();

                if (firstNum == 0|| secNum == 0) {

                    System.out.println("Err cant divide by 0");
                    return;
                }

            answer = firstNum / secNum;
            System.out.println(firstNum + "/" + secNum + "=" + answer);
        }


    }

        }

