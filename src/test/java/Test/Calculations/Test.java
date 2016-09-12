package Test.Calculations;
import java.util.*;
/**
 * Created by wesleydonaldson on 9/12/16.
 */
public class Test {

    public static int main(String args[]) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Choose method: ");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4. Divide");
        int choice = scan.nextInt();

        System.out.println("Chose number: ");
        int firstNum = scan.nextInt();

        System.out.println("Chose second number: ");
        int secNum = scan.nextInt();
        double answer;


        switch (choice) {


            case 1:


            answer = firstNum + secNum;
            System.out.println("Total: " + answer);
            break;

            case 2:

                answer = firstNum - secNum;
            System.out.println(firstNum - secNum);
            break;

            case 3:

                answer = firstNum * secNum;
            System.out.println("Total: " + answer);

            case 4:

                answer = firstNum / secNum;
            System.out.println("Total: " + answer);
            break;

            default:
                System.out.println("Invalid number");
                break;


        }

        return answer;
    }
}



