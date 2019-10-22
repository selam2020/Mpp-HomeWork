package prog9prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Selection {
	
		public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
			// Implement the code
			//return stream.skip(m).limit(n+1-m);
			return stream.limit(n+1).skip(m);
			}
		
		
		private static Stream<String> nextStream() {
			return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
			"iii").stream();
		}
		
		public static void main(String[] args) {
			// Make three calls for the streamSection() method with different inputs
			// use nextStream() method to supply the Stream input as 
			//a first argument in streamSection() method
			Stream<String> str1=streamSection(nextStream(),1,5);
			str1.forEach(System.out::println);
			
			System.out.println();
			
			Stream<String> str2=streamSection(nextStream(),0,4);
			str2.forEach(System.out::println);
			
			System.out.println();
			
			Stream<String> str3=streamSection(nextStream(),6,9);
			str3.forEach(System.out::println);
		}
}