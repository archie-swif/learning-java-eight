package chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class TransactionsTask {

	Trader raoul = new Trader("Raoul", "Cambridge");
	Trader mario = new Trader("Mario", "Milan");
	Trader alan = new Trader("Alan", "Cambridge");
	Trader brian = new Trader("Brian", "Cambridge");

	List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400), new Transaction(
					mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan,
					2012, 950));

	/**
	 * Find all transactions in the year 2011 and sort them by value (small to
	 * high).
	 */
	@Test
	public void testOne() {

		List<Transaction> filtered = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

		System.out.println(filtered);
		Assert.assertEquals(2, filtered.size());

	}
}
