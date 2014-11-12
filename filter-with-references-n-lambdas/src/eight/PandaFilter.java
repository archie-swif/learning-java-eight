package eight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import panda.Panda;

public class PandaFilter {

	public static List<Panda> filter(List<Panda> sourceList, Predicate<Panda> predicate) {

		List<Panda> targetList = new ArrayList<>();

		for (Panda panda : sourceList) {
			if (predicate.test(panda)) {
				targetList.add(panda);
			}
		}
		return targetList;
	}

}
