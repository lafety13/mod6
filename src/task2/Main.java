package task2;

import task3.ArraysUtils;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArraysUtils calc = new ArraysUtils();
        int[] varOfInteger = {1 , 2, 3, 4, 5, 6};

        // Sum
        System.out.println("sum of integer \n" + calc.sum(varOfInteger));

        // Minimum
        System.out.println("min of integer \n" + calc.min(varOfInteger));

        // Maximum
        System.out.println("max of integer \n" + calc.max(varOfInteger));

        // Max positive
        System.out.println("max positive of integer \n" + calc.maxPositive(varOfInteger));;

        // Modulus
        System.out.println("modulus of integer \n" + calc.modulus(varOfInteger));

        // Multiplication
        System.out.println("multiplication of integer \n" + calc.multiplication(varOfInteger));

        // Second largest
        System.out.println("second largest of integer \n" + calc.secondLargest(varOfInteger));

        //reverse
        System.out.println("reverse \n" + Arrays.toString(calc.reverse(varOfInteger)));

        //findEvenElements
        System.out.println("findEvenElements \n" + Arrays.toString(calc.findEvenElements(varOfInteger)));
        System.out.println();
    }
}
