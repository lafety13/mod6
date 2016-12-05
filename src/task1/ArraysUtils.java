package task1;

import java.util.Arrays;

public final class ArraysUtils {
    public static int sum(int[] values) {
        int sum = 0;
        int len = values.length;

        for (int i=0; i<len; ++i) {
            sum += values[i];
        }
        return sum;
    }

    public static int min(int[] values) {
        int min = values[0];
        int len = values.length;

        for (int i=0; i<len-1; ++i) {
            if (min > values[i+1]) {
                min = values[i+1];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        int len = values.length;

        for (int i=0; i<len-1; ++i) {
            if (max < values[i+1]) {
                max = values[i+1];
            }
        }
        return max;
    }

    public static int maxPositive(int[] values) {
        int max = 0;
        int len = values.length;

        for (int i=0; i<len; ++i) {
            if (values[i] > 0) {
                if (values[i] > max) {
                    max = values[i];
                }
            }
        }
        return max;
    }

    public static int multiplication(int[] values) {
        int result = 1;
        int len = values.length;

        for (int i=0; i<len; ++i) {
            result *= values[i];
        }
        return result;
    }

    public static int modulus(int[] values) {
        int result = 0;
        result = values[0] % values[values.length-1];
        return result;
    }

    public static int secondLargest(int[] values) {
        int firstLargest, secondLargest;

        if (values[0] > values[1]) {
            firstLargest = values[0];
            secondLargest = values[1];
        } else {
            firstLargest = values[1];
            secondLargest = values[0];
        }

        int len = values.length;
        for (int i=2; i<len; ++i) {
            if (values[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = values[i];
            } else if (values[i] < firstLargest && values[i] > secondLargest) {
                secondLargest = values[i];
            }
        }

        return secondLargest;
    }

    public static int[] reverse(int[] array) {
        int len = array.length;
        int[] tmp = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            tmp[len - i - 1] = array[i];
        }
        return tmp;
    }
    public static int[] findEvenElements(int[] array) {
        return Arrays.stream(array)
                .filter(value -> value % 2 == 0)
                .toArray();
    }
}
