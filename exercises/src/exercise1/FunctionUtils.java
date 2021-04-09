package exercise1;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public abstract class FunctionUtils {


    @FunctionalInterface
    public interface Ternary<X, Y, Z, R>{
        R apply(X x, Y y, Z z);
    }

    BiFunction<University, Integer, List<Course>> topDepartmentCourseFailed = (university1, k) ->
            university1.getDepartments()
                    .stream()
                    .flatMap(department2 -> department2.getProfessorList().stream())
                    .flatMap(professors -> professors.getGrades().stream())
                    .filter(Grade::getPass)
                    .collect(Collectors.groupingBy(Grade::getCourse))
                    .entrySet()
                    .stream()
                    .sorted((o1, o2) -> o2.getValue().size() - o1.getValue().size())
                    .limit(k)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
}
