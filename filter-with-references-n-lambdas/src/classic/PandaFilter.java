package classic;

import java.util.ArrayList;
import java.util.List;

import panda.Panda;

public class PandaFilter {

	public static List<Panda> filter(List<Panda> sourceList, Criteria criteria) {

		List<Panda> targetList = new ArrayList<>();

		for (Panda panda : sourceList) {
			if (criteria.doesItFit(panda)) {
				targetList.add(panda);
			}
		}

		return targetList;
	}
}
