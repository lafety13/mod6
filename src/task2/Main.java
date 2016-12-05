package task2;

import task3.ArraysUtils;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] varOfInteger = {1 , 2, 3, 4, 5, 6};

        // Sum
        System.out.println("sum of integer \n" + ArraysUtils.sum(varOfInteger));

        // Minimum
        System.out.println("min of integer \n" + ArraysUtils.min(varOfInteger));

        // Maximum
        System.out.println("max of integer \n" + ArraysUtils.max(varOfInteger));

        // Max positive
        System.out.println("max positive of integer \n" + ArraysUtils.maxPositive(varOfInteger));;

        // Modulus
        System.out.println("modulus of integer \n" + ArraysUtils.modulus(varOfInteger));

        // Multiplication
        System.out.println("multiplication of integer \n" + ArraysUtils.multiplication(varOfInteger));

        // Second largest
        System.out.println("second largest of integer \n" + ArraysUtils.secondLargest(varOfInteger));

        //reverse
        System.out.println("reverse \n" + Arrays.toString(ArraysUtils.reverse(varOfInteger)));

        //findEvenElements
        System.out.println("findEvenElements \n" + Arrays.toString(ArraysUtils.findEvenElements(varOfInteger)));
        System.out.println();
    }
}
