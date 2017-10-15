
public class StringCalculator {
	public static int Add(String numbers) {
		int sum = 0;
		int count = 0;
		int numLength = 0;
		boolean inputCorrect = true;
		String comment = "Negatives not allowed: ";
		
		if(numbers.length() == 0) {
			return 0;
		}
		
		for(int i = 0; i < numbers.length(); i++) {
			if(numbers.charAt(i) == '-') {
				if(count > 0) {
					comment += ",";
				}
				count++;
				numLength = i;
				while(numbers.charAt(numLength) != ',' && numbers.charAt(numLength) != '\n' && numLength < (numbers.length() - 1)) {
						numLength++;
				}
				if(numLength == numbers.length()-1) {
					comment += numbers.substring(i);
				}
				else {
					comment += numbers.substring(i, i+numLength);
				}
				inputCorrect = false;
			}
		}
		
		if(!inputCorrect) {
			throw new java.lang.IllegalArgumentException(comment);
		}
		
		String currNumber = "";
		for(int i = 0; i < numbers.length(); i++) {
			
			if(numbers.charAt(i) != ',' && numbers.charAt(i) != '\n') {			
				currNumber += numbers.charAt(i);
			}
			else {
				if(Integer.parseInt(currNumber) <= 1000) {
					sum += Integer.parseInt(currNumber);
				}
				currNumber = "";
			}			
		}
		if(Integer.parseInt(currNumber) <= 1000) {
			sum += Integer.parseInt(currNumber);
		}
		currNumber = "";
		
		return sum;
	}
	
	public static void main(String[] args) {
		//String s1 = "";
		//String s2 = "1";
		String s3 = "1,2";
		String s4 = "1,2,3,4,5";
		String s5 = "1,2,3,4,5,6,7,8,9,10";
		String s6 = "1\n2,3";
		//String s7 = "-1,2";
		//String s8 = "2,-4,3,-5";
		String s9 = "1001,2";
		
		//int sum1 = Add(s1);
		//int sum2 = Add(s2);
		int sum3 = Add(s3);
		int sum4 = Add(s4);
		int sum5 = Add(s5);
		int sum6 = Add(s6);
		//int sum7 = Add(s7);
		//int sum8 = Add(s8);
		int sum9 = Add(s9);
		
		//System.out.println(sum1);
		//System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		System.out.println(sum5);
		System.out.println(sum6);
		//System.out.println(sum7);
		//System.out.println(sum8);
		System.out.println(sum9);
	} 
}
