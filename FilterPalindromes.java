package Task;
import java.util.*;
import java.util.function.*;
class FindPalindromes {
	
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;  
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        } 
        return true; 
	}
}
public class FilterPalindromes {

	  public static void main(String[] args) {
		List<String> strList = Arrays.asList("madam","hello","epam","eye","level","test","civic");

		List palindromes = new ArrayList<>();
				
				palindromes=FilterPalindromes.filterList(strList, FindPalindromes::isPalindrome);
		System.out.println(palindromes);

		

	  }

	  private static List filterList(List<String> strList, FindPalindromes predicate) {
		// TODO Auto-generated method stub
		  List finalList = new ArrayList<>();

			for (String s : strList) {
			  if (predicate.test(s)) {
			  finalList.add(s);
			  }
			}
			return finalList;
		  }
	}
