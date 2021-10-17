package mathematical;

public class ArithmeticAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNthTermOfAP(2,4,10));
	}
	
	public static int findNthTermOfAP(int n1, int n2, int n) {
		int diff = n2 - n1;
		int i = 2;
		if(n<2) {
			return n1;
		} else if(n<3) {
			return n2;
		} else {
			while(i<n) {
				n1 = n2;
				n2 = n2 + diff;
				i++;
			}
			return n2;
		}
	}

}
