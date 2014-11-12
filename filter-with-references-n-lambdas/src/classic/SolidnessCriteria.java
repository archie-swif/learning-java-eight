package classic;

import panda.Panda;

public class SolidnessCriteria implements Criteria {

	@Override
	public boolean doesItFit(Panda panda) {
		return (panda.getWeight() >= 100);
	}

}
