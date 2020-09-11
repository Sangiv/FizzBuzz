import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++){
			numbers.add(i);
		}
		
		numbers.forEach(i -> {String output = "";
							if(i % 3 == 0) output += "FIZZ";
							if(i % 5 == 0) output += "BUZZ";
							if(output.equals("")) System.out.println(i);
							else System.out.println(output);});
	}

}
