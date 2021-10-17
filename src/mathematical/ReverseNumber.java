package mathematical;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseNumber(145));
	}
	
	public static int reverseNumber(int num) {
		int rev = num;
		int revSum = 0;
		while(rev > 0) {
			int digit = rev%10;
			rev = rev/10;
			revSum = revSum*10 + digit;
		}
		return revSum;
	}

}
