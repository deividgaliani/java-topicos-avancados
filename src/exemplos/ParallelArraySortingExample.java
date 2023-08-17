package exemplos;

import java.util.Arrays;

public class ParallelArraySortingExample {

    public static void main(String[] args) {

        int[] numbers = {5, 8, 1, 50, 25, 12, 34, 19, -3};
        System.out.println("Before sort:");
        for(int i : numbers){
            System.out.print(i + ", ");
        }

        Arrays.parallelSort(numbers);
        System.out.println("\nAfter sort:");
        for(int i : numbers){
            System.out.print(i + ", ");
        }


    }
}
