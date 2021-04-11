package exercise2;

import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public abstract class FunctionalUtils {
    public static BiFunction<Company, Integer, Float> annualExpense = (company, date) ->
            FunctionalUtils.common.apply(company, date)
                .stream()
                .map(Item::getAmount)
                .reduce(Float::sum)
                .orElse(0f);


//    public static BiFunction<Company, Integer, Category> famousCategory = (company, integer) ->
//            ((Long) FunctionalUtils.common.apply(company, integer)
//                    .stream()
//                    .map(Item::getCategory)
//                    .col


    public static BiFunction<Company, Integer, List<Item>> common = (company, date) ->
            Stream.of(company)
                    .flatMap(c -> c.getDepartments().stream())
                    .flatMap(d -> d.getStaff().stream())
                    .flatMap(s -> s.getExpenseClaims().stream())
                    .filter(e -> e.getDate().getYear() == date)
                    .flatMap(i -> i.getItems().stream()).collect(Collectors.toList());


}
