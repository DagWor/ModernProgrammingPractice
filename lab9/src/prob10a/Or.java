package prob10a;

import java.util.*;
import java.util.function.Function;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

		System.out.println("first way : " + someSimpleIsTrue(list));
		System.out.println("second way : " + FunctionalUtils.someSimpleIsTrueFunctional.apply(list));

	}

	public static boolean someSimpleIsTrue(List<Simple> list) {
		boolean accum = false;
		for(Simple s: list) {
			accum = accum || s.flag;
		}
		return accum;
	}



}
