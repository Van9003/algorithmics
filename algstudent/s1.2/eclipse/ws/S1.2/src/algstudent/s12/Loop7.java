package algstudent.s12;

public class Loop7 {

	public static void main(String arg[]) {
		long t1, t2;
		int nTimes = Integer.parseInt(arg[0]);

		System.out.println("n\ttime\trepetions\tcounter");

		for (long n = 100; n <= 6400; n *= 2) {
			long c = 0;
			t1 = System.currentTimeMillis();

			for (int repetitions = 1; repetitions <= nTimes; repetitions++)
				c = loop7(n);

			t2 = System.currentTimeMillis();

			System.out.println(n + "\t" + (t2 - t1) + "\t" + nTimes + "\t\t" + c);
		} // for
	} // main
	
	private static long loop7(long n) {
		long count = 0;
		
		for(long i=0; i < n; i++) {
			for(long j = 0; j < n; j++) {
				for(long k = 0; k<n; k++) {
					for(long h = 0; h < n; h++) {
						count++;
					}
				}
			}
		}
		
		return count;
	}
}
