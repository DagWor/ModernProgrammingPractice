package study1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("iuytresdfxgchv");
        books.add("2efwd");
        books.add("345678908765432");

        System.out.println(wordCount(books));
    }

    public static long wordCount(List<String> s){
        return s
                .stream()
                .filter(word -> word.length() >= 12)
                .count();
    }

    public static List<String> find(List<String> s, String letter){
        return s
                .stream()
                .filter(name -> name.startsWith(letter))
                .collect(Collectors.toList());

    }
}
