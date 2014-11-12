package classic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import panda.Panda;

public class ClassicPandaFilteringTest {

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
	public void testClassicFiltering() {

		System.out.println("All pandas: ");
		System.out.println(pandaBucket);

		System.out.println("---------------------");

		List<Panda> brightBucket = PandaFilter.filter(pandaBucket, new BrightnessCriteria());

		Assert.assertTrue(brightBucket.size() == 3);
		System.out.println("Smarty pants pandas: ");
		System.out.println(brightBucket);

		System.out.println("---------------------");

		List<Panda> solidBucket = PandaFilter.filter(pandaBucket, new SolidnessCriteria());
		Assert.assertTrue(solidBucket.size() == 2);
		System.out.println("Serious buisness pandas: ");
		System.out.println(solidBucket);
	}

	@Test
	public void testPreLambdaFiltering() {
		List<Panda> oldBucket = PandaFilter.filter(pandaBucket, new Criteria() {

			@Override
			public boolean doesItFit(Panda panda) {
				return panda.getWeight() < 0;
			}
		});
		Assert.assertTrue(oldBucket.size() == 1);
		System.out.println("---------------------");
		System.out.println("Old and rusty pre-lambda panda: ");
		System.out.println(oldBucket);

	}

	@Test
	public void testWeirdFiltering() {

		List<Panda> weirdBucket = PandaFilter.filter(pandaBucket, p -> p.getWeight() < 0);
		Assert.assertTrue(weirdBucket.size() == 1);
		System.out.println("---------------------");
		System.out.println("Not sure how this happened: ");
		System.out.println(weirdBucket);

	}
}
