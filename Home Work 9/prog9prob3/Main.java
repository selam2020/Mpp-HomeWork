package prog9prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	
	
		// 
	
	public int countWords(List<String> words, char c, char d, int len) {
	int count=  (int) words.stream()
			.filter(x->x.length()==len&&
			x.indexOf(c)!=-1&&
			x.indexOf(d)==-1)
			.count();
			return count;
			
}
	public static void main(String[] args) {
		Main n= new Main();
		List<String>list=Arrays.asList("cbob","Selam","Dan");
		//n.countWords(list, 'c', 'd', 4);
		System.out.println(n.countWords(list, 'c', 'd', 4));
		
}
}
