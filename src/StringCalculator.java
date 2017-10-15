
public class StringCalculator {
	public static int Add(String numbers) {
		int sum = 0;
		
		if(numbers.length() > 3) {
			throw new java.lang.IllegalArgumentException("The input string is to big");
		}
		else if(numbers.length() == 0) {
			return 0;
		}
		
		for(int i = 0; i < numbers.length(); i += 2) {
			
			sum += Character.getNumericValue(numbers.charAt(i));
					
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "1";
		String s3 = "1,2";
		
		int sum1 = Add(s1);
		int sum2 = Add(s2);
		int sum3 = Add(s3);
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	} 
}
