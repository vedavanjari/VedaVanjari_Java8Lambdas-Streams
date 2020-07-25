package Task;
import java.util.*;
import java.util.function.Function;
public class Average {
	  public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		List<Integer> arrList = Arrays.asList(arr);
		Float avg= getAverageList(arrList, (Integer x) -> x);
		System.out.println(avg);
	  }	

	  public static Float getAverageList(List<Integer> list, Function<Integer, Integer> 
	  function) {
																					
		Float res=0.0f;
		for (Integer s : list) {
		  res+=(function.apply(s));
		}

		return res/list.size();
	  }
}