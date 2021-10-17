package mathematical;

public class GeometricGP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNthTermOfGP(2,6,5));
	}
	
	public static int findNthTermOfGP(int n1, int n2, int n) {
		int ratio = n2/n1;
		int i = 2;
		if(n<2) {
			return n1;
		} else if(n<3) {
			return n2;
		} else {
			while(i<n) {
				n1 = n2;
				n2 = n2*ratio;
				i++;
			}
			return n2;
		}
	}

}
