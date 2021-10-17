package mathematical;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkArmstrong(111));
	}
	
	public static String checkArmstrong(int number) {
		int sum = 0;
		int digit = 1;
		int armNumber = number;
		String isArmStrong = "No";
		while(digit > 0) {
			digit = armNumber%10;
			armNumber = armNumber/10;
			sum = sum + (digit * digit * digit);
			if(sum == number) {
				isArmStrong = "Yes";
			}
		}
		return isArmStrong;
	}

}
