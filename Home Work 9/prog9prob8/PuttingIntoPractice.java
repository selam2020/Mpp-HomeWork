package prog9prob8;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
   
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
		// Query 1: Find all transactions from year 2011 and sort them by value (small to high).
				System.out.println("--------Query 1--------");
				transactions.stream()
				.filter(t->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue))
				.forEach(System.out::println);
		        
		        // Query 2: What are all the unique cities where the traders work?
				System.out.print("--------Query 2--------\n");
				transactions.stream()
				.map(t->t.getTrader().getCity())
				.distinct()
				.forEach(System.out::println);
		        // Query 3: Find all traders from Cambridge and sort them by name.
				System.out.println("--------Query 3--------");
				transactions.stream()
				.filter(t->t.getTrader().getCity().equals("Cambridge"))
				.map(t->t.getTrader().getName())
				.sorted()
		        .forEach(System.out::println);
		        // Query 4: Return a string of all traders names sorted alphabetically.
				System.out.println("--------Query 4--------");
		        transactions.stream()
				.map(t->t.getTrader().getName())
				.sorted()
				.forEach(System.out::println);
		        // Query 5: Are there any trader based in Milan?
		        System.out.println("--------Query 5--------");
		        
				System.out.println(transactions.stream()
				.anyMatch(t->t.getTrader().getCity().equals("Milan")));
				
		     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
				System.out.println("--------Query 6--------");
				 transactions.stream()
				.filter(t->t.getTrader().getCity().equals("Milan"))
//				.peek(t->t.getTrader().setCity("Cambridge"))
//				.forEach(System.out::println);
				.forEach(t->t.getTrader().setCity("Cambridge"));
			
		        // Query 7: What's the highest value in all the transactions?
				System.out.println("--------Query 7--------");
				System.out.println(transactions.stream()
						.map(t->t.getValue())
						.max((e1,e2)-> e1.compareTo(e2)));
		    }
		}
