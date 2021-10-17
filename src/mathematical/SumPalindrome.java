package mathematical;

public class SumPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test"+checkSumPalindrome(56));
	}
	
	public static boolean checkSumPalindrome(int num) {
		boolean isSumPalindrome = false;
		int sum = sumDigits(num);
		isSumPalindrome = checkPalindrome(sum);
		return isSumPalindrome;
	}
	
	public static int sumDigits(int num) {
		int digit = 1;
		int sum = 0;
		while(digit > 0) {
			digit = num%10;
			num = num/10;
			sum = sum + digit;
		}
		return sum;
	}
	
	public static boolean checkPalindrome(int sum) {
		String sumStr = String.valueOf(sum);
		boolean isPalindrome = false;
		StringBuffer strRevBuff = new StringBuffer("");
		for(int i = sumStr.length()-1; i>=0; i--) {
			strRevBuff.append(sumStr.charAt(i));
		}
		if(strRevBuff.toString().equals(sumStr)) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

}
