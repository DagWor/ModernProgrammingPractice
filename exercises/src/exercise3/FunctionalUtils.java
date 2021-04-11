package exercise3;

import java.util.function.BiFunction;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class FunctionalUtils {
    public static BiFunction<Tournament, Integer, Player> topScorer = (tournament, k) ->
            Stream.of(tournament)
                    .flatMap(tournament1 -> tournament1.getMatchList().stream())
                    .flatMap(match -> match.getTeams().stream())
                    .flatMap(team -> team.getPlayerList().stream())
                    .min((p1, p2) -> p2.getGoalList().size() - p1.getGoalList().size())
                    .get();



}
