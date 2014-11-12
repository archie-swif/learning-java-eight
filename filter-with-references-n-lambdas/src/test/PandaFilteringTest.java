package test;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import panda.Panda;
import classic.BrightnessCriteria;
import classic.PandaFilter;
import classic.SolidnessCriteria;

public class PandaFilteringTest {

	@Test
	public void testClassicFiltering() {
		Panda sam = new Panda("shadow", 120);
		Panda wee = new Panda("pink", 14);
		Panda joe = new Panda("orange", 6500);
		Panda bop = new Panda("transparent", -3);

		List<Panda> pandaBucket = new ArrayList<>();
		pandaBucket.add(sam);
		pandaBucket.add(wee);
		pandaBucket.add(joe);
		pandaBucket.add(bop);

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

}
