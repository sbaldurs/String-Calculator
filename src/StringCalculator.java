
public class StringCalculator {
	public static int Add(String numbers) {
		int sum = 0;
		
		if(numbers.length() == 0) {
			return 0;
		}
		
		for(int i = 0; i < numbers.length(); i += 2) {
			if(numbers.charAt(i) == 'n') {
				i++;
			}
			sum += Character.getNumericValue(numbers.charAt(i));
					
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "1";
		String s3 = "1,2";
		String s4 = "1,2,3,4,5";
		String s5 = "1,2,3,4,5,6,7,8,9,10";
		String s6 = "1/n2,3";
		
		int sum1 = Add(s1);
		int sum2 = Add(s2);
		int sum3 = Add(s3);
		int sum4 = Add(s4);
		int sum5 = Add(s5);
		int sum6 = Add(s6);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		System.out.println(sum6);
	} 
}
