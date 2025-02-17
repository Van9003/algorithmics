package algstudent.s12;

public class Loop6 {
	public static void main(String arg[]) {
		long t1, t2;
		int nTimes = Integer.parseInt(arg[0]);

		System.out.println("n\ttime\trepetions\tcounter");

		for (long n = 100; n <= 6400; n *= 2) {
			long c = 0;
			t1 = System.currentTimeMillis();

			for (int repetitions = 1; repetitions <= nTimes; repetitions++)
				c = loop6(n);

			t2 = System.currentTimeMillis();

			System.out.println(n + "\t" + (t2 - t1) + "\t" + nTimes + "\t\t" + c);
		} // for
	} // main
	
	private static long loop6(long n) {
		long count = 0;
		long n1 = 0;
		while(n1 < n) {
			for(long i = 0; i<n;i++) {
				for(long j = 0; j< n; j++) {
					for(long k = 1; k<n;k*=2) {
						count++;
					}
				}
			}
			n1+=4;
		}
		
		return count;
	}
}
