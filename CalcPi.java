// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    double sumCalc = 1.0;
		int numOfTimes = Integer.parseInt(args[0]);
		int sheverToHishuv = 3;
		
		for (int i = 1; i < numOfTimes; i++){
			if (i % 2 == 1){
				sumCalc = sumCalc - (1.0 / sheverToHishuv);
			}
			else {
				sumCalc = sumCalc + (1.0 / sheverToHishuv);
			}
			sheverToHishuv = sheverToHishuv + 2;
		}

		double piJava = Math.PI;
		sumCalc = sumCalc * 4.0;
		System.out.println("pi according to Java: " + piJava);
		System.out.println("pi, approximated:     " + sumCalc);
	}
}
