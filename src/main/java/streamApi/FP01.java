package streamApi;

import java.util.List;

public class FP01 {

private static void printEvenNumbers(List<Integer> numbers){
    numbers.stream().filter(number -> number%2==0).forEach(System.out::println);
}


    public static void main(String[] args) {
        printEvenNumbers(List.of(1,2,3,4,5,6,7,8,9));
    }
}
