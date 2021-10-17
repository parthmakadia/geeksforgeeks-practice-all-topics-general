package mathematical;

public class ClosestMaximumNumber {

	public static void main(String[] args) {
		System.out.println(closestMaximumNumber(-15, 6));
	}
	
	public static int closestMaximumNumber(int n, int m) {
		int previousNum = 0;
		if(n > 0) {
			int n1 = 1;
			int nearestDiff = 0;	
			boolean found = false;
			while(found == false) {
				int multiplyNum = n1*m;
				int calculatedDiff = Math.abs(multiplyNum - n);
				if(nearestDiff == 0) {
					nearestDiff = calculatedDiff;
				}else if(nearestDiff > 0 && nearestDiff > calculatedDiff) {
					nearestDiff = calculatedDiff;
					previousNum = multiplyNum;
				} else if(nearestDiff > 0 && nearestDiff == calculatedDiff) {
					if(Math.abs(previousNum) < Math.abs(multiplyNum)) {
						previousNum = multiplyNum;
					}
				} else {
					found = true;
					break;
				}
				n1++;
			}
		} else if(n < 0) {
			int n1 = -1;
			int nearestDiff = 0;	
			boolean found = false;
			while(found == false) {
				int multiplyNum = n1*m;
				int calculatedDiff = Math.abs(multiplyNum - n);
				if(nearestDiff == 0) {
					nearestDiff = calculatedDiff;
				}else if(nearestDiff > 0 && nearestDiff > calculatedDiff) {
					nearestDiff = calculatedDiff;
					previousNum = multiplyNum;
				} else if(nearestDiff > 0 && nearestDiff == calculatedDiff) {
					if(Math.abs(previousNum) < Math.abs(multiplyNum)) {
						previousNum = multiplyNum;
					}
				} else {
					found = true;
					break;
				}
				n1--;
			}
		}
		return previousNum;
	}

}
