// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    //taking the integer
		int nTimes = Integer.parseInt(args[0]);
		int countMore = 0;
		int countLess = 0;
		for (int i = 1; i <= nTimes; i++) {
			if (Math.random() > 0.5) {
				countMore = countMore + 1;
			}
			else {
				countLess = countLess + 1;
			}
		}
		double ratio = 0.0;
		//MAYBE WE SHOULD PUT ANOTHER IF IT DEPENDS ON THE GIT
		if (countLess != 0 && countMore !=0) {
			//System.out.println((double) countMore);
			//System.out.println((double) countLess);
			if (countLess >= countMore){
				ratio = ((double) countMore) / ((double) countLess);
			}
			else{
				ratio = ((double) countLess) / ((double) countMore);

			}
			System.out.println("> 0.5: " + countMore);
			System.out.println("<= 0.5: " + countLess);
			System.out.println("Ratio: " + ratio);

		}
		else {
			System.out.println("> 0.5: " + countMore);
			System.out.println("<= 0.5: " + countLess);

		}

	}
}
