package eight;

import panda.Panda;

public class Criterias {

	public static boolean isBright(Panda panda) {
		return !panda.getColor().equals("shadow");
	}

	public static boolean isSolid(Panda panda) {
		return (panda.getWeight() >= 100);
	}

}
