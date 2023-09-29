package streamApi;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FruitsStream {

    static List<String> fruits = List.of("Apple","Banana","Kiwi","Oranges","Apple","Banana","Kiwi","Apple","Banana","Kiwi");

    private static void printFruitMap( List<String> fruits){
        Map<String,Long> countedFruits =
                fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(countedFruits);
    }

    public static void main(String[] args) {
        printFruitMap(fruits);

    }
}
