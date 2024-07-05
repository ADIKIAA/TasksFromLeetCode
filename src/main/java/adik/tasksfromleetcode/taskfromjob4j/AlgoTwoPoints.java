package adik.tasksfromleetcode.taskfromjob4j;

import java.util.Arrays;

public class AlgoTwoPoints {

    public static int[] compress(int[] array) {

        // i - указывает на элемент равный 0
        // j - указывает на элемент отличный от 0

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        array[i] = array[j];
                        array[j] = 0;
                        break;
                    }
                }
            }

        }
        return array;
    }

    public static int[] compress2Point(int[] array) {
        int i = 0; // i будет указывать на элементы равные 0
        int j = 0; // j будет указывать на элементы отличные от 0

        while (j < array.length) {
            if (array[i] == 0 && array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
            j++;
        }

        return array;
    }

}
