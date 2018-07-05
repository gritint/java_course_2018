package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class MainStream {

    public static void main(String[] args) {
        MainStream p = new MainStream();
        p.start();
    }

    private void start() {
        String[] datas = new String[] {"One", "Two", "Three"};
        Stream<String> stream = Arrays.stream(datas);
        stream.forEach(System.out::print);
        // Collection
        List<String> lists = new ArrayList<>();
        lists.add("One");
        lists.add("Two");
        lists.add("Three");
        lists.stream().forEach(System.out::println);
        lists.stream().forEach(System.out::println);
        // Filter data that start with "T'
        List<String> after = new ArrayList<>();
        for(String string : lists ) {
            if(string.startsWith("T")) {
                after.add(string);
            }
        }
        // Filter With Stream
        lists.stream()
        .filter(string -> string.startsWith("T"))
        .forEach(System.out::print);
        // Convert to Lowercase
        System.out.println("\n=====");
        lists.stream()
        .filter(string -> string.startsWith("T"))
        .map(string -> string.toLowerCase())
        .forEach(System.out::print);
        
        // Save output to list
        System.out.println("\n=====");
        List<String> result =
                    lists.stream()
                    .filter(string -> string.startsWith("T"))
                    .map(string -> string.toLowerCase())
                    .collect(Collectors.toList());
                    result.forEach(System.out::print);
    }

}
