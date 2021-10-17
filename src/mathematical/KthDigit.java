package mathematical;

public class KthDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findKthNumberAExpB(5,2,2));
	}
	
	public static char findKthNumberAExpB(int a, int b, int k) {
		String expNumberStr = String.valueOf((int)Math.pow(a, b));
		return expNumberStr.charAt(expNumberStr.length() - k);
	}

}
