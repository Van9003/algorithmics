package algstudent.s3;

public class Subtraction5 {

	// a = 3, b = 2, k = 0
	//O(3^(n/2))
	public static long rec5(int n) {
		long cont = 0;
		if (n <= 0)
			cont++;
		else {
			cont++; // O(1)
			rec5(n - 2);
			rec5(n - 2);
			rec5(n - 2);
		}
		return cont;
	}
		
	public static void main(String arg[]) {
		long t1, t2, cont = 0;
		int nTimes = Integer.parseInt(arg[0]);
		for (int n = 30; n <= 60; n+=2) {
			t1 = System.currentTimeMillis();

			for (int repetitions = 1; repetitions <= nTimes; repetitions++)
				cont = rec5(n);

			t2 = System.currentTimeMillis();

			System.out.println("n=" + n + "**TIME=" + (t2 - t1) + "**cont=" + cont);
		} // for
	} // main
}
