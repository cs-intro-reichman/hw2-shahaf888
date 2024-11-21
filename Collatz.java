// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String vOrC = args[1];
		int i = 1;
		int number = 1;
		int counter = 1;

		while (i <= n){

			counter = 1;
			number = i;

			if (number == 1) {
				if (vOrC.equals("v")) {
					System.out.print(number + " ");
				}
				number = number * 3 + 1;
				counter++;	
			}

			while (number != 1){
				if (vOrC.equals("v")) {
					System.out.print(number + " ");
				}
				if (number % 2 == 0){
					number = number / 2;
				}
				else {
					number = number * 3 + 1;
				}
				counter++;
			}
			if (vOrC.equals("v")){
				System.out.println(number + " (" + counter + ")");
			}

			i = i+1;

		}

		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");



	}
}
