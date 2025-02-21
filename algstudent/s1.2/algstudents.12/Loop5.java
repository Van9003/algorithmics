package algstudent.s12;

public class Loop5 {

	public static void main(String arg[]) {
		long t1, t2;
		int nTimes = Integer.parseInt(arg[0]);

		System.out.println("n\ttime\trepetions\tcounter");

		for (long n = 100; n <= 6400; n *= 2) {
			long c = 0;
			t1 = System.currentTimeMillis();

			for (int repetitions = 1; repetitions <= nTimes; repetitions++)
				c = loop5(n);

			t2 = System.currentTimeMillis();

			System.out.println(n + "\t" + (t2 - t1) + "\t" + nTimes + "\t\t" + c);
		} // for
	} // main

	private static long loop5(long n) {
		long count = 0;
		
		for(long i = 1; i<n; i*=2) {
			for(long j = n; j >=0; j-=2) {
				for(long k = 1; k<n;k*=2) {
					for(long h=0;h<n;h+=4) {
						count++;
					}
				}
			}
		}
		
		return count;
	}
	
}
