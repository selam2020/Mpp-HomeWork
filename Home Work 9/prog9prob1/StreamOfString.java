package prog9prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfString {

	public static void main(String[] args) {
	String streamstring= Stream.of("Bill","Thomas","Mary")
				.collect(Collectors.joining(","));
	System.out.println(streamstring);
	

	}

}
