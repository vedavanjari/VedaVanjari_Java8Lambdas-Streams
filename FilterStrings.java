package Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class FilterStrings {
   public static void main(String[] args) {

	List<String> names = Arrays.asList("a","ab","aaa","abc","abcd");
	Stream<String> allNames = names.stream();
	Stream<String> longNames = allNames.filter(str -> str.length() ==3 &&  str.charAt(0)=='a');
	longNames.forEach(str->System.out.print(str+" "));
  }
}