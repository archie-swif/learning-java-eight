package classic;

import panda.Panda;

public class BrightnessCriteria implements Criteria {

	@Override
	public boolean doesItFit(Panda panda) {
		return !panda.getColor().equals("shadow");
	}

}
