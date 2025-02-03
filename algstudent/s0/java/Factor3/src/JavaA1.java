import java.util.ArrayList;
import java.util.List;

public class JavaA1 {
	
	public static void main(String[] args) {
		int n=1000;
		for(int i=0;i<7;i++) {
			long t1 = System.currentTimeMillis();
			Integer[] primes = listadoPrimos(n);
			long t2 = System.currentTimeMillis();
			System.out.println("n = "+n+"***time = " + (t2-t1) +"milliseconds");
			n=n*2;
		}
	}

	private static Integer[] listadoPrimos(int n) {
		List<Integer> primes = new ArrayList<>();
		for(int i = 2;i<=n;i++) {
			if(primoA1(i)) {
				primes.add(i);
			}
		}
		return primes.toArray(new Integer[primes.size()]);
	}

	private static boolean primoA1(int n) {
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
