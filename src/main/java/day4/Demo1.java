package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

    public String[] split(String input) {
        return input.split("\\s");
    }

    public List<String> filter(String input) {
        String[] result = split(input);

        List<String> afterFilter = new ArrayList<>();
        for (String string : result) {
            if (!"of".equals(string)) {
                afterFilter.add(string);
            }
        }
        return afterFilter;
    }

    public String up(String input) {
        List<String> afterFilter = filter(input);

        String result = "";
        for (String string : afterFilter) {
            result += string.charAt(0);
        }
        return result.toUpperCase();
    }

    public String low(String input) {
        List<String> afterFilter = filter(input);

        String result = "";
        for (String string : afterFilter) {
            result += string.charAt(0);
        }
        return result.toLowerCase();
    }
    public String ofStream(String input) {
        return Stream.of(input.toUpperCase().split(" "))
                .filter(e -> !"of".equalsIgnoreCase(e))
                .map(e -> String.valueOf(e.charAt(0)))
                .collect(Collectors.joining(""));
    }
}
