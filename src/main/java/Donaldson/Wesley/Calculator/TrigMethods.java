package Donaldson.Wesley.Calculator;
import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.*;
import java.util.regex.Matcher;

/**
 * Created by wesleydonaldson on 9/12/16.
 */
public class TrigMethods {

    int degrees;


     public void trigFuncDegrees() {

         Scanner scan = new Scanner(System.in);

         System.out.println("Enter value in degrees");

         degrees = scan.nextInt();
         //stores user input in variable degrees

         doMath();
     }

     public int doMath(){

        System.out.println("Lets calculate the sine, cosine, and tan of the angle");

        double sine = Math.sin(degrees);
        double acosine = Math.acos(degrees);
        double atan = Math.atan(degrees);
        //Finds sine, acosine, and atan of users input

        System.out.println("sine of angle  " + degrees + " is" + sine);
        System.out.println("acosine of angle " + degrees + " is" + acosine);
        System.out.println("atan of angle " + degrees + " is" + atan);

         return degrees;

     }

    }




