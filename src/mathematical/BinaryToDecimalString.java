package mathematical;

public class BinaryToDecimalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryToInt("101100"));
	}
	
	public static int binaryToInt(String binaryStr) {
		return Integer.parseInt(binaryStr, 2);
	}

}
