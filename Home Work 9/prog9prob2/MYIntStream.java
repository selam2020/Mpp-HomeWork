package prog9prob2;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class MYIntStream {
	public static void main(String[] args) {

		IntSummaryStatistics myIntStream = Stream.of(1, 2, 4, 6).mapToInt((x) -> x).summaryStatistics();
		System.out.println(myIntStream.getMax());
		System.out.println(myIntStream.getMin());

	}

}
