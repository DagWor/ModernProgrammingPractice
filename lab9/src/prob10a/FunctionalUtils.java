package prob10a;

import java.util.List;
import java.util.function.Function;

public abstract class FunctionalUtils {
    public static Function<List<Simple>, Boolean> someSimpleIsTrueFunctional = (list) ->
            list
                    .stream()
                    .map(simple -> simple.flag)
                    .reduce((l1, l2) -> l1 || l2).orElse(false);
}
