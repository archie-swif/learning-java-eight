package eight;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import panda.Panda;

public class EightPandaFilteringTest {

	private static List<Panda> pandaBucket = new ArrayList<>();

	@BeforeClass
	public static void setUpPandas() {
		Panda sam = new Panda("shadow", 120);
		Panda wee = new Panda("pink", 14);
		Panda joe = new Panda("orange", 6500);
		Panda bop = new Panda("transparent", -3);

		pandaBucket.add(sam);
		pandaBucket.add(wee);
		pandaBucket.add(joe);
		pandaBucket.add(bop);
	}

	@Test
	public void testEightFiltering() {
		System.out.println("All pandas: ");
		System.out.println(pandaBucket);

		System.out.println("---------------------");

		List<Panda> brightBucket = PandaFilter.filter(pandaBucket, Criterias::isBright);

		Assert.assertTrue(brightBucket.size() == 3);
		System.out.println("Smarty pants pandas: ");
		System.out.println(brightBucket);

		System.out.println("---------------------");

		List<Panda> solidBucket = PandaFilter.filter(pandaBucket, Criterias::isSolid);
		Assert.assertTrue(solidBucket.size() == 2);
		System.out.println("Serious buisness pandas: ");
		System.out.println(solidBucket);

	}

	@Test
	public void lambdaFilterTest() {

		System.out.println("---------------------");

		List<Panda> lambdaBucket = PandaFilter.filter(pandaBucket, predicate -> predicate.getWeight() < 0);
		Assert.assertTrue(lambdaBucket.size() == 1);
		System.out.println("Modern zero-gravity-lambda-filtered panda: ");
		System.out.println(lambdaBucket);

	}

}
