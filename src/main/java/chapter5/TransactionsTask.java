package chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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

	// 1. Find all transactions in the year 2011 and sort them by value (small
	// to high).
	// 2. What are all the unique cities where the traders work?
	// 3. Find all traders from Cambridge and sort them by name.
	// 4. Return a string of all traders’ names sorted alphabetically.
	// 5. Are any traders based in Milan?
	// 6. Print all transactions’ values from the traders living in Cambridge.
	// 7. What’s the highest value of all the transactions?
	// 8. Find the transaction with the smallest value.
	// 9. Make a (tr. value -> transaction) map from a list

	@Test
	public void testOne() {

		List<Transaction> result = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

		System.out.println(result);
		Assert.assertEquals(2, result.size());

	}

	@Test
	public void testTwo() {

		List<String> result = transactions.stream().map(t -> t.getTrader().getName()).distinct()
				.collect(Collectors.toList());

		System.out.println(result);
		Assert.assertEquals(4, result.size());

	}

	@Test
	public void testListToMap() {

		Map<Integer, Transaction> result = transactions.stream().collect(
				Collectors.toMap(Transaction::getValue, Function.identity()));

		System.out.println(result);

	}
}
