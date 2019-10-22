package prog9prob4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintSquare {

		public static void printSquares(int num) {
			IntStream.iterate(1,n->n+1)
			.limit(num)
			.map(n->n*n)				
			.forEach(System.out::println);
		}


	public static void main(String[] args) {
		printSquares(4);
		
		
	}
	}


